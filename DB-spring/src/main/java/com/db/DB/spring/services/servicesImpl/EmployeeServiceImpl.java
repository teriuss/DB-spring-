package com.db.DB.spring.services.servicesImpl;

import com.db.DB.spring.entities.Employee;
import com.db.DB.spring.models.EmployeeModel;
import com.db.DB.spring.repositories.EmployeeRepository;
import com.db.DB.spring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee create(EmployeeModel employeeModel) {
        return null;
    }

    @Override
    public Employee update(EmployeeModel categoryModel) {
        return null;
    }

    @Override
    public Employee getById(String id) {
        return employeeRepository.getById(id);
    }


}
