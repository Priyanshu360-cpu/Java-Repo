package com.ibm.oops.staticdef;
class Point{
	static int a;
	Point(){
		this.a=5;
		Point p=new Point();
		p.a=10;
	}
	static {
		a=9;
		System.out.println("Static called");
	}
	{
		System.out.println("Inline Block called");
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Point.a=5;
		System.out.println(Point.a);
	}
}