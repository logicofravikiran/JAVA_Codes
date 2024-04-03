

import java.util.*;

class Pr1{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[] = new int[size];

		int count = 0;

		for (int i=0; i<size; i++){
		
			System.out.print("Enter Element:- ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Even numbers:- ");
		for(int i=0; i<size; i++){
		
			if (arr[i]%2==0){
			
				count++;
				System.out.print(arr[i] + "\t");
			}
		}
		System.out.println("Count of Even Numbers:- "+ count);

	}
}
