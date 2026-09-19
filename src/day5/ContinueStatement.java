package day5;

public class ContinueStatement {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				continue; // It will break current itreation of loop and further itreation will execute as
							// it is
			}

			System.out.println(i);
		}

	}

}
