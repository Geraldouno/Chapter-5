//5.9
import java.util.*;
public class RoundingNumbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to round, or type 'Exit' to quit: ");
        String input = scanner.nextLine();
           
        if (input == "Exit") {
			System.out.println("Exited.");
			
        };

        try {
            double x = Double.parseDouble(input);
                
            double roundedValue = Math.floor(x + 0.5);
            
            System.out.printf("Original number: %.2f, Rounded number: %.0f%n", x, roundedValue);
                
        }
		catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        };
	};
};