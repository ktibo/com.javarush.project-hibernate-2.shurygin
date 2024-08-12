package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Customer;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO( SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
