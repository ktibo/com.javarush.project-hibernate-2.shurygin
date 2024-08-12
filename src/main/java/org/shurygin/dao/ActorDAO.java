package org.shurygin.dao;

import org.hibernate.SessionFactory;
import org.shurygin.entities.Actor;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
