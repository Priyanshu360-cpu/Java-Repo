package com.ibm.interfaces;

public class Application
{
	public void permissionTOFly(Flyer f) {
		f.fly();
	}
	public static void main( String[] args )
	{
		Application ab = new Application();
		Airplane airplane = new Airplane();
		ab.permissionTOFly(airplane);
	}
}