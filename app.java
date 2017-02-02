public class app {

	public static void main (String args[]); {
	System.out.println("app.main");
	// doDtuff();
	}
	private static void doStuff(String caller){
		System.out.println("app.doStuff" + caller);
	
}
	private static void featureZ(){
		doStuff (featureZ);
}
}
