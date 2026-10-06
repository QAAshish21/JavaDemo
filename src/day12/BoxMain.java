package day12;

public class BoxMain {

	public static void main(String[] args) {
		
		
		Box b1 = new Box();
		b1.volume();
		System.out.println("Volume of box 1 : " + b1.volume());
		
		Box b2 = new Box(10.5,5.5,15.5);
		b2.volume();
		System.out.println("Volume of box 2 : " + b2.volume());
		
		Box b3 = new Box(15.2);
		b3.volume();
		System.out.println("Volume of box 3 : " + b3.volume());

		

		

	}

}
