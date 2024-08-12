package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Inventory;

public class InventoryDAO extends GenericDAO<Inventory> {
    public InventoryDAO( SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
