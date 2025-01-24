public class Arrays1
 {
    public static void main(String[] args) 
	{
		int[] numbers = new int[5];
		
		// different ways to get the index number
		numbers[0] = 3;
		numbers[2 - 1] = 9;
		
		int i = 2;
		numbers[i] = 7;
		
		numbers[getIndex()] = 4;
		
		numbers[4] = 6;
		
		for(int index = 0; index < numbers.length; index++)
		{
			System.out.println(numbers[index]);
		}
		
		//to reverse the case above
		for(int index = numbers.length - 1; index >= 0; index--)
		{
			System.out.println(numbers[index]);
		}
	}
 
	private static int getIndex()
	{
		return 3;
	}
 }
 

