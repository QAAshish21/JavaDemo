package day4;

public class NestedIfConditionDemo {

	public static void main(String[] args) {

		int num = 2;

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}
		} else {
			System.out.println("Number is zero or less than zero");
		}

	}

}
