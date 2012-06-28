import java.util.Scanner;

public class ConvertMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TempTest will test to see if a valid integer has been passed in when picking which conversion
		//to perform
		int TempTest = 0;
		//TempType will be used to store which conversion is being performed
		int TempType = 0;
		Scanner sysin = new Scanner(System.in);
		while (TempTest == 0) {
			System.out.println
			("Enter 1 to convert from Celcius to Fahrenheit, or 2 to convert from Fahrenheit to Celcius");
			//This section checks to see if the value passed is in an integer. If not it prompts to
			//enter another value
			while (!sysin.hasNextInt()) {
				sysin.next();
				System.out.println("Invalid type. Please enter 1 or 2");
			}
			TempType = sysin.nextInt();
			//if TempType is not 1 or 2 TempTest won't be incremented and the while loop
			//will run again
			if (TempType != 1 && TempType != 2) {
				System.out.println("Invalid selection. Please try again");
			} else {
				TempTest++;
			}	
		}
		System.out.println("Please enter the temperature to be converted");
		//Also checks to see if an integer has been entered
		while (!sysin.hasNextInt()) {
			sysin.next();
			System.out.println("Please enter an integer value to convert");
		}
		int Temperature = sysin.nextInt();
		//Create a new Convert object. The temperature will be converted according to what 
		//value is stored in TempType
		Convert converter = new Convert();
		if (TempType == 1) {
			int Converted = converter.CelToFahr(Temperature);
			System.out.println(Temperature + " converted from Celcius to Fahrenheit is " + Converted);
		} else if (TempType == 2) {
			int Converted = converter.FahrToCel(Temperature);
			System.out.println(Temperature + " converted from Fahrenheit to Celcius is " + Converted);
		} 
		
		
	}

}
