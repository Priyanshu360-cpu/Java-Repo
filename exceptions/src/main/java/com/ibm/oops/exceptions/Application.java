package com.ibm.oops.exceptions;
class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		return "Not allowed for voting";
	}
}
class Voting{
	public void isallowed(int age)throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}
public class Application
{
	public static void main( String[] args )
	{
	Voting ob=new Voting();
	try {
		ob.isallowed(18);
	}catch(IllegalAgeException exception) {
		exception.printStackTrace();
		System.out.println("Not allowed to vote");
	}finally {
		System.out.println("All cleared");
	}
		try {
	System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));	
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException exception) {
			System.out.println("You need to provide 2 valid numbers");
		}catch(ArithmeticException exception) {
			System.out.println("Can't dive by zero");
		}catch(Exception exception) {
			System.out.println("Unknown exception occured");
		}
		System.out.println("The End");
	}
}