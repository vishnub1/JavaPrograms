//new [] when dont know values

//{} when we know values

//new [] {} when we want to pass it as argument without explicit variable

// develop a program to read integer values from keyboard store them
// in program display them on console and also display total sum

import  java.util.Scanner;
import  java.util.Arrays;

class Test12 {
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.print("How many values do you want to enter?:");
		final int size = scn.nextInt();scn.nextLine();
		int[] integerArray = new int[size];

		for (int i= 0;i<size ;i++)	{
			System.out.print("Enter value"+(i+1)+":");
			integerArray[i] = scn.nextInt();
		}
		System.out.println(Arrays.toString(integerArray));
		int sum = 0;
		for (int i=0;i<size ;i++ ) {
			sum = sum + integerArray[i];
		}
		System.out.println("Sum of all values available in array : "+sum);
	
	}
}