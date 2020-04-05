package com.derintester.datastructuresinjava.chapterthree;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReversePopulatedArray {
	
	private static Logger logger = LogManager.getLogger(ReversePopulatedArray.class);

	public static void main(String[] args) {
		int arrSize = 5;
		int numOfIndexesToPopulate = 1;
		int[] popArray = reversePopulate(arrSize, numOfIndexesToPopulate);
		logger.debug(Arrays.toString(popArray));
	}

	private static int[] reversePopulate(int arrSize, int numOfIndexesToPopulate) {
		int[] retArr = new int[arrSize];
		for(int index = arrSize - 1; index >= (arrSize - numOfIndexesToPopulate); index--) {
			retArr[index] = index + 1;
		}
		return retArr;
	}

}
