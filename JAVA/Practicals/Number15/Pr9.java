

import java.io.*;

class Pr9{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter number:- ");
		int num = Integer.parseInt(br.readLine());

		int temp = num; 
		int rev = 0;
		int rem = 0;

		while (num>0){
			
			rem = num %10;
			rev = rev * 10 + rem;
			num /= 10;

		}
		//System.out.println("Reverserd Number:- " + rev);
		if (rev==num){
		
			System.out.println(temp + " is a Palindrome Number");
		}
		else {
		
			System.out.println(temp + " is not a Palindrome Number");
		
		}
	}
}
