package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.shurygin.entities.Film;

public class FilmDAO extends GenericDAO<Film> {
    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }

    public Film getFirstAvalibleFilm() {
        Query<Film> query = getCurrentSession().createQuery(
                "select f from Film f where f.id not in (select distinct film.id from Inventory)", Film.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
