package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class DogListClass {
	
	List<String> dogList;
	String strName;
	
	public DogListClass() {
		 dogList = new ArrayList();
		 this.strName = "몽이";
		
		
	}
	public DogListClass(String strName) {
		dogList = new ArrayList(); // 초기화시켜주고
		
		this.strName = strName; // 변수 셋팅
		dogList.add(this.strName); // 기능 추가
	}
	
	
	
	
	

}
