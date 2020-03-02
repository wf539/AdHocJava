
public class StringArraysApp {

	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you!";
		
		System.out.println( words[2] );
		
		String[] fruits = { "apple", "banana", "pear", "kiwifruit" };
		
		for ( String fruitItems: fruits ) {
			
			System.out.println( "The values in the array are: " + fruitItems );
		}
		
		String text = null;
		System.out.println(text);
		
		String[] texts = new String[2];
		System.out.println( "The first element in the \"texts\" array before assignment is: " + texts[0] + "." );
		texts[0] = "one";
		System.out.println( "The first element in the \"texts\" array after assignment is: " + "\"" + texts[0] + "\"." );

	}

}
