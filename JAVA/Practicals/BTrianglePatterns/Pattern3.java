

import java.io.*;

class Pattern3{

	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());
		int ch = 'A';
		for(int i=1; i<=rows; i++){
			ch = i+64;
			for (int j=1; j<=i; j++){
			
				System.out.print((char)(ch++) +" ");

			}
			System.out.println();
		}
	}
}
