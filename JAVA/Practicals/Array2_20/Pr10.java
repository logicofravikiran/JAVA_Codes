

import java.util.*;

class Pr10{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Array:- ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		for(int i=0; i<size; i++){
		
			System.out.print("Enter Element:- ");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for (int i=0; i<(size-1); i++){
		
			if (arr[i]>=arr[i+1]){
				
				int temp = arr[i];
				if (max<temp){
				
					max = temp;
				}
				
			}
			else{
			
				int temp = arr[i+1];
				if (max<temp){
				
					max = temp;
				}
			}
		}
		System.out.println("Maximum Element:- "+ max);
	}
}
