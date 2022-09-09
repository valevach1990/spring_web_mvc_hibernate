package com.valevach.spring.dao.employee;



import com.valevach.spring.entity.Details;
import com.valevach.spring.entity.Employee;
import com.valevach.spring.entity.Position;
import com.valevach.spring.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void create(Employee entity) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .addAnnotatedClass(Position.class)
                .addAnnotatedClass(Project.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        }
    }

    @Override
    public Employee read(Integer id) {
        Employee employee = null;
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            employee = session.get(Employee.class, id);
            session.getTransaction().commit();
        }
        return employee;
    }

    @Override
    public void delete(Employee entity) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Query query = session.createQuery("DELETE FROM Employee  " +
                    "WHERE name = :nameParam and surName = :surNameParam");
          //  query.setParameter("surNameParam", entity.getSurName());
            query.setParameter("nameParam",entity.getName());
            query.executeUpdate();
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Employee entity) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//          Employee emp = (Employee) session.createQuery("FROM Employee WHERE name = " + entity.getName()
//                    + " and surname = " + entity.getSurName() + " and project = " + entity.getProject()
//                    + " and position = " + entity.getPosition());
            Employee employee = session.get(Employee.class, entity.getId());
            employee.setName("Ivan!!!");
            session.getTransaction().commit();
        }

    }

    @Override
    public void findAll() {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employeeList = session.createQuery("FROM Employee").getResultList();
            for (Employee e : employeeList) {
                System.out.println(e);
            }
            session.getTransaction().commit();
        }
    }
}
