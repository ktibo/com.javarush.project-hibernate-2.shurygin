package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.shurygin.entities.City;

public class CityDAO extends GenericDAO<City> {
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(String city) {
        Query<City> query = getCurrentSession().createQuery("select c from City c where c.name = :name", City.class);
        query.setParameter("name", city);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
