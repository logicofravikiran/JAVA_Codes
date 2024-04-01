

import java.io.*;

class Pattern8{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());

		int temp = rows;

		for(int i=1; i<=rows; i++){
			int num = temp ;
			for (int j=1; j<=temp; j++){
			
				if (i%2==1){
				
					System.out.print(num + " ");
				}
				else {
				
					System.out.print((char)(num+64)+ " ");

				}
				num--;

			}
			temp--;
			System.out.println();
		}
	}
}
