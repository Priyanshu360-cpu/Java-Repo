package com.ibm.generics;

import java.util.ArrayList;
import java.util.Iterator;

class Point<T extends Number>{
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
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("hi");
		arrayList.add("how are you?");
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}