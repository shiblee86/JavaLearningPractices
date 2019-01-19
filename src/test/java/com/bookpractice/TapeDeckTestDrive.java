package com.bookpractice;

public class TapeDeckTestDrive {

	TapeDeckTwo t;
	
	public void runTapeDeckTwo() {
		
		t = new TapeDeckTwo();
		
		t.canRecord = true;
		t.playTape();
		
		if(t.canRecord == true) {
			t.recordTape();
		}
	}
	
	
}
