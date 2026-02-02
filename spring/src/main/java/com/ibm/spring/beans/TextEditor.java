package com.ibm.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("textEditor")
public class TextEditor {
 private SpellChecker spellChecker;
 public TextEditor() { 
	 System.out.println("Inisde textEditor no-args constructor");
 }
 
 public TextEditor(SpellChecker spellChecker) {
	 System.out.println("Inside TextEditor constructor");
	 this.spellChecker=spellChecker;
 }
 @Autowired
 public void setSpellChecker(SpellChecker spellChecker) {
	 this.spellChecker=spellChecker;
 }
public void init() {
	System.out.println("TextEditor Initialized");
}
public void destroy() {
	System.out.println("Text Editor Destoyed");
}
 public void spellCheck() {
	 spellChecker.checkSpelling();
 }
}
