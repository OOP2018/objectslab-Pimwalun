package person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Test of creating person objects.
 * 
 * @author your name
 */
public class Main {
	private static final Scanner console = new Scanner(System.in);
	
	/**
	 * Create some Person objects for your friends. Then print them.
	 */
	public static void main(String[] args) {
		List<Person> friends = new ArrayList<Person>();
		
		// add some friends
		System.out.println("Enter a blank line when done.");
		while(true) {
			System.out.print("Enter friend's name: ");
			String name = console.nextLine().trim();
			//TODO 1. check for empty input line (exit the loop)
			
			//TODO 2. prompt for friend's email (blank line is ok)
			
			//TODO 3. create a person with a name.  Then set his email address.
			Person person = _________________;

			// add person to the list
			friends.add( person );
		}
		
		// print the friends
		System.out.println("Your friends are");
		for(Person friend: friends) System.out.println(friend);
		// does the output look correct?
	}
}
