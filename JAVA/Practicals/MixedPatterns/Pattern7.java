

import java.io.*;

class Pattern7{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());
		
		int num = 1; 		

		for (int i=1; i<=rows; i++){
			
			for (int j=rows; j>=i; j--){
				
				System.out.print(num*2 + " ");	
				num++;
			}
			System.out.println();
		}

	}
}
