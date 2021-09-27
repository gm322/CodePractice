package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysTestClass {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();

		str.add("apple");
		str.add("apple");

		Set<String> setList = new HashSet<>();
		setList.add("apple");
		setList.add("apple1");
		test(setList);
		test1(str);

		System.out.println("Set List :" + setList);
	}

	static Set<String> test(Set<String> list) {
//		Set<String> setList = new HashSet<>();
		System.out.println(list + "Before");
		list.add("apple2");
		list.add("apple");
		System.out.println(list + "After");
		return list;
	}

	static List<String> test1(List<String> list) {
//		Set<String> setList = new HashSet<>();
		System.out.println(list + "Before");
		list.add("apple2");
//		if (list.contains("apple"))
//			throw new Exception("Existed");
		System.out.println(list + "After");
		List<String> strList=new ArrayList<>();
		Collections.sort(strList);
		return list;
		
	}

}

class Exception extends RuntimeException {
	 
	private static final long serialVersionUID = 1L;
	private String exception;

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public Exception(String exception) {
		
		this.exception = exception;
	}

}
