/** Demonstrate a difference between calling a static vs non-static method
 */
class StaticDemo {
	public static void main(String[] args) {
	        // We have to create an instance of NonStatic class 
	        // to call it's GetGreeting method
		NonStatic ns = new NonStatic();
		// Let's call it and print out the returned string
		System.out.print(ns.GetGreeting());
		// We can call Static.GetGreeting without creating it's
		// instance because GetGreeting is a static method
		System.out.print(Static.GetGreeting());
	}

}
