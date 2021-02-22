package com.driver;

public class Wait {

	public void waitForMilliSeconds(int milliSeconds) 
    {
	    try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}

