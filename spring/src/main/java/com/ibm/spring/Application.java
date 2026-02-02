package com.ibm.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.beans.JavaCollection;
import com.ibm.spring.beans.SpellChecker;
import com.ibm.spring.beans.TextEditor;
import com.ibm.spring.config.BeamConfig;
import com.ibm.spring.services.OrderService;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		ApplicationContext context1=new AnnotationConfigApplicationContext(BeamConfig.class);
//		SpellChecker spellChecker1 = (SpellChecker) context.getBean("spellChecker1");
OrderService orderService=(OrderService)context.getBean("orderService");
orderService.makePayment(1000.50);
System.out.println("the end");
//      TextEditor textEditor = (TextEditor) context.getBean("textEditor");
      
//      textEditor.spellCheck();
//		SpellChecker spellChecker2 = (SpellChecker) context.getBean("spellChecker1");
//		SpellChecker spellChecker3 = (SpellChecker) context.getBean("spellChecker1");
//
//		ClassPathXmlApplicationContext cpxaContext = (ClassPathXmlApplicationContext)context;
//		
//		cpxaContext.registerShutdownHook();
//		
//		JavaCollection jc=(JavaCollection) context.getBean("javaCollection");
//		System.out.println("List address");
//		List<String> listAddress = jc.getAddressList();
//		listAddress.forEach(System.out::print);
//		jc.getAddressList();
//		System.out.println("");
//		System.out.println("Map address");
//Map<String,String> MapAddress=jc.getAddressMap();
//		System.out.println(MapAddress);
//		Set<String> AddressSet=jc.getAddressSet();
//		System.out.println(AddressSet);
//		Properties properties=jc.getAddressProp();	
//		System.out.println(properties);
	}
}