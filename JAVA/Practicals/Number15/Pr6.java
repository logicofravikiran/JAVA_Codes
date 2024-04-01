

import java.io.*;

class Pr6{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter number:- ");
		int num = Integer.parseInt(br.readLine());

		int temp = 1; 
		int rev = 0;
		int rem = 0;

		while (temp<=num){
			
			rem = num %10;
			rev = rev * 10 + rem;
			num /= 10;

			temp++;
		}
		System.out.println("Reverserd Number:- " + rev);
	}
}
