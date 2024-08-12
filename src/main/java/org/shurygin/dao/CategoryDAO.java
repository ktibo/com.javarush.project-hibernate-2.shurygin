package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Category;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
