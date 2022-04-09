package com.db.DB.spring.services;

import com.db.DB.spring.entities.Department;
import com.db.DB.spring.models.DepartmentModel;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();

    Department create(DepartmentModel categoryModel);

    Department update(DepartmentModel categoryModel);

    Department getById(Long id);
}
