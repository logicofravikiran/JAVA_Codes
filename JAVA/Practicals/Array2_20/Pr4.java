

import java.util.*;

class Pr4{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Array:- ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<size; i++){
		
			System.out.print("Enter Element:- ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter element to search:- ");
		int num = sc.nextInt();

		for (int i=0; i<size; i++){
		
			if (num==arr[i]){
			
				System.out.println(num + " found at index " + i);
			}
			else {
			
				System.out.println(num + " not found");
				break;
			}
		}
		
	}
}
