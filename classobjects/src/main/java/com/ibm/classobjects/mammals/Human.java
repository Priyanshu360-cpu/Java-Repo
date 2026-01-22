package com.ibm.classobjects.mammals;

import com.ibm.classobjects.mammals.organs.HumanEye;

public class Human {
 public HumanEye leftEye, rightEye;
 Human(){
	 leftEye=new HumanEye();
	 rightEye=new HumanEye();
 }
}
