package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;



public class MyClass03 {
	
	List<String> stList;
	
	// 생성자 부분에 각종 변수나 초기값을 설정하는 코드를 작성하는 부분

	public MyClass03() {
		stList = new ArrayList();
	}
	
	public void hello(String strName) {
		// stList는 생성자에서 초기화가 되어 MyClass03 클래스의 
		// 어떤 위치에서나 읽고 쓰기가 가능한 상태가 된다.
		stList.add(strName);
	}
	public void view() {
		for(String strName : stList) {
			System.out.println(strName);
		}
		int intLen = stList.size();
		for(int i = 0; i < intLen; i++) {
			System.out.println(stList.get(i));
		}
	}
}
