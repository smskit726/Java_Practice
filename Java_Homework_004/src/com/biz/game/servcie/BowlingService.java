package com.biz.game.servcie;

public interface BowlingService {
	
	public void scoreWrite();
	public boolean firstBall(int frame);
	public void secondBall(int frame);
	public void thirdBall(int frame);
	public void calcScore();
	public void scoreBoard();

}
