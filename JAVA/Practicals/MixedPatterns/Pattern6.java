

import java.io.*;

class Pattern6{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());
		
		int temp = rows;

		for (int i=1; i<=rows; i++){
			
			int num = rows;
			for (int j=1; j<=i; j++){
				
				if (i%2==1){
				
					System.out.print((char)(num+96) + " ");	
				}
				else{
				
					System.out.print(num + " ");
				}
				num--;
			}
			System.out.println();
		}

	}
}
