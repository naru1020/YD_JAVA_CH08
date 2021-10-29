package com.yedam.java.ch01;

public class Television implements RemoteController {

	private int volume;
	
	@Override
	public void turnOn() {
		
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
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
