package com.alena.dao;

import com.alena.entity.Employee;
import com.mysql.cj.xdevapi.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDaoImplementation implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {


        return null;
    }
}
