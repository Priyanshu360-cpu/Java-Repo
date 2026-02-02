package com.ibm.internationalization;

import java.lang.reflect.Constructor;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Application
{
	public static void main( String[] args )
	{
		double d=123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
		System.out.println(nf.format(d));
		System.out.println(Locale.ITALY.getDisplayLanguage());
		System.out.println(nf1.format(d));
		Locale defaultLocale= new Locale("fr");
		System.out.println(defaultLocale);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("Messages",defaultLocale);
		System.out.println("English: ");
		
		printMessages(resourceBundle);
		System.out.println("Annotation Information");
		Class<CustomAnnotationUsage> clazz= CustomAnnotationUsage.class;
		CustomAnnotation classAnn = clazz.getAnnotation(CustomAnnotation.class);
		if(clazz!=null) {
			printAnnotation("Class",classAnn);
		}
		try {
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			CustomAnnotation constrAnn = constructor.getAnnotation(CustomAnnotation.class);
			if(constrAnn!=null) {
				printAnnotation("Constructor",constrAnn);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	private static void printAnnotation(String element, CustomAnnotation ann) {
		System.out.println("Element:" + element);
		System.out.println("Name:" + ann.name());

	}
	private static void printMessages(ResourceBundle bundle) {
		System.out.println("Greetings: "+ bundle.getString("greeting"));
		System.out.println("Question: "+ bundle.getString("question"));
		System.out.println("Farewell: "+ bundle.getString("farewell"));
		
	}
}