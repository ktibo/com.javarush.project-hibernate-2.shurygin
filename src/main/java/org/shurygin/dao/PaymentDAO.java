package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Payment;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO( SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
