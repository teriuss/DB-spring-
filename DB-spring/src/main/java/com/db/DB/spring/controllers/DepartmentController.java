package com.db.DB.spring.controllers;

import com.db.DB.spring.models.DepartmentModel;
import com.db.DB.spring.services.DepartmentService;
import com.db.DB.spring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/all")
    public String getAllDepartments(Model model) {
        model.addAttribute("departments", departmentService.findAll());
        return "department/department_list";
    }
    @GetMapping("/create")
    public String getDeptCreateForm(Model model) {
        model.addAttribute("title", "Добавление отдела");
        model.addAttribute("employees", employeeService.findAll());
        return "department/department_form";
    }
    @PostMapping("/create")
    public String createDept(@ModelAttribute("department") DepartmentModel
                                     departmentModel) {
        departmentService.create(departmentModel);
        return "redirect:all";
    }
    @GetMapping("/update/{dnumber}")
    public String getDeptUpdateForm(@PathVariable("dnumber") Long Dnumber, Model
            model) {
        model.addAttribute("title", "Изменение области");
        model.addAttribute("department", departmentService.getById(Dnumber));
        model.addAttribute("employees", employeeService.findAll());
        return "department/department_form";
    }
    @PostMapping("/update")
    public String updateDept(@ModelAttribute("department") DepartmentModel
                                     departmentModel) {
        departmentService.update(departmentModel);
        return "redirect:all";
    }
}

