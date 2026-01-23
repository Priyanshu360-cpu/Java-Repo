package com.ibm.oops.payroll;

public class HR {
           public static Employee netpay(String Details) {
        	   if(Details.equalsIgnoreCase("I")) {
        		   return new Intern();
        	   }else if(Details.equalsIgnoreCase("P"))
        		   return new PermanentEmployee();
        	   else if (Details.equalsIgnoreCase("F"))
        		   return new Freelancer();
        	   return null;
           }
}
