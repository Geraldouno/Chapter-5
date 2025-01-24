//5.13
import java.util.Random;

public class RandomSets 
{
    public static void main(String[] args)
	{
        Random randomNunbers = new Random();
		int setA = 2 + 2 * randomNunbers.nextInt(5);
		System.out.printf("Random number from setA is: %d%n ", setA);
		
		int setB = 3 + 2 * randomNunbers.nextInt(5);
		System.out.printf("Random number from setA is: %d%n ", setB);
		
		int setC = 6 + 4 * randomNunbers.nextInt(5);
		System.out.printf("Random number from setA is: %d%n ", setC);
	};
};