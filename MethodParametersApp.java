class Robot {
	
	public void speak( String text ) {
		
		System.out.println( text );
	}
	
	public void jump( int height ) {
		
		System.out.println( "Jumping: " + height + " inches.");
	}
	
	public void move(String direction, double distance ) {
		
		System.out.println( "Moving: " + distance + " metres, in direction: " + direction );
	}
}
public class MethodParametersApp {

		public static void main(String[] args) {


			Robot marvin = new Robot();
			marvin.speak( "I'm so depressed." );
			marvin.jump(7);
			marvin.move( "West", 12.2 );
			
			String greeting  = "Welcome";
			marvin.speak( greeting );

	}

}
