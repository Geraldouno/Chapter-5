import java.util.Random;

public class RandomNumberGeneration
{
    public static void main(String[] args)
	{
		Random random = new Random();
		
		int randomNumber = 1 + random.nextInt(1000, 10000);
		System.out.println(randomNumber);
	}
}
//for negative
//int randomNumber = -1 * random.nextInt(100);
//System.out.println(randomNumber);

// for 4digit number