

import java.io.*;

class Pattern5{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());

		for (int i=1; i<=rows; i++){
			char ch = 'A';
			
			for(int j=rows; j>=i; j--){
				
				if (i%2==1){
				
					System.out.print(ch + " ");
				}
				else {
				
					System.out.print((char)(ch+32)+ " ");

				}ch++;

			}System.out.println();
		}
	}
}
