package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass09 {

	List<String> stList;
	
	public MyClass09() {
		stList = new ArrayList();
	}
	public void add(String strName, int num) {
		 String strNum = String.valueOf(num);
		 String sv = strName+":"+ strNum;
		 
		 stList.add(sv);
		 
	}
	public void view() {
		int intLen = stList.size();
		for(int i = 0; i < intLen; i++) {
			System.out.println(stList.get(i));
		}
	}
}