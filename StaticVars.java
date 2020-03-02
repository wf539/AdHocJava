
public class StaticVars {

	static int com = 0;
	
	public static void main( String[] args ) {
		
		System.out.println(StaticVars.com);
		StaticVars.com = 100;
		System.out.println(StaticVars.com);
		

	}

}
