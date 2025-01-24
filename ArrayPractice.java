public class ArrayPractice
{
	public static void main(String[] args)
	{
		//int[] numbers = new int[6];
		int numbers= {1,2,3,4,5};
		
		System.out.println("Element at index 0 is: " + numbers[0]);
		System.out.println("Element at index 0 is: " + numbers[4]);
		
		numbers[2] = 10;
		System.out.println("Updating index number2: " + number[2]);
		
		for(int i = 0; i < numbers.lenght; i++)
		{
			
			System.out.println(numbers[i]);
		};
		
		for(int number: numbers)
		{
			System.out.println(number);
		};
	};
};