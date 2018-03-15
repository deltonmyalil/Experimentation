package com.autoBoxingAndUnboxing;

import java.util.ArrayList;

public class AutoboxingAndUnboxing {
	private static ArrayList<Integer> integerArrayList = new ArrayList<>();
	public static void main(String[] args) {
		integerArrayList.add(Integer.valueOf(20)); //Autoboxing using Integer.valueOf(<intNumber>)
		System.out.println(integerArrayList.get(0).intValue());  // Unboxing using .intValue()
	}
}
