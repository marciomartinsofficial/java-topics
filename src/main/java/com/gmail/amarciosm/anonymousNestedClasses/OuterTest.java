package com.gmail.amarciosm.anonymousNestedClasses;

import com.gmail.amarciosm.anonymousNestedClasses.Outer.Inner;

public class OuterTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.see();
	}
	
}
