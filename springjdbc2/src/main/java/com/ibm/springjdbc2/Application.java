package com.ibm.springjdbc2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.springjdbc2.config.DatabaseConfig;
import com.ibm.springjdbc2.dao.DepartmentDao;
import com.ibm.springjdbc2.dao.EmployeeDao;
import com.ibm.springjdbc2.model.Department;
import com.ibm.springjdbc2.model.Employee;

public class Application
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfig.class);

		DepartmentDao departmentDao = ctx.getBean(DepartmentDao.class);
		EmployeeDao employeeDao = ctx.getBean(EmployeeDao.class);

		Department d = new Department();
		d.setName("IT");
		departmentDao.save(d);

		Employee e = new Employee();
		e.setName("Arafath");
		e.setSalary(15000);
		e.setDepartmentId(1);
		employeeDao.save(e);

		employeeDao.findAll().forEach(emp -> System.out.println(emp.getName() + " - " + emp.getDepartmentId()+ " - " + emp.getSalary()));

		ctx.close();
	}
}