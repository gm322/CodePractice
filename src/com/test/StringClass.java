package com.test;

import java.util.ArrayList;
import java.util.List;

public class StringClass {
	
	

	public static void main(String[] args) {
   
     StringClass s=new StringClass();
    s.m1();
	}
	void m1() {
		long startTime = System.nanoTime();
		
		List<String> strList=new ArrayList<>();
		strList.add("g");
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
				
	}
	
	
	

}
