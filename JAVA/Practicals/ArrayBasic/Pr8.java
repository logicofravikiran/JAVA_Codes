

import java.io.*;

class Pr8{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter the Count of Employees :- ");
		int count = Integer.parseInt(br.readLine());

		int arr[] = new int[count];

		for (int i=0; i<arr.length; i++){
			System.out.print("Enter Age :- ");
			arr[i] = Integer.parseInt(br.readLine());

		}
		System.out.print("Age of Employees:- ");
		for (int i=0; i<arr.length; i++){
			
			System.out.print(arr[i] + ",");
			
		}
	}
}
