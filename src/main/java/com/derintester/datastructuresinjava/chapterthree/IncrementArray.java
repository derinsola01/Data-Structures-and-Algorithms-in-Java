package com.derintester.datastructuresinjava.chapterthree;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IncrementArray {
	
	private static Logger logger = LogManager.getLogger(IncrementArray.class);

	public static void main(String[] args) {
		int[] givenArray = {9,4,9};
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(9);
		newList.add(9);
		newList.add(9);
		List<Integer> newArray = incrementArray(givenArray);
		List<Integer> newArray2 = plusOne(newList);
		logger.debug("newArray is:\t" + newArray);
		logger.debug("newArray2 is:\t" + newArray2);
	}

	private static List<Integer> plusOne(List<Integer> newList) {
		int loopTerminator = newList.size() - 1;
		newList.set(loopTerminator, newList.get(loopTerminator) + 1);
		for(int i = loopTerminator; i > 0 && newList.get(i) == 10; --i) {
			newList.set(i, 0);
			newList.set(i - 1, newList.get(i - 1) + 1);
		}
		if (newList.get(0) == 10) {
			newList.set(0, 0);
			newList.set(0, 1);
		}
		return newList;
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
