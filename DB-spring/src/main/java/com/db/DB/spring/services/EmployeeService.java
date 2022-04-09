package com.db.DB.spring.services;

import com.db.DB.spring.entities.Employee;
import com.db.DB.spring.models.EmployeeModel;
import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee create(EmployeeModel categoryModel);

    Employee update(EmployeeModel categoryModel);

    Employee getById(String id);

}
