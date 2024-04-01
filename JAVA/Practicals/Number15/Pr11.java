

import java.io.*;

class Pr11{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

		System.out.print("Enter the Number :- ");
		long num = Long.parseLong(br.readLine());

		long rem = 0;
		long rev = 0;

		while(num>0){
		
			rem = num % 10;
			rev = rev*10 + rem;
			num /= 10;

		}
		System.out.println("Reversed Number:- "+ rev);
	}
}
