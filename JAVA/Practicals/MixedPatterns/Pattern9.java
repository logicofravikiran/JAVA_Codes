

import java.io.*;

class Pattern9{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter no.of Rows:- ");
		int rows = Integer.parseInt(br.readLine());
		int temp = rows;

		for(int i=1; i<=rows; i++){
			
			int num = 1;
			int ch = temp;
			for(int j=rows; j>=i; j--){
			
				if (i%2==1){
				
					System.out.print(num + " ");
					num++;
				}
				else{
				
					System.out.print((char)(ch+64)+ " ");
					ch--;
				}

			}temp--;
			System.out.println();
		}
	}
}

