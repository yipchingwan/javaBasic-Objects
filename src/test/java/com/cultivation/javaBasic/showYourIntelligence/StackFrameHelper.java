package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        //throw new NotImplementedException();
    		StackTraceElement[] s  = new Throwable().getStackTrace();
    		String tmpString = (s[1].getClassName()) + "." + (s[1].getMethodName());
    		return tmpString;
        // --end-->
    }
}
