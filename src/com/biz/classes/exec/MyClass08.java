package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass08 {

	List<String> stList;

public MyClass08() {
	stList = new ArrayList();
}
public void add(int num) {
 
	String strNum = String.valueOf(num);
	strNum = "" + num;
	stList.add(strNum); //문자열을 int형으로 변환
	
}
public int sum() {
	int intSum = 0;
	for(String s: stList ) {
		int intNum = Integer.valueOf(s);
		intSum += intNum;
	}
	return intSum;
	
	
}
}
