
public class ArraysApp {

		public static void main(String[] args) {

			int[] values;
			values = new int[3];
			
			System.out.println( values[0] );
			
			values[0] = 10;
			values[1] = 20;
			values[2] = 30;
			
			System.out.println( values[0] );
			System.out.println( values[1] );
			System.out.println( values[2] );
			
			for ( int i = 0; i < values.length; i++ ) {
				
				System.out.println( "Printing the values in the \"values\" array: " + values[i] );
			}
			
			int[] numbers = { 5, 6, 7 }; // declare variable of type array and assign values
			
			for ( int i = 0; i < numbers.length; i++ ) {
				
				System.out.println( "Printing the values in the \"numbers\" array: " + numbers[i] );
			}
			
			

	}

}
