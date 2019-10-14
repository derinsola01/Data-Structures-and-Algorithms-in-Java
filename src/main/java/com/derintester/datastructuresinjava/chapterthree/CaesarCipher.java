package com.derintester.datastructuresinjava.chapterthree;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CaesarCipher {
	
	private static final Logger logger = LogManager.getLogger(CaesarCipher.class);
	protected char[] encoder = new char[26];
	protected char[] decoder = new char[26];
	
	public CaesarCipher (int rotation) {
		for (int index = 0; index < 26; index++) {
			encoder[index] = (char) ('A' + (index + (rotation % 26)) % 26);
			decoder[index] = (char) ('A' + ((index - (rotation % 26)) + 26) % 26);
		}
	}
	
	public String encrypt(String message) {
		return transform(message, encoder);
	}
	
	public String decrypt(String secret) {
		return transform(secret, decoder);
	}

	private String transform(String originalMessage, char[] code) {
		char[] transformedMessage =  originalMessage.toCharArray();
		for(int index = 0; index < transformedMessage.length; index++) {
			char uppercaseChar = Character.toTitleCase(transformedMessage[index]);
			if(Character.isUpperCase(uppercaseChar)) {
				int newIndex = Character.toTitleCase(transformedMessage[index]) - 'A';
				transformedMessage[index] = code[newIndex];
			}
		}
		
		return new String(transformedMessage);
	}

	public static void main(String[] args) {
		CaesarCipher cipher = new CaesarCipher(100);
		logger.debug("Encryption code is " + new String(cipher.encoder));
		logger.debug("Decryption code is " + new String(cipher.decoder));
		String message = "The eagle is in play; meet at joe's.";
		String coded = cipher.encrypt(message);
		logger.debug("Secret is: " + coded);
		String answer = cipher.decrypt(coded);
		logger.debug("answer is: " + answer);
	}

}
