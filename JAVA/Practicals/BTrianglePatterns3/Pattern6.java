
import java.io.*;

class Pattern6{

	public static void main(String[]args)throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	

		System.out.print("Enter no.of rows:- ");
		int rows = Integer.parseInt(br.readLine());
		int temp = rows;


		for(int i=1; i<=rows; i++){
			
			int num = 1;
			char ch = 'a';
			
			for(int j=1; j<=temp; j++){
			
				if (j%2==1){
				
					System.out.print(num + " ");
					num ++;
				}
				else{ 
				
					System.out.print(ch + " ");
					ch++;
				}

			}
			temp--;
			System.out.println();
		}
	}
}
