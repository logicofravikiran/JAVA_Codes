

import java.io.*;

class Pattern10{

	public static void main(String[]args) throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.print("Enter no.of Rows:- ");
		int rows = Integer.parseInt(br.readLine());
		int temp = rows; 

		for (int i=1; i<=rows; i++){
		
			for (int sp=1; sp<=i-1; sp++){
			
				System.out.print(" " + "\t");
			}
			int ch = i;
			for (int j=1; j<=temp; j++){
				
				if (i%2==0){
					if(j%2==1){ 
					
						System.out.print((ch+64) + "\t");
					}
					else {
				
						System.out.print((char)(ch+64) + "\t");
					}
					ch++;
				}
				else {
				
					if (j%2==0){
					
						System.out.print((ch+64) + "\t");
					}
					else {
					
						System.out.print((char)(ch+64) + "\t");
					}
				}
			}
			temp--;
			System.out.println();
		}
	}
}
