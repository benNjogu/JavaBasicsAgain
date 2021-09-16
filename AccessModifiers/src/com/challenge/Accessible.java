package com.challenge;

interface Accessible {//-->package-private

	int SOME_CONSTANT = 100;//-->public
	public void methodA();//-->throughout the package
	void methodB();//--> public
	boolean methodC();//-->public
	
}
