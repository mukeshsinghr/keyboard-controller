package com.core.util;

import java.io.DataInputStream;
import java.io.IOException;

public class ConverterLib {

	public static char readSingleChar() throws IOException {
//		System.out.println("Enter any alphabate:");
//		char inputChar = (char) System.in.read();
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Ente any character");
		byte b = in.readByte();
		char inputChar=(char)b;
		System.out.println("Char : " +inputChar );
		return inputChar;
	}
	
	public static int getUnicode(char ch) {
		int unicodeOfChar = (int)ch;
		return unicodeOfChar;
	}
}
