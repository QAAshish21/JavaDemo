package day8;

public class StringMethodsDemo {

	public static void main(String[] args) {

		System.out.println("1)=====================================================");

		// String s = "Ashish";
		String s = new String("Ashish");

		// 1 . length() ; - return length of string (numbers of charecters in the
		// string)

		System.out.println("Length of s is : " + s.length()); // 6
		System.out.println("Length of s is : " + "Welcome".length()); // 7

		System.out.println("2)=====================================================");

		// 2 . concat(); - Joining two strings

		String s1 = "Ashish";
		String s2 = "Narayan";
		String s3 = "Sawarkar";

		System.out.println(s1 + s2); // Normal way
		System.out.println(s1.concat(s2)); // by using concat method joining 2 string
		System.out.println(s1.concat(s2).concat(s3)); // by using concat method joining 3 string
		System.out.println(s1.concat(s2 + s3));
		System.out.println("Ashish".concat("Narayan").concat("Sawarkar")); // by using string value only

		System.out.println("3)=====================================================");

		// 3. trim(); - It removes spaces right and left side from string

		String s4 = "   Welcome   ";
		System.out.println("Before trimming : " + s4.length()); // 13 - before removing space from string
		System.out.println(s4); // it prints string along with spaces
		System.out.println(s4.trim());
		System.out.println("After triming : " + s4.trim().length()); // 7 - After trimming space from string

		System.out.println("4)=====================================================");

		// 4 . charAt() - It return charecter at perticular index
		// Index start from zero

		String name = "Ashish";
		System.out.println(name.charAt(3)); // i
		System.out.println(name.charAt(0)); // A

		System.out.println("5)=====================================================");

		// 5. conatins () - It always return boolean value true or false

		System.out.println(name.contains("Ash")); // true
		System.out.println(name.contains("ish")); // true
		System.out.println(name.contains("a")); // false

		System.out.println("6)=====================================================");

		// 6. equals() , equalIgnoreCase() - compare strings

		String a1 = "Welcome";
		String a2 = "Welcome";

		System.out.println(a1 == a2); // true
		System.out.println(a1.contains(a2)); // true
		System.out.println(a1.contains("Welcome")); // true
		System.out.println(a1.contains("welcome")); // false
		System.out.println(a1.equalsIgnoreCase("welcome")); // true - this method ignore case sensetivity

		System.out.println("7)=====================================================");

		// 7. replace(); - its replace single/multiple sequence of charecter in java

		String course = "Lxarn Automation txsting by using java sxlenium  python sxlenium";
		System.out.println(course.replace('x', 'e'));
		System.out.println(course.replace("sxlenium", "Playwright"));

		System.out.println("8)=====================================================");

		// 8. substring() - extract substring from the main string
		// starting index - 0
		// ending index -1

		String qa = "Automation";
		System.out.println(qa.substring(0, 4)); // Auto
		System.out.println(qa.substring(4, 10)); // mation

		System.out.println("9)=====================================================");

		// 9 . toUppercase() , toLowercase()

		String tool = "JIRA";
		String doc = "figma";

		System.out.println(tool.toLowerCase()); // jira
		System.out.println(doc.toUpperCase()); // FIGMA

	}

}
