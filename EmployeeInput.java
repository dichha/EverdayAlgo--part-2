import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class EmployeeInput{
	EmployeeInput(){}
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("EmployeeInput.txt");
		if(file.exists()){
			Scanner inFile = new Scanner(file);
			int lineNum = 0;
			while(inFile.hasNext()){
				String line = inFile.nextLine();
				String[] token = line.split(","); 
				for (int i=0; i<token.length; i++){
					System.out.print(token[i] + " ");
				}
				//System.out.println(++lineNum + ": " + line);
				System.out.println();
			}
			inFile.close();
		}
	}
}