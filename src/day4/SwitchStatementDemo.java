package day4;

public class SwitchStatementDemo {

	public static void main(String[] args) {

		int menu = 5;

		switch (menu) {
		case 1:
			System.out.println("Samosa");
			break;
		case 2:
			System.out.println("Dosa");
			break;
		case 3:
			System.out.println("Kachori");
			break;
		case 4:
			System.out.println("Gulab Jamun");
			break;
		default: {
			System.out.println("Invalid Item");

		}

		}

	}

}
