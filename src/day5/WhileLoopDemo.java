package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {

		// Example 1 : Print 1....10 number

		int i = 1; // Initilization

		while (i <= 10) // Condition
		{
			System.out.println(i);
			i++; // Increment
		}

		// Example 2 : Print Hello..world message 10 times

		int j = 1;
		while (j <= 10) {
			System.out.println("Hello..World");
			j++;
		}

		// Example 3 : Print even number in between 1 to 10

		int k = 2;

		while (k <= 10) {
			System.out.println(k); // 2,4,6...8
			k += 2;
		}

		// Example 4 : Print 1 to 10 each even and odd number

		int p = 1;

		while (p <= 10) {
			if (p % 2 == 0) {
				System.out.println(p + " Even number");
			} else {
				System.out.println(p + " Odd number");
			}
			p++;
		}

	}

}
