

import java.io.*;

class Pr1{

	public static void main(String[]args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of Array:- ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		int count = 0;

		for (int i=0; i<size; i++){
		
			System.out.print("Enter Element:- ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print("Even numbers:- ");
		for(int i=0; i<size; i++){
		
			if (arr[i]%2==0){
			
				count++;
				System.out.print(arr[i] + "\t");
			}
		}
		System.out.println();
		System.out.println("Count of Even Numbers:- "+ count);

	}
}
