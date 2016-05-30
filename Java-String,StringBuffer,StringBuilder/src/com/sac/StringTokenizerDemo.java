package com.sac;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		StringTokenizer stringTokenizer = new StringTokenizer("Hello Sachin, How Are you?");
		
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}

	}

}
