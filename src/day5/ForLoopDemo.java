package day5;

public class ForLoopDemo {

	public static void main(String[] args) {

		// Example 1 : Print number from 1 to 5

		for (int i = 1; i <= 5; i++) {
			System.out.println(i); // 1,2,3,4,5
		}

		System.out.println("============================");

		// Example 2 : Print only Even number from 1 to 10

		for (int j = 2; j <= 10; j += 2) {
			System.out.println(j);

		}

		System.out.println("============================");

		// Example 3 : Print Even & Odd number from 1 to 10

		for (int k = 1; k <= 10; k++) {
			if (k % 2 == 0) {
				System.out.println(k + " Number is Even");
			} else {
				System.out.println(k + " Number is odd");
			}
		}

		System.out.println("============================");

		// Example 4 : Print value from 10 to 1 in decending order

		for (int p = 10; p >= 1; p--) {
			System.out.println(p);// 10,9,8.....1
		}

	}

}
