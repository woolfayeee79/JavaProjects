import java.util.Scanner;
public class MetarAbbreviations {

	public static void main(String[] args) {
		// Write a java program that reads on of the 8 abbreviations 
		// Write a program that reads in + - B DZ E HZ RA SN
		Scanner inputFromUser = new Scanner(System.in);
		// ask the user for input
		System.out.printf("\nEnter in a METAR abbreviation:");
		//store scanner in varible name
		String name = inputFromUser.nextLine();
		//construct a if else statement that reads in the string
		if (name.equals("+")) {
			System.out.println("Heavy Intensity");
			}
			
			else if (name.equals("-")){
			System.out.println("Light Intensity");
			}
			
			else if (name.equals("B")) {
			System.out.println("Begin At Time");
			}
			
			else if (name.equals("DZ")) {
			System.out.println("Drizzle");
			}
			
			else if (name.equals("E")) {
			System.out.println("Ended At Time");
			}
			
			else if (name.equals("HZ")) {
			System.out.println("Haze");
			}
			
			else if (name.equals("RA")) {
			System.out.println("Rain");
			}
			
			else if (name.equals("SN")){
				System.out.println("Snow");
			}
		
			else {
				System.out.println("Unknown abbreviation");
			}
		  	
	}

}
