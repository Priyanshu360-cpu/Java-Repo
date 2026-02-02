package com.ibm.internationalization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
String name();
int duration();
double[] version() default {1.0,2.0,3.0};
}
