

import java.util.*;

class Pr6{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Array:- ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int pro = 1; 	
		for(int i=0; i<size; i++){
		
			System.out.print("Enter Element:- ");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++){
		
			if (i%2==1){
			
				pro *= arr[i];
			}
		}
		System.out.println("Product of Odd Indexed Elements:- " + pro);
	}
}
