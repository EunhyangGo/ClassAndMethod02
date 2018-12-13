package com.biz.classes;

public class ClassExec03 {
	
	public static void main(String[] args) {
	
		MyClass myClass; // MyClass를 myClass라는 객체로 선언만한 것
		myClass = new MyClass(); // myClass객체를 초기화
		
		MyClass myClass01 = new MyClass();// 선언과 초기화를 동시에 선언
		
		myClass.hello(); // MyClass에 만든 메서드 호출, 실행
		myClass01.hello(); // method호출, 실행
		
		MyClass myClass02 = new MyClass();
		// MyClass형으로 myClass02 객체를 선언하고 
		// MyClass에 (감춰진) method인 MyClass()를 호출, 실행해서 객체를 초기화 한다.
		
		myClass02.hello(); //1번 메서드 호출
		myClass02.hello("홍길동"); //2번 메서드 호출
		
		
		MyClass myClass03 = new MyClass("이몽룡");
		
		
		
		
	}

}
