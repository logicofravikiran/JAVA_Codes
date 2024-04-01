

import java.util.*;

class Array29{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the array size:- ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Size of the array:- "+ arr.length);

		for(int  i=0; i<arr.length; i++){
			
			System.out.print("Enter Element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements of the array are: ");

		for (int i =0; i<arr.length; i++){
		
			System.out.println(arr[i]);
		}

		int sum = 0;

		for (int i=0; i<arr.length; i++){
		
			sum += arr[i];
		}
		System.out.println("Sum:- " + sum );
	}
}
