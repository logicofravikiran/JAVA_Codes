

import java.io.*;

class Pattern3{

	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

		System.out.print("Enter no.of Rows:- ");
		int rows = Integer.parseInt(br.readLine());

		for (int i=1; i<=rows; i++){
		
			for (int sp=rows-1; sp>=i; sp--){
			
				System.out.print("  " + "\t");
			}

			int num = 1; 

			for(int j=1; j<=i; j++){
			
				System.out.print((char)(num+64) + "\t");
				num++;
			}

			System.out.println();
		}
	}
}
