

import java.io.*;

class Pattern2{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter the No.of Rows :- ");
		int rows = Integer.parseInt(br.readLine());
		int temp = rows;

		for (int i=1; i<=rows; i++){
			int num = temp;
			for(int j=1; j<=rows; j++){
			
				System.out.print((char)(rows+64));
				System.out.print(num + " ");
				num--;
			}
			temp++;
			System.out.println();
		}

	}
}
