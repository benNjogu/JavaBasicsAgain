package com.challenge;

public class Printer {

	private int tonnerLevel;
	private int pagesPrinted;
	private boolean isDuplex;

	public Printer(int tonnerLevel, boolean isDuplex) {
		super();
		if(tonnerLevel<-1 && tonnerLevel<=100) {
			this.tonnerLevel = tonnerLevel;
		}
		else {

			this.tonnerLevel = -1;
		}
		this.isDuplex = isDuplex;
		this.pagesPrinted = 0;
	}
	
	public int addTonner(int tonnerAmount) {
		if(tonnerAmount>0 && tonnerAmount<100) {
			if(this.tonnerLevel + tonnerAmount >100) {
				return -1;
			}
			this.tonnerLevel += tonnerAmount;
			return this.tonnerLevel;
			
		}
		else {
			return -1;
		}
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(this.isDuplex) {
			pagesToPrint /= 2;
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

}
