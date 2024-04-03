

import java.util.*;

class Pr7{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Array:- ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		for(int i=0; i<size; i++){
		
			System.out.print("Enter Element:- ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Array:- ");
		if(size%2==0) {
			for (int i=0; i<size; i++){
		
				if (i%2==0){
			
					System.out.print(arr[i] + ",");
				}
			}
		}else{
		
			for (int i=0; i<size; i++){
			
				System.out.print(arr[i] + ",");
			}
		}
	}
}
