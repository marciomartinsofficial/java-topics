package com.gmail.amarciosm.anonymousNestedClasses;

/**
 * method's Nested class 
 *
 */
public class Extern {

	private int x = 10;
	
	public void see() {
		final int y = 5; // visualizado por Intern apenas se for final
		
		class Intern {
			Intern() {
				x = y;
			}
		}
		
		Intern intern = new Intern();
		
		System.out.println(x);
	}
	
}
