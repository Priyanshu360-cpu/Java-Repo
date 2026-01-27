package com.ibm.generics;
class Point<T>{
	private T x;
	private T y;
	Point(T x,T y){
		this.x=x;
		this.y=y;
	}
	public void setx(T x) {
		this.x=x;
	}
	public T getx() {
		return x;
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Point<Integer> point = new Point<Integer>(2,3);
		System.out.println(point.getx());
	}
}