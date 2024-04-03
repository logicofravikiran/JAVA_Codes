

import java.util.*;

class Pr3{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Array:- ");
		int size = sc.nextInt();

		char arr[] = new char[size];

		for(int i=0; i<size; i++){
		
			System.out.print("Enter characters:- ");
			arr[i] = sc.next().charAt(0);
		}

		for (int i=0; i<size; i++){
			if (arr[i]== 65 || arr[i]==69 || arr[i]==73 || arr[i]==79 || arr[i]==85 || arr[i]==97 || arr[i]==101 || arr[i]==105 || arr[i]==111 || arr[i]==117 ){
			
				System.out.println("Vowel"+ arr[i] + "Found at Index : " + i);
			}
		}
	}
}
