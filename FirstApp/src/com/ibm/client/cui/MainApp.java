/**
 * 
 */
package com.ibm.client.cui;
import java.sql.*;
import java.util.Date;
import java.*;
/**
 * 
 */
class Point{
	public  int x;
	public  int y;
	Point(){
		
	};
}

public class MainApp {
	public static void main(String[] args) {
		Point point1=new Point();
		Point point2=point1;
		point1.x=3;point1.y=5;
		point2.x=99;point2.y=99;
		int num1=45;
		float value=10.1f;
		String str1=new String( "IBM");
		String str2=new String("IBM");
		System.out.println(str1.equals(str2));
		System.out.println("Hello IBMer!! Welcome to Bangalore "+point1.x+" , "+point1.y+" , "+value+ " , "+str1);
		
		}
	}
