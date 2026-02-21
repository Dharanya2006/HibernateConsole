# Streaming Platform (Console App) — Hibernate + Oracle

A simple Java console application to manage Users, Subscriptions, and Payments using **Hibernate ORM** with **Oracle 11g**.
This project supports:
- Auto-creating users (no manual DB insert needed)
- Creating subscriptions
- Processing payments
- Oracle 11g compatible SQL (no `IDENTITY`, no `FETCH FIRST`)

---

## Tech Stack
- Java (JDK 17+ recommended)
- Hibernate ORM 6.x
- Oracle Database 11g (11.2)
- JDBC (Oracle Driver)
- HikariCP (optional, if included)

---

## Project Structure (Important Packages)
- `com.stream.bean` → Entity classes (`User`, `Subscription`, `Payment`)
- `com.stream.DAO` → DAO classes (`UserDAO`, `SubscriptionDAO`, `PaymentDAO`)
- `com.stream.service` → Business logic (`SubscriptionService`)
- `com.stream.util` → `HibernateUtil` + custom exceptions
- `com.stream.app` → `StreamMain` (console entry point)

---
<img width="1099" height="530" alt="Screenshot 2026-02-21 103045" src="https://github.com/user-attachments/assets/396aa77c-9f9d-4cdc-b819-1a2e679e9654" />
<img width="887" height="844" alt="Screenshot 2026-02-21 103056" src="https://github.com/user-attachments/assets/a8097d45-2560-4a95-9f5b-d477a6c2ff39" />
<img width="982" height="802" alt="Screenshot 2026-02-21 103115" src="https://github.com/user-attachments/assets/ba2f81ed-382b-4e07-a955-a7dfde23fbbf" />
<img width="831" height="731" alt="Screenshot 2026-02-21 103123" src="https://github.com/user-attachments/assets/5dcc0d36-9168-4073-828e-84c881414db9" />
<img width="1100" height="215" alt="Screenshot 2026-02-21 103255" src="https://github.com/user-attachments/assets/b72960d0-143c-4e63-a735-e8893aa04da2" />




