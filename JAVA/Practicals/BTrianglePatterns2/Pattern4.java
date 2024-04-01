

import java.io.*;

class Pattern4{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){
			int ch = 64 +rows ;
			for (int j=1 ; j<=i; j++){
				if (i%2==0){
				
					System.out.print((char)ch + " ");
				}	
				else {
				
					System.out.print((char)(ch+32)+ " ");

				}ch--;	
			}
			System.out.println();	
		}
	}
}
