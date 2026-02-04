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
@PostMapping("/login")
public String Login(
        @Valid @ModelAttribute("employee") Employee employee,BindingResult result,Model model) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.ibm.webapp.config.DatabaseConfig.class);
if(employeeService.employeeExists(employee.getEmail())) {
    model.addAttribute("employee", employeeService.findEmployee(employee.getEmail()));
    
	return "save-form";}
else {
	result.rejectValue(
            "email",
            "error.employee",
            "No User with this email exists");
	return "employee-form";} 
}
    @PostMapping("/save")
    public String saveForm(
            @Valid @ModelAttribute("employee") Employee employee,
            BindingResult result) {

        if (result.hasErrors()) {
            return "employee-form"; // validation errors shown here
        }
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.ibm.webapp.config.DatabaseConfig.class);
		try {
		employeeService.insertEmployee(employee);
		}catch(org.springframework.dao.DuplicateKeyException e) {
			result.rejectValue(
	                "email",
	                "error.employee",
	                "Email already exists");
	        return "employee-form";

		}
        return "save-form";
    }
    
    @PostMapping("/delete")
    public String deleteForm(
            @ModelAttribute("employee") Employee employee,
            BindingResult result) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.ibm.webapp.config.DatabaseConfig.class);

        try {
            int rows = employeeService.deleteEmployee(employee.getEmail());

            if (rows == 0) {
                // no record deleted → email not found
                result.rejectValue(
                        "email",
                        "error.delete",
                        "Employee does not exist");
                return "save-form";
            }

        } catch (Exception e) {
        	e.printStackTrace()
;            result.rejectValue(
                    "email",
                    "error.delete",
                    "Unable to delete employee");
            return "save-form";
        }

        return "employee-form"; // back to main form after successful delete
    }

}
