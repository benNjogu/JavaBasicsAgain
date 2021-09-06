package com.keytech;

public interface ITelephone {

	void powerOn();

	void dial(int phonNumber);

	void answer();

	boolean callPhone(int phoneNumber);

	boolean isRinging();

}
