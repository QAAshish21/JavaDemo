package day11;

public class GreetingsMain {

	public static void main(String[] args) {

		Greetings gr = new Greetings();
		gr.m1(); // 1

		String data = gr.m2(); // Whenever we used return type then we need to store data in variable
		System.out.println(data); // 2

		gr.m3("Ashish"); // 3

		String reply = gr.m4("Sandeep");
		System.out.println(reply);

	}

}
