

import java.io.*;

class Pr1{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter number:- ");
		int num = Integer.parseInt(br.readLine());

		int temp = 1; 

		while (temp<=num){
		
			if (num%temp==0){
			
				System.out.print(temp + " ");
			}
			temp++;
		}
	}
}
