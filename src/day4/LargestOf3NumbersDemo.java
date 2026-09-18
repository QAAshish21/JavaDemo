package day4;

public class LargestOf3NumbersDemo {

	public static void main(String[] args) {

		int a = 100, b = 200, c = 30;

		if (a > b && a > c) {
			System.out.println("a is the largest number");
		} else if (b > a && b > c) {
			System.out.println("b is the largest number");
		} else {
			System.out.println("c is the largest number");
		}

	}

}
