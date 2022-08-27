package com.gmail.amarciosm.anonymousNestedClasses;

/**
 * Anonymous class with interface
 * 
 */
public class ActionManager {

	Action action = new Action() {

		public void click() {
			System.out.println("To click");
		}

		public void drag() {
			System.out.println("To drag");
		}
		
	};
	
	public static void main(String[] args) {
		ActionManager actionManager = new ActionManager();
		actionManager.action.click();
		actionManager.action.drag();
	}
	
}

interface Action{
	void click();
	void drag();
}