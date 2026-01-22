package com.ibm.arrays;

class Point{
	public int x;//instance variable
	public int y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
class Point1{
	static int value;
	Point1(){
		System.out.println("Construct called");
	}
	static {
		System.out.println("Static isntializer called");
		value=10;
}
	{		
		System.out.println(" Inline Block called");
	}
}
class Test{
	static int num;//class scope//class variable
	public void testing() {
		int value=0;
		System.out.println(value);//method scope//local scope
	}
}
public class Application
{
	int var1;
	public static void main( String[] args )
	{
		new Point1()
;		Application apple=new Application();
		apple.var1=5;
		Test test1=new Test();
		test1.testing();
		Test test2=new Test();
		test1.num=5;
		System.out.println(test1.num);
		test2.num=10;
		System.out.println(test1.num);
		Test.num=9;
		System.out.println(Test.num);
		int[][] nums;
		nums=new int[3][2];
		nums[1][1]=4;
		for(int[] firstData: nums) {
			for(int secondData:firstData)
				System.out.print(secondData);
			System.out.println();
		}
//		Point[] points;
//		points=new Point[3];
//		for(int i=0;i<points.length;i++)
//		points[i]=new Point(i+2,2*(i+2));
//		for(Point point:points) {
//			System.out.println(point.x+" , "+point.y);
//		}
//		int num[]=new int[5];
//		for(int i:num) {
//			System.out.println(i);
//		
//		}
	}
}