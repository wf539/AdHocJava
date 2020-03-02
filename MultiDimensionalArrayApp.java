
public class MultiDimensionalArrayApp {

	public static void main(String[] args) {
		
		int[] values = { 3, 5, 2343 };
		System.out.println( "Getting third element in one-dimensional array: " + values[2]); // get third element
		
		int[][] grid = {
			{ 3, 5, 2343 },
			{ 2, 4 },
			{ 1, 2, 3, 4 }
				
		}; // initialise and declare multidimensional array
		
		System.out.println("Getting value at row 1, column 1: " + grid[1][1]);
		System.out.println("Getting third element in first row: " + grid[0][2]);
		
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello there!";
		System.out.println("Getting second element in first row: " + texts[0][1]);
		
		for ( int row = 0; row < grid.length; row++ ) {
			
			for ( int col = 0; col < grid[row].length; col++ ) {
				
				System.out.print(grid[row][col] + "\t");
			}
			
			System.out.println();							
		}
		
		String[][] words = new String[2][];  	// specify second row only
		System.out.println(words[0]);			// return value(s) in first row
		words[0] = new String[3];				// allocate space for three values in the first row
		words[0][1] = "Row 1, column 2";		// put string "Row 1, column 2" in array
		System.out.println("The string in the second column of the first row is: " + "\"" + words[0][1] + "\"" );

	}

}
