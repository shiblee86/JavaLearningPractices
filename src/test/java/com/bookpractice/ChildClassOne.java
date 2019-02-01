package com.bookpractice;

public class ChildClassOne extends ParentClassOne {
	
	/*
	 * When an object's code contains a call to one of the object's own methods, you don't need to preface the call with a dot. You can just call the method or use this. keyword. 
	 * REMEMBER, this only works when you call the object's methods inside other void or return type method which are NOT the main method. For example, the following WILL NOT WORK:
	 * 
	 * 
	 * public class ChildClassOne extends ParentClassOne {
				 * public ChildClassOne(String parent, int age) {
					super(parent, age);
				}
			
				public static void main(String[] args) {
			
					System.out.println(getAge());
					System.out.println(getParent());
				}
			}
	 * OR The following will not work 
				 * public ChildClassOne(String parent, int age) {
								super(parent, age);
							}
						
							public void display() {
								System.out.printf(getParent(), getAge());
							}
						
							public static void main(String[] args) {
						
								ChildClassOne obj = new ChildClassOne("Syed", 30);
						
								System.out.println(getAge());
								System.out.println(getParent());
							}
						} 
						
	 REMEMBER: Since Main method is a static method, you cannot call non-static method or variables without an object.*/

	public ChildClassOne(String parent, int age) {
		super(parent, age);
	}

	public void display() {
		System.out.printf(getParent(), getAge());
	}

	public static void main(String[] args) {

		ChildClassOne obj = new ChildClassOne("Syed", 30);

		System.out.println(obj.getAge());
		System.out.println(obj.getParent());
	}
}
