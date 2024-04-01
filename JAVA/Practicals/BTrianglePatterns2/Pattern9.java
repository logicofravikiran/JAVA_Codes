
import java.io.*;

class Pattern9{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter No.of Rows:- ");
		int rows = Integer.parseInt(br.readLine());
		char ch = 'a';
		for(int i=1; i<=rows; i++){
			int num = rows+1;
			for(int j=1; j<=i; j++){
			
				
				if (j%2==1){
					System.out.print(num + " ");
				}	
				else{
					
					System.out.print(ch + " ");
					ch++;
				}
				num ++;
			}
			System.out.println();
		}
	}
}

