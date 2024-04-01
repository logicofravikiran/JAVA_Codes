

import java.io.*;

class Pattern8{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());

		int sum = 0;

		for(int i=1; i<=rows; i++){
		
			sum += i;
		}
		//System.out.println(sum);

		for (int i=1; i<=rows; i++){
		
			for(int j=rows; j>=i; j--){
			
				System.out.print((char)(sum+64) + " ");
				sum--;
			}
			System.out.println();
		}
	}
}
