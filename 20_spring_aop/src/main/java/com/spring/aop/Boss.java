package com.spring.aop;

import org.springframework.stereotype.Component;

//테스트 클래스
@Component
public class Boss {
	
	public void work() {
		System.out.println("사장의 일을 한다.");
		
	}
	
	public void getWorkingTime() {
		
		try {//0.3초동안 재운다. 3000 == 3초 
			Thread.sleep(300);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
	}
	
	public void getInfo(String title, int salary) {
		
	}
	
}
