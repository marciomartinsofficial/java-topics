package com.gmail.amarciosm.anonymousNestedClasses;

/**
 * Example no static nested class
 *
 */
public class Outer {

	private int x;
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.print();
		
		Inner inner = outer.new Inner();
		inner.print();
	}
	
	private void print() {
		System.out.println("before x = " + x++);
	}
	
	public class Inner {
		private void print() {
			System.out.println("after x = " + x);
			System.out.println("----------------");
		}
		
		public void see() {
			System.out.println(x);
			System.out.println(this);
			System.out.println(Outer.this);
		}
	}
}
