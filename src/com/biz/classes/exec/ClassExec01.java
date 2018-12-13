package com.biz.classes.exec;

public class ClassExec01 {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		mc.hello(35, 49);
		mc.hello(1.5f, 3.5f);
		
		MyClass01 m1 = new MyClass01("하하");
		m1.hello();
		
		
		MyClass03 m3 = new MyClass03();
		m3.hello("홍길동");
		m3.hello("이몽룡");
		m3.hello("성춘향");
		
		m3.view();
		
		MyClass05 m5 = new MyClass05("메리",15);
		// strName = 메리, intAge = 15 를 세팅하여 초기화 하라는 이야기
		MyClass05 m6 = new MyClass05("메리");
		// strName = 메리, intAge = 니맘대로(기본값)으로 세팅
		MyClass05 m7 = new MyClass05();
		// strName, intAge 설정하기 귀찮아, 마음대로 세팅
		
		MyClass06 m8 = new MyClass06();
		/*for(int i = 0; i < 10 ; i++) {
			int intNum = (int)(Math.random() * 100) +1;
			m8.add(intNum);
		}*/
		m8.add(3);
		m8.add(7);
		m8.add(8);
		m8.add(9);
		m8.add(0);
		
		m8.Sum();
		
		MyClass09 m9 = new MyClass09();
		m9.add("하하", 2);
	    m9.view();
		
	}
	
	
	
	
	
	

}
