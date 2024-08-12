package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Address;

public class AddressDAO extends GenericDAO<Address> {
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
