

import java.util.*;

class Pr2{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Array:- ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int sum = 0;
		for(int i=0; i<size; i++){
		
			System.out.print("Enter Element:- ");
			arr[i] = sc.nextInt();

			if (arr[i]%3==0){
			
				sum += arr[i];
			}
		}
		System.out.println("Sum of Elements divisible by 3 :- " + sum );


	}
}
