package com.autoBoxingAndUnboxing;

import java.util.ArrayList;

public class AutomaticAutoboxingIGuess {
	private static ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
	public static void main(String[] args) {
		integerArrayList.add(10); // I think this is autoboxed at compileTime.(Like a macro??). Need to check.
		integerArrayList.add(20);
		integerArrayList.add(30);
		System.out.println(integerArrayList.get(0)+integerArrayList.get(1)+integerArrayList.get(2));
	}

}
