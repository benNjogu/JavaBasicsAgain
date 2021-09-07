package com.challenge;

import java.util.ArrayList;
import java.util.List;

public interface ISavable {

	List<String> write();
	void read(ArrayList<String> savedValues);
}
