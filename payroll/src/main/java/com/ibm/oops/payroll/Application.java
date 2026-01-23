package com.ibm.oops.payroll;

public class Application
{
	public static void main( String[] args )
	{
		Employee emp=new PermanentEmployee();
		emp.netPay();
		Employee hiring=HR.netpay("I");//upstreaming
		{
		if(hiring!=null)
			hiring.netPay();
		}
		{
		hiring=HR.netpay("P");
	   if(hiring!=null) 
			hiring.netPay();
		}
		hiring=HR.netpay("F");
		if(hiring!=null) 
			hiring.netPay();
		hiring=(Freelancer)hiring;//downstreaming
		hiring.netPay();
	}
}