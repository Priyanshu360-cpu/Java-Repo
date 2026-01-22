package com.ibm.encapsulation;

import com.ibm.encapsulation.pack1.Base1;

class Student{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
			this.age=age;
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Base1 base1=new Base1();
		base1.pubf=1;
		Student student=new Student();
		student.setAge(-1);
		System.out.println(student.getAge());
		student.setAge(10);
		System.out.println(student.getAge());
	}
}