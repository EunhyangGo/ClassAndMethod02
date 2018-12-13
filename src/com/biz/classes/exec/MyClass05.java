package com.biz.classes.exec;

public class MyClass05 {
	String strName;
	int intAge;

	// blank(Constructor)생성자, 기본 생성자
	// 1번 기본 생성자는 아무런 매개변수 없이 호출되므로 
	// 이름의 기본값인 "몽이"를 2번 생성자에게 전달하는 역할
	public MyClass05() {
		this("몽이"); // 몽이를 2번 생성자에게 호출
		
	}
	// 2번 생성자는 매개변수로 받은 값과
	// 나이의 기본값 14를 3번 생성자로 전달하는 역할만
	public MyClass05 (String strName) {
		this(strName, 14); // 이름은 초기화 시키고 14를 3번 생성자에게 호출
		//this는 생성자를 호출하는 키워드
		
		
	}
	// 3번 생성자에서 모든 ㅕㄴ수를 초기화 전담
	public MyClass05( String strName,int intAge) {
		this.strName = strName ;
		this.intAge = intAge;
		
	}
	
}
