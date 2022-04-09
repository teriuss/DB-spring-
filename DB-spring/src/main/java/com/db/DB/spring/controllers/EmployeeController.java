package com.db.DB.spring.controllers;

import com.db.DB.spring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    @RequestMapping(path="/employee")
    public class EmployeeController {
        @Autowired
        private EmployeeService employeeService;
        @GetMapping("/all")
        public String getAllUsers(Model model) {
            model.addAttribute("employees", employeeService.findAll());
            return "employee/employee_list";
        }
}
