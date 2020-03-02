
public class StaticNonStatic {

	public static int a;
	public static void funcTest() {
		
		System.out.println("Static function funcTest() called");
	}
	
public void anOthetherfuncTest() {
		
		System.out.println("Non-static function anothetherfuncTest() called");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello");
		Thread.sleep(2001);
		System.out.println("Welcome to Java");
		Thread.sleep(2001);
		
		StaticNonStatic.funcTest();
		Thread.sleep(2001);
		
		StaticNonStatic obj = new StaticNonStatic();
		obj.anOthetherfuncTest();

	}

}
