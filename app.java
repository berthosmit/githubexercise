public class app {

	public static void main (String args[]); {
	System.out.println("app.main");
	// dit is een test
	}
	private static void doStuff(){
		System.out.println("app.doStuff for featureY called by" + caller);
}
	private static void featureY(){
		doSuff("featureY");
}
}