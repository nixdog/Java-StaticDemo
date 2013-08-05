
class StaticDemo {
	public static void main(String[] args) {
		NonStatic ns = new NonStatic();
		System.out.print(ns.GetGreeting());
		System.out.print(Static.GetGreeting());
	}

}
