package com.ibm.spring.beans;

public class TextEditor {
 private SpellChecker spellChecker;
 public TextEditor() {
	 System.out.println("Inisde textEditor no-args constructor");
 }
 public TextEditor(SpellChecker spellChecker) {
	 System.out.println("Inside TextEditor constructor");
	 this.spellChecker=spellChecker;
 }
 public void setSpellChecker(SpellChecker spellChecker) {
	 this.spellChecker=spellChecker;
 }

 public void spellCheck() {
	 spellChecker.checkSpelling();
 }
}
