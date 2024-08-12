package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.FilmText;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO( SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
