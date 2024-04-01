
import java.io.*;

class Pattern9{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	

		System.out.print("Enter no. of rows:- ");
		int rows = Integer.parseInt(br.readLine());
		int temp = rows;

		for(int i = 1 ; i<=rows; i++){

			int ch = 64 + rows;

			for (int j=i; j<=temp; j++){
			
				System.out.print((char)ch-- + " ");

			}
			System.out.println();
		}
	}
}
