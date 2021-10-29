package com.yedam.java.ch01;

public interface RemoteController {

	//필드 -> 상수만 허용
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	//메소드 -> 추상메소드 원래는 인터페이스에서 추상 메소드만 선언 가능했는데 새롭게 기능 추가됨.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//메소드 -> 인스턴스 메소드 -- 사용하기 위해서는 default란 문구를 넣어줘야 함.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

