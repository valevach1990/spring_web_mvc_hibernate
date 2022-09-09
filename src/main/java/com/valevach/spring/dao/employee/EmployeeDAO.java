package com.valevach.spring.dao.employee;

import com.valevach.spring.dao.BaseDAO;
import com.valevach.spring.entity.Employee;


public interface EmployeeDAO extends BaseDAO<Employee> {
    void  findAll ();
}
