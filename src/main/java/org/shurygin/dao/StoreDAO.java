package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Store;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO( SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
