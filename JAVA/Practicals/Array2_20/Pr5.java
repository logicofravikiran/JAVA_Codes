		

import java.util.*;

class Pr5{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Array:- ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		for(int i=0; i<size; i++){
		
			System.out.print("Enter Element:- ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Odd Indexed Elements:- ");
		for (int i=0; i<size; i++){
		
			if (i%2==1){
			
				System.out.print(arr[i] + ",");
			}
		}
	}
}
