package com.ibm.enums;

import com.ibm.enums.types.Apples;

public class Application
{
	public static void main( String[] args )
	{
		Apples apple;
		apple=Apples.FUJI;
		System.out.println(apple);
		Apples[] apples=Apples.values();
		for(Apples apple1:apples) 
		System.out.println(apple1+" costs "+apple1.getPrice());
		Apples gold_del=Apples.valueOf("GOLDEN_DEL");
		System.out.println(gold_del);
	}
}////////////