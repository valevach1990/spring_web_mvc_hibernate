package com.valevach.spring;

import com.valevach.spring.dao.employee.EmployeeDAOImpl;
import com.valevach.spring.dao.position.PositionDAOImpl;
import com.valevach.spring.entity.Details;
import com.valevach.spring.entity.Employee;
import com.valevach.spring.entity.Position;

public class Test {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        PositionDAOImpl positionDAO = new PositionDAOImpl();
        Employee emp = new Employee("igor");
        Details details = new Details("otto", "OTTo_email", "1000");
        Position test =positionDAO.read(1);
        emp.setEmpDetails(details);
        test.addEmpToDep(emp);
        employeeDAO.create(emp);
    }
}
