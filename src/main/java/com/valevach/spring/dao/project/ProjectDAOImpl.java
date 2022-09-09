package com.valevach.spring.dao.project;

import com.valevach.spring.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProjectDAOImpl implements ProjectDAO{
    @Override
    public void create(Project entity) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Project.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        }
    }

    @Override
    public Project read(Integer id) {
        return null;
    }

    @Override
    public void delete(Project entity) {

    }

    @Override
    public void update(Project entity) {

    }
}
