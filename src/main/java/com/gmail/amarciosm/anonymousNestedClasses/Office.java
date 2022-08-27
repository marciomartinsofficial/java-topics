package com.gmail.amarciosm.anonymousNestedClasses;

// Example anonymous class
public class Office {

	Employee manager = new Employee() {
		public void work() {
			System.out.println("To order");
		}
	};
	
	Employee assistant = new Employee() {
		public void work() {
			System.out.println("To obey");
		}
	};
	
	public static void main(String[] args) {
		Office office = new Office();
		office.manager.work();
		office.assistant.work();
	}

}
