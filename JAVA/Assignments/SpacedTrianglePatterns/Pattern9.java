

import java.io.*;

class Pattern9{

	public static void main(String[]args) throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter no.of Rows:- ");
		int rows = Integer.parseInt(br.readLine());


		for (int i=1; i<=rows; i++){
		
			for (int sp=1; sp<=i-1; sp++){
			
				System.out.print(" " + "\t");
			}
			int ch = rows;
			for (int j=rows; j>=i; j--){
			
				System.out.print((char)(ch+64) + "\t");
				ch--;
			}

			System.out.println();
		}
	}
}
