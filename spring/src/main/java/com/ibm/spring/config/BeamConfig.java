package com.ibm.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.spring.beans.SpellChecker;
import com.ibm.spring.beans.TextEditor;

@Configuration
public class BeamConfig {
@Bean("textEditor")
public TextEditor getTextEditor() {
	return new TextEditor();
}
@Bean
public SpellChecker getSpellChecker() {
	return new SpellChecker();
}
}
