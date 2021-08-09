package com.keytech;

public class PC {

	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherBoard;

	public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}

	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		//fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	
}
