

import java.io.*;

class Pattern6{

	public static void main(String[]args) throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter no.of Rows:- ");
		int rows = Integer.parseInt(br.readLine());

		int num = rows; 

		for (int i=1; i<=rows; i++){
		
			for (int sp=1; sp<=i-1; sp++){
			
				System.out.print(" " + "\t");
			}

			for (int j=rows; j>=i; j--){
			
				System.out.print(num + "\t");
			}
						
			System.out.println();
			num--;
		}
	}
}
