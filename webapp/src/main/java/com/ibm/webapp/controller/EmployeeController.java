package com.ibm.webapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.webapp.model.Employee;
import com.ibm.webapp.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }

    @PostMapping("/save")
    public String saveForm(
            @Valid @ModelAttribute("employee") Employee employee,
            BindingResult result) {

        if (result.hasErrors()) {
            return "employee-form"; // validation errors shown here
        }
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.ibm.webapp.config.DatabaseConfig.class);
		employeeService.insertEmployee(employee);
        return "save-form";
    }
}
