

import java.io.*;

class Pr4{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter number:- ");
		int num = Integer.parseInt(br.readLine()); 
		int fact = 1;
		int temp = num ;
		while (num>=1){
		
			fact *= num;
			num--;
		}
		System.out.println(temp + "!" + ":- "+ fact);
	}
}
