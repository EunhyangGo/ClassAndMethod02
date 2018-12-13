package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;


public class MyClass06 {
	List<Integer> intList;

	public MyClass06() {
	intList = new ArrayList();
	}
	public void add(int num) {
		intList.add(num);
		
	}
	public void Sum() {
		int intLen = intList.size();
		int intSum = 0;
		for(int i =0; i<intLen; i++) {
			int intNum = intList.get(i);
			intSum += intNum;
		}
		intSum= 0 ;
		for(int num : intList) {
		intSum += num;

		}
		/*
		int num = intList.get(0);
		int num = intList.get(1);
		int num = intList.get(2);
		int num = intList.get(3);
		int num = intList.get(4);
		int num = intList.get(5);
		위의 for(int num: intList)를 풀어쓴것이다. 결론 둘이 같은것.
		*/
		System.out.println("합계" + intSum);
		
		
	}
}
	