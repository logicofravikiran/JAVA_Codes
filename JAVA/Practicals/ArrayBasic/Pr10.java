

import java.io.*;

class Pr10{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter the size of the array:- ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		for (int i=0; i<arr.length; i++){
			System.out.print("Enter Element:- ");
			arr[i] = Integer.parseInt(br.readLine());

		}
		int sum = 0; 
		for (int i=0; i<arr.length; i++){
			
			if (arr[i]%2==1){	
			
				sum += arr[i];
			}
		}
		System.out.print("SUM:- "+ sum);
	}
}
