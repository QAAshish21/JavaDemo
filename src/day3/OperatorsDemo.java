package day3;

public class OperatorsDemo {

	public static void main(String[] args) {

		// 1 . Arithmetic operators + - * / %

		int a = 10, b = 20, c = 30, d = 30;

		int result = a + b;
		System.out.println(result);

		System.out.println(b - a);
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(b % a);

		// 2 . Reletional & Comparision operators > >= < <= !== == it return boolean
		// value only true/false

		System.out.println(c > b); // true
		System.out.println(c >= d); // true
		System.out.println(c < d); // false
		System.out.println(a != b); // true
		System.out.println(a == b); // false

		// 3. Logical operators && || ! it return boolean value only true/false

		boolean x = true;
		boolean y = false;

		System.out.println(x && y); // False
		System.out.println(x || y); // True
		System.out.println(!y); // True

		boolean b1 = 10 > 20;
		System.out.println("Value of b1 : " + b1); // False

		boolean b2 = 10 < 20;
		System.out.println("Valur of b2 : " + b2); // True

		System.out.println(b1 && b2); // False
		System.out.println(b1 || b2); // True

		System.out.println((10 < 20) && (10 > 20)); // False

		// 4. Incremental & Decremental operator

		// Case - 1

		int num = 10;
		num++; // num = num +1;
		System.out.println("My Number : " + num);

		// Case - 2

		int price = 499;
		int res = price++; // Post increment = Assertion+increment
		System.out.println("My Price : " + res); // 499

		System.out.println(price); // 500

		// Case -3

		int stock = ++price; // Pre increment = Increment +Assertion
		System.out.println("Stock Price : " + stock);

		// 5 . Assignment Operator = += -= *= /= % = ( We used this operator when we
		// need to assign value more than 1 )

		int point = 5;
		point += 2;
		System.out.println("My Point after adding :" + point); // 7

		point -= 3;
		System.out.println("My point after reducing : " + point); // 4

		point *= 3;
		System.out.println("My point after multiply :" + point); // 12

	}

}
