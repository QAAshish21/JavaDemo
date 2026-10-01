package day11;

public class ConstructorDemo {

	int x, y;

	ConstructorDemo() // Default constructor
	{

		x = 100;
		y = 200;
	}

	ConstructorDemo(int a, int b) // Parametrized constructor
	{

		x = a;
		y = b;

	}

	void sum() {
		System.out.println("Sum of x & y  : " + (x + y));
	}

	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo(); // invoke default constructor
		cd.sum();
		
		ConstructorDemo cd1 = new ConstructorDemo(10,20); // parametrized constructor
		cd1.sum();

	}

}
