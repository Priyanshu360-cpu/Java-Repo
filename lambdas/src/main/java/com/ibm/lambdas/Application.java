package com.ibm.lambdas;

import java.util.Arrays;
import java.util.List;

interface Printer{
	public void printing(String printerName);
}
class Process{
	public void execute(String printerName,Printer printer) {
	printer.printing(printerName);
	}
};
class Stream{
	public static void streams() { 
	List<Integer> arr1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	arr1.forEach((number)->System.out.println(number));
	arr1.forEach(System.out::print);
	arr1.stream().map(element->String.valueOf(element)).forEach(System.out::println);
	System.out.println(arr1.stream().reduce(0,(total,number)->Integer.sum(total,number)));
	}
	
}
public class Application
{
	public static void main( String[] args )
	{
		Process process=new Process();
//		process.execute(new Printer() {
//			@Override
//			public void printing() {
//				System.out.println("Hp Printer pritning");
//			}
//		});
//		process.execute(()->System.out.println("Printing"))// without any parameter;
		((Runnable) () -> System.out.println("hi")).run();
        process.execute("LG", System.out::println);
        process.execute("Windows", Application::printIt);
		process.execute("HP",(printerName)->System.out.println(printerName+" Printing"));
		process.execute("Cannon",(printerName)->System.out.println(printerName+" Printing"));
Stream.streams();
	}
	static void printIt(String name) {
		System.out.println(name);
	}
}