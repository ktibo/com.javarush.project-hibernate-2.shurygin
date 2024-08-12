package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Country;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO( SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
