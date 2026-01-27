package com.ibm.oops.TyppeCasting;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
class Base{
	Base(int x){
		System.out.println(x);
	}
	public void test(int y) {
		System.out.println(y);
	}
}
class Derived extends Base{
	Derived(int x){
		super(x);
	}
	public void test(int z) {
		super.test(z);
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Derived derived=new Derived(2);
		float f=(float) 10.2;
		Calendar calendar = new GregorianCalendar();//upscale casting
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		GregorianCalendar gregprianCalendar = (GregorianCalendar) calendar;
		List <String> list = new LinkedList<String>();
		if(list instanceof ArrayList) {
			ArrayList<String> arryaList= (ArrayList<String>) list;
		}
	}
}