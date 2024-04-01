

import java.io.*;

class Pr6{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter the size of the array:- ");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];

		for (int i=0; i<arr.length; i++){
			System.out.print("Enter Element:- ");
			arr[i] = (char)br.read();

		}
		for (int i=0; i<arr.length; i++){
				
			System.out.print(arr[i] + ",");
		}
	}
}
