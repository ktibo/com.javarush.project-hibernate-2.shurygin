package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Staff;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO( SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
