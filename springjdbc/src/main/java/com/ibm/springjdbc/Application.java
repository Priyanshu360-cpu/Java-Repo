package com.ibm.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.springjdbc.model.Employee;
import com.ibm.springjdbc.templates.EmployeeJDBCTemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeJDBCTemplate employeeJDBCTemplate=(EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplateBean");
		System.out.println("Records Creation");
		employeeJDBCTemplate.update(1, "Smitha", "Raj", 10000);
	    employeeJDBCTemplate.delete(2);
//		employeeJDBCTemplate.create("Allen", "Peter", 18000);
		
		System.out.println("Listing Muliple Records");
		List<Employee> employees=employeeJDBCTemplate.listEmployees();
		for(Employee employee:employees) {
			System.out.print("Id: "+employee.getId());
			System.out.print(", First Name : "+employee.getFirstName());
			System.out.print(", Last Name : "+employee.getLastName());
			System.out.println(", Salary : "+employee.getSalary());



		}
	}
}