package com.core.logic;

import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public void test() {
//		scanner.nex
	}
	public static void main(String[] args) throws Exception{
//		char c = 'क';
		System.out.println("Enter any alphabate:");
		char inputChar = (char) System.in.read();
		int unicodeOfChar = (int)inputChar;
		System.out.println("Unicode value of entered char is :"+unicodeOfChar);
//		System.out.println(Character.toString((char)unicodeOfChar));
		
		HashMap<Integer, Integer> translaterEngine = TranslaterEngine.getTranslaterEngine();
		System.out.println("Hindi converted char is :"+Character.toString((char)(int)translaterEngine.get(unicodeOfChar)));
		

		
//		 Console console = System.console();
//		    if (console == null) {
//		      System.err.println("sales: unable to obtain console");
//		      return;
//		    }
//
//		    String password = new String (console.readPassword ("Enter password: "));
//		    System.out.println(password);
	}
	Scanner scanner = new Scanner(System.in);
	
}
