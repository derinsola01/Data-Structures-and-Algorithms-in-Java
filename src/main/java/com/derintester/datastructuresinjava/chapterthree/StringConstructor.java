package com.derintester.datastructuresinjava.chapterthree;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class StringConstructor {
	
	private static final Logger logger = LogManager.getLogger(StringConstructor.class);

	public static void main(String[] args) {
		char[] charArray = {'b', 'i', 'r', 'd'};
		String constructedString = new String(charArray);
		logger.debug("constructedString now is: " + constructedString);
	}

}
