package com.db.DB.spring.controllers;

import com.db.DB.spring.services.DepartmentService;
import com.db.DB.spring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }


}
