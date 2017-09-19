import java.util.Scanner; 
/* A Java Program that demonstrates console based 
	input and output. 
*/

public class MyConsoleIO{
	//Create a single shared Scanner for keyboard input
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		// Prompt the user
		System.out.print("Type some data for the program: ");

		//Read a line from the use. 
		String input = scanner.nextLine();

		//Display the input back to the user
		System.out.println("input = " + input);
	}
}