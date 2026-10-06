package day12;

public class MainMethodOverloading {

	// We can overlaod main method for that we need to change parameter

	public void main(int x) {
		System.out.println(x);
	}

	public void main(String s) {
		System.out.println(s);
	}

	public void main(String s1, String s2) {
		System.out.println(s1 + s2);
	}

	public static void main(String[] args) {

		MainMethodOverloading mv = new MainMethodOverloading();
		mv.main(10);
		mv.main("Ashish");
		mv.main("Ashish", "Sawarkar");

	}

}
