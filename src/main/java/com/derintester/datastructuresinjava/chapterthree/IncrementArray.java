package com.derintester.datastructuresinjava.chapterthree;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class IncrementArray {
	
	private static Logger logger = LogManager.getLogger(IncrementArray.class);

	public static void main(String[] args) {
		int[] givenArray = {9,4,9};
		List<Integer> newArray = incrementArray(givenArray);
		logger.debug("newArray is:\t" + newArray);
	}

	private static List<Integer> incrementArray(int[] givenArray) {
		List<Integer> returnArray = new ArrayList<Integer>();
		String numHolder = "";
		for(int index = 0; index < givenArray.length; index++) {
			numHolder += givenArray[index] + "";
		}
		int newTotal = Integer.valueOf(numHolder) + 1;
		String numString = String.valueOf(newTotal);
		char[] charArr = numString.toCharArray();
		for(int index = 0; index < charArr.length; index++) {
			returnArray.add(Integer.valueOf(String.valueOf(charArr[index])));
		}
		return returnArray;
	}

}
