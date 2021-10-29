package com.yedam.java.ch01;

public class SmartTelevision implements RemoteController, Searchable {

	// 필드
	private int volume;

	@Override
	public void search(String url) {

		System.out.println(url + "검색합니다.");
	}

	@Override
	public void turnOn() {

		System.out.println("tv를 켭니다.");
	}

	@Override
	public void turnOff() {

		System.out.println("tv를 끕니다.");
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

		System.out.println("현재 볼륨 " + this.volume);
	}

}
