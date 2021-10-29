package com.yedam.java.ch01;

public class Audio implements RemoteController {

	// 필드
	private int volume;

	// 생성자

	// 메소드
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	public void setVolume(int volume) {
		if (volume > RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MAX_VOLUME;
		} else if (volume < RemoteController.MIN_VOLUME) {
			this.volume = RemoteController.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨은 : " + this.volume);
	}

}
