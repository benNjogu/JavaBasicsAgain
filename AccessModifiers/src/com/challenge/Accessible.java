package com.challenge;

interface Accessible {//-->package-private

	int SOME_CONSTANT = 100;//-->package-private
	public void methodA();//-->throughout the package
	void methodB();//-->package-private 
	boolean methodC();//-->pakage-private
	
	//total score = 1/5
}
