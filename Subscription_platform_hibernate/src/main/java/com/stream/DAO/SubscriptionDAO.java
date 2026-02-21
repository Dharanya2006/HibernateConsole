package com.stream.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.stream.bean.Subscription;
import com.stream.util.HibernateUtil;

public class SubscriptionDAO {

    public boolean recordSubscription(Subscription sub) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(sub);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
    }

    public Subscription findActiveSubscriptionByUser(String userID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Subscription s WHERE s.userID = :uid AND s.status = 'ACTIVE'",Subscription.class).setParameter("uid", userID).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Subscription findLatestSubscription() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createNativeQuery("SELECT * FROM (SELECT * FROM SubscriptionTBL ORDER BY SUBSCRIPTIONID DESC) WHERE ROWNUM = 1",Subscription.class).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Subscription findSubscriptionByID(int subscriptionID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Subscription.class, subscriptionID);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean updateSubscriptionStatus(int subscriptionID, String status) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            Subscription s = session.get(Subscription.class, subscriptionID);
            if (s == null) return false;
            s.setStatus(status);
            session.merge(s);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
    }
}