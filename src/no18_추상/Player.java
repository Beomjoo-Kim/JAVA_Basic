package no18_추상;

abstract class Player {
	//public 클래스가 아니라 abstract를 붙임으로써 추상클래스라는 것을 알림
	abstract void play (String songName);
	abstract void pause();
	abstract void stop();

}
