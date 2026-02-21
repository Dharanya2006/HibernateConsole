package com.stream.bean;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "PaymentTBL")
@SequenceGenerator(name = "pay_seq_gen", sequenceName = "PAYMENTSEQ", allocationSize = 1)
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pay_seq_gen")
    @Column(name = "PAYMENTID")
    private Long paymentID;

    @Column(name = "SUBSCRIPTIONID", nullable = false)
    private Integer subscriptionID;

    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PAYMENTDATE", nullable = false)
    private Date paymentDate;

    @Column(name = "PAYMENTMETHOD", nullable = false, length = 50)
    private String paymentMethod;

    @Column(name = "STATUS", nullable = false, length = 20)
    private String status;

    public Long getPaymentID() { 
    	return paymentID; 
    	}
    public void setPaymentID(Long paymentID) {
    	this.paymentID = paymentID; 
    	}

    public Integer getSubscriptionID() { 
    	return subscriptionID; 
    	}
    public void setSubscriptionID(Integer subscriptionID) { 
    	this.subscriptionID = subscriptionID; 
    	}

    public Double getAmount() {
    	return amount; 
    	}
    public void setAmount(Double amount) { 
    	this.amount = amount;
    	}

    public Date getPaymentDate() {
    	return paymentDate; 
    	}
    public void setPaymentDate(Date paymentDate) { 
    	this.paymentDate = paymentDate; 
    	}

    public String getPaymentMethod() { 
    	return paymentMethod; 
    	}
    public void setPaymentMethod(String paymentMethod) { 
    	this.paymentMethod = paymentMethod; 
    	}

    public String getStatus() { 
    	return status; 
    	}
    public void setStatus(String status) {
    	this.status = status; 
    	}

    @Override
    public String toString() {
        return "Payment [paymentID=" + paymentID + ", subscriptionID=" + subscriptionID + ", amount=" + amount
                + ", paymentDate=" + paymentDate + ", paymentMethod=" + paymentMethod + ", status=" + status + "]";
    }
}