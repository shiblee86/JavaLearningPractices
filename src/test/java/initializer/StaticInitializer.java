package initializer;

public class StaticInitializer {
	
	static int count;
	
	int i;
	
	static {
		count = 5;
		System.out.println("Count is " + count);
	}
	
	{
		/*Instance initializer - similar to constructor*/ 
		i++;
		System.out.println("i is " + i);
	}
	public static void main(String[] args) {
		
		StaticInitializer obj = new StaticInitializer();
		StaticInitializer obj1 = new StaticInitializer();
		
		/*The static initializer is called only once when a class is being loaded by the JVM
		 * No matter how many objects you create, the static initializer only runs one
		 * Even if you have no objects of the class, the static initializer runs when you create the main method.
		 * It gets called once per class
		 * 
		 * It is executed even before main method is called. JVM will first execute static block and then move on to main method.
		 * So, if we have the following: 
		 * 
		 * static{
		 * 	System.out.println("Hello")
		 * }
		 * 
		 * public static void main(String[] args) {
		 * 	System.out.println("Hello in main method")
		 * }
		 * 
		 * static{
		 * 	System.out.println("Bye")
		 * }
		 * 
		 * JVM will first print Hello,  then Bye and lastly Hello in main method
		 * 
		 * You cannot have an instance variable inside a static initializer
		 * 
		 * The instance initializer gets called every time the class is call. Here two objects are calling instance initializer. Hence i gets printed twice*/
		
	}

}
