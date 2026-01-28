package com.ibm.lambdas;
interface Printer{
	public void printing(String printerName);
}
class Process{
	public void execute(String printerName,Printer printer) {
	printer.printing(printerName);
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

	}
	static void printIt(String name) {
		System.out.println(name);
	}
}