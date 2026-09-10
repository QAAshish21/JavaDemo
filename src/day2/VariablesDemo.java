package day2;

public class VariablesDemo {

	public static void main(String[] args) {

		int salary; // Declaration
		salary = 18000; // assignment

		System.out.println("My Initial Salary : " + salary);

		int age = 28; // Declaration+Assignment
		System.out.println("My age is : " + age);

		age = 32;

		System.out.println("My Brother age is : " + age);

		// Appraoch 1 - if all the variables belong to different data types

		int a = 10;
		String b = "Ashish";
		char c = 'A';

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// Approach 2 - if all the variables belong to same data types
		int d, e, f;
		d = 40;
		e = 50;
		f = 60;

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		// Approach 3 - If all the variables belong to same datatype

		int i = 70;
		int j = 80;
		int k = 90;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}
