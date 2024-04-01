

import java.io.*;

class Pattern10{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter the number :- ");
		long num = Long.parseLong(br.readLine());

		long rem = 0;

		while(num>0){
		
			rem = num%10;
			num /= 10;

			if (rem%2==1){
			
				System.out.print(rem*rem + ",");
			}
		}
	}
}
