package com.valevach.spring.dao.position;


import com.valevach.spring.entity.Employee;
import com.valevach.spring.entity.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PositionDAOImpl implements PositionDAO {
    @Override
    public void create(Position entity) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Position.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        }
    }

    @Override
    public Position read(Integer id) {
        Position position = null;
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Position.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            position = session.get(Position.class, id);
            session.getTransaction().commit();
        }
        return position;
    }

    @Override
    public void delete(Position entity) {

    }

    @Override
    public void update(Position entity) {

    }
}
