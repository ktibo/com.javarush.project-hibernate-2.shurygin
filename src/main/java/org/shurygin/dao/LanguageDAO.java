package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Language;

public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
