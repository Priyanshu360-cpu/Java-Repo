package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.beans.SpellChecker;
import com.ibm.spring.beans.TextEditor;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SpellChecker spellChecker1 = (SpellChecker) context.getBean("spellChecker1");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
		SpellChecker spellChecker2 = (SpellChecker) context.getBean("spellChecker1");
		SpellChecker spellChecker3 = (SpellChecker) context.getBean("spellChecker1");


	}
}