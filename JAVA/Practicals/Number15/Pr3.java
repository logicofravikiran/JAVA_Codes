

import java.io.*;

class Pr3{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter number:- ");
		int num = Integer.parseInt(br.readLine());

		int temp = 1; 
		int count = 0;

		while (temp<=num){
		
			if (num%temp==0){
			
				count++;
			}
			temp++;
		}
		if (count>2){
		
			System.out.println(num + " is a Composite Number");
		}
		else{
		
			System.out.println(num + " is not a Composite Number");
		}
	}
}
