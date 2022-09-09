package com.valevach.spring.dao.details;

import com.valevach.spring.entity.Details;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DetailsDAOImpl implements DetailsDAO{
    @Override
    public void create(Details entity) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Details.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        }
    }

    @Override
    public Details read(Integer id) {
        return null;
    }

    @Override
    public void delete(Details entity) {

    }

    @Override
    public void update(Details entity) {

    }
}
