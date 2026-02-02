package com.ibm.internationalization;
@CustomAnnotation(duration = 10,name="class",version= {1.2,1.3})
public class CustomAnnotationUsage {
	@CustomAnnotation(duration=4,name="Constructor")
	public CustomAnnotationUsage() {
		
	}

}
