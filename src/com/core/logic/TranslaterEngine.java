package com.core.logic;

import java.util.HashMap;

public class TranslaterEngine {
	private static HashMap<Integer, Integer> rules = new HashMap<Integer, Integer>();
	private TranslaterEngine() {
		
	}
	static {
		rules.put(65, 2310);
		rules.put(66, 2349);
		rules.put(67, 2331);
		rules.put(68, 2338);
		rules.put(69, 2317);
		rules.put(70, 2318);
		rules.put(71, 2328);
		rules.put(72, 2361);
		rules.put(73, 2312);
		rules.put(74, 2333);
		rules.put(75, 2326);
		rules.put(76, 2355);
		rules.put(77,2350);
		rules.put(78, 2339);
		rules.put(79, 2323);
		rules.put(80, 2347);
		rules.put(81,2370);
		rules.put(82, 2352);
		rules.put(83, 2358);
		rules.put(84,2336);
		rules.put(85,2314);
		rules.put(86, 2357);
		rules.put(87,2338);
		rules.put(88, 2319);
		rules.put(89, 2351);
		rules.put(90, 2332);
		rules.put(97, 2310);
		rules.put(98, 2349);
		rules.put(99, 2331);
		rules.put(100, 2338);
		rules.put(101, 2317);
		rules.put(102, 2318);
		rules.put(103, 2328);
		rules.put(104, 2361);
		rules.put(105, 2312);
		rules.put(106, 2333);
		rules.put(107, 2326);
		rules.put(108, 2355);
		rules.put(109,2350);
		rules.put(110, 2339);
		rules.put(111, 2323);
		rules.put(112, 2347);
		rules.put(113,2370);
		rules.put(114, 2352);
		rules.put(115, 2358);
		rules.put(116,2336);
		rules.put(117,2314);
		rules.put(118, 2357);
		rules.put(119,2338);
		rules.put(120, 2319);
		rules.put(121, 2351);
		rules.put(122,2332);
		rules.put(48,2406);
		rules.put(49, 2407);
		rules.put(50, 2408);
		rules.put(51,2409);
		rules.put(52,2410);
		rules.put(53, 2411);
		rules.put(54,2412);
		rules.put(55, 2413);
		rules.put(56, 2414);
		rules.put(57,2415);
		
		rules.put(13, 13);
		rules.put(10, 10);
			
	}
	
	public static HashMap<Integer, Integer> getTranslaterEngine() {
		return rules;
	}
}

