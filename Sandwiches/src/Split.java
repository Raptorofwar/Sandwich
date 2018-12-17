import java.util.*;
public class Split {
	
	
	// Your task Part 0

			//String.split();

			//It's a method that acts on a string, <StringName>.split(<String sp>);

			//Where sp is the string where the string splits

			//And it returns an array

			//System.out.println(Arrays.toString("I like apples!".split(" ")));

			// it will split at spaces and return an array of ["I","like","apples!"]

			// Example 2: "I really like really red apples"split("really")
			

			// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

			//play around with String.split!

			//What happens if you "I reallyreally likeapples".split("really") ?
			//returns things without spaces
	
	public static void main(String[] args) {
		//String[] arrays = "I like apples!".split(" ");
		//System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
		//System.out.println(Arrays.toString("I really like really red apples".split("really")));
		//System.out.println(splitSandwich("applespineapplesbreadlettucetomatobreadbaconmayohambreadcheese"));
		//System.out.println(spaceSandwich("apples pineapples bread lettuce tomato bread bacon mayo ham bread cheese"));
	}
	
	//Your task Part 1:

	/*Write a method that take in a string like

	* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

	* describing a sandwich.

	* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

	* the sandwich and ignores what's on the outside

	* What if it's a fancy sandwich with multiple pieces of bread?

	*/
	
	public static String splitSandwich(String sandwich) {
		String[] sandwichparts = sandwich.split("bread");
		String[] middle = new String[sandwichparts.length-2];
		for(int position=0; position<middle.length; position++) {
			middle[position]=sandwichparts[position+1];
		}
		return Arrays.toString(middle);
	}
	
	
	
		//Your task pt 2:

		/*Write a method that take in a string like

		* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

		* describing a sandwich

		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

		* the sandwich and ignores what's on the outside.

		* Again, what if it's a fancy sandwich with multiple pieces of bread?

		*/
	
	public static String spaceSandwich(String sandwich) {
		String[] sandwichParts=sandwich.split(" ");
		String newSandwichParts="";
		for(String part: sandwichParts) {
			newSandwichParts+=part;
		}
		return splitSandwich(newSandwichParts);
	}

}
