

import java.io.*;

class Pattern6{

	public static void main(String[]args)throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());
		int temp = rows;
		for(int i=1; i<=rows; i++){
			for (int j=rows; j>=i; j--){
			
				System.out.print(temp +" ");

			}temp--;
			System.out.println();
		}
	}
}
