package semister_preperation;
/**
  @author saikrithik
 **/
public class arrays {
	//An array is a group of like-typed variables that are referred to by a common name.
	// - In Java all arrays are dynamically allocated.(discussed below)
	// - Since arrays are objects in Java, we can find their length using the object property length.
	// - A Java array variable can also be declared like other variables with [] after the data type.
	// - The variables in the array are ordered and each have an index beginning from 0.
	// - The size of an array must be specified by an int value and not long or short.
	// - The direct superclass of an array type is Object.
	//One-Dimensional Arrays :
	//	The general form of a one-dimensional array declaration is
	int intArray1[];
	//or
	int[] intArray2;
	static void single_dimension_array() {
		// we can here see how to declare and allocate memory to an array
		int[] intArray3;				// declaring array
		intArray3 = new int[7];  		// allocating memory to array
		int[] intArray4 = new int[10];	// declaring and allocating in 1 line
		intArray3[0] = 18;
		intArray3[1] = 152;
		intArray3[2] = 12;
		intArray3[3] = 6;
		intArray3[4] = 2;
		// getting to know length of the array
		System.out.println("length of the array is :" + intArray3.length);
		System.out.println("--------------------------------------------");
		// accessing the elements of the specified array 
	      for (int i = 0; i < intArray3.length; i++) 
	         System.out.println("Element at index " + i +  
	                                      " : "+ intArray3[i]);
		//What happens if we try to access element outside the array size?
		// JVM throws ArrayIndexOutOfBoundsException to indicate that array has been accessed with an illegal index.
		// The index is either negative or greater than or equal to size of array.
	}
	
	static void multi_dimension_array() {
		// int[][] intArray = new int[10][20]; //a 2D array or matrix
		// int[][][] intArray = new int[10][20][10]; //a 3D array
		// declaring and initializing 2D array 
		int arr[][] = { {2,7,9,10},{2,3,6,1},{7,5,4,2} };
		// printing 2D array 
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 4 ; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 

	}
	public static void main(String[] args) {
		//single_dimension_array();
		multi_dimension_array();
	}
	
}
