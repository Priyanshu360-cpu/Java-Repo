package com.ibm.classobjects;

import com.ibm.classobjects.mammals.Man;

public class Application
{
	public static void main( String[] args )
	{
		Man man = new Man();
		man.leftEye.color="green";
		man.rightEye.color="black";
		man.leftEye.power=8.9f;
		man.rightEye.power=1.0f;
	}
}