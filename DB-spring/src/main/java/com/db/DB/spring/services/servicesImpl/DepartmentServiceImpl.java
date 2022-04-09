package com.db.DB.spring.services.servicesImpl;

import com.db.DB.spring.entities.Department;
import com.db.DB.spring.models.DepartmentModel;
import com.db.DB.spring.repositories.DepartmentRepository;
import com.db.DB.spring.repositories.EmployeeRepository;
import com.db.DB.spring.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getById(Long id) {
        return departmentRepository.getById(id);
    }
    @Override
    public Department create(DepartmentModel departmentModel) {
        Department department = new Department();
        department.setDnumber(departmentModel.getDnumber());
        department.setDname(departmentModel.getDname());
        department.setMgr_start_date(departmentModel.getMgr_start_date());
        if(departmentModel.getMgr_id() != null)
            department.setMrg_ssn(employeeRepository.getOne(departmentModel.getMgr_id()));
        return departmentRepository.save(department);
    }
    @Override
    public Department update(DepartmentModel departmentModel) {
        return departmentRepository.findById((long) departmentModel.getDnumber())
                .map(newDept -> {
                    newDept.setDnumber(departmentModel.getDnumber());
                    newDept.setDname(departmentModel.getDname());
                    newDept.setMgr_start_date(departmentModel.getMgr_start_date());
                    if(departmentModel.getMgr_id() != null)

                        newDept.setMrg_ssn(employeeRepository.getOne(departmentModel.getMgr_id()));

                    return departmentRepository.save(newDept);
                }).orElseThrow(() -> new RuntimeException());

    }
}
