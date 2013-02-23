package com.core.logic;

import java.io.Console;
import java.io.IOException;
import java.util.HashMap;
import com.core.util.ConverterLib;

public class TestKeyboard {

	public static void main(String[] args) throws IOException {
		// char c = 'क';
		// char cht='';
		// Console c;

		// System.out.print("enter a character");
		// char inputCharr = (char) System.in.read();

		while (true) {
			System.out.println("Enter any alphabate:");
			char inputChar = ConverterLib.readSingleChar(); //(char) System.in.read();
			int unicodeOfChar = ConverterLib.getUnicode(inputChar);
			if (inputChar == '.') {
				System.out.println("*** TERMINATED ***");
				break;
			} else if(unicodeOfChar == 13) {
				continue;
			} else {
				
				System.out.println("Unicode value of entered char is :"
						+ unicodeOfChar);
				HashMap<Integer, Integer> translaterEngine = TranslaterEngine
						.getTranslaterEngine();
				System.out.println("Hindi converted char is :"
						+ Character.toString((char) (int) translaterEngine
								.get(unicodeOfChar)));
//				inputChar = ' ';
				// System.in = null;
			}
		}

	}
}
