package day6;

public class SingleDimensionalArrayDemo {

	/*
	 * 1) Declaration of arrays 2) Add value into array 3) Find size of array 4)
	 * Read signle value from array 5) Read multiple value from array
	 */

	public static void main(String[] args) {

		// 1) Declaring array

		// Aprroach - 1)

		int a[] = new int[5];

		a[0] = 100; // 2) Adding values
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		// Aprroach - 2)

		int b[] = { 10, 20, 30, 40, 50, 60, 70 };

		// Find size of array

		System.out.println("Length of array : " + b.length);

		// Read specific value from array

		System.out.println("Value of array at 3rd index : " + b[3]); // 3 is index

		// Read all the values from array & we dont know exact length of array 
		
		 // --- Normal For loop

		for (int i = 0; i <= b.length - 1; i++) {
			
			System.out.println("Values of array : " + b[i]);
		}
		
		// --- Enhanced For Loop or for...each loop
		
		
		int i []= {1,2,3,4,5};
		
		for (int x :i) {
			
			System.out.println("i array values : "+x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
