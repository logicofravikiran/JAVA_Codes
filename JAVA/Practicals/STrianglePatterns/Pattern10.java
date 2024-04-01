

import java.util.Scanner;

class Pattern10{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();
		int temp = rows;
		int ch = 64; 
		for(int i=1; i<=rows; i++){
			ch = 64 + i ;
			for (int j=1; j<=(temp) ; j++){
				if (rows%2==1){
					
					if (ch%2==1){
						
						System.out.print((char)ch + " ");
					}
					else{
					
						System.out.print(ch + " " );
					}	
				}
				else{
				
					if (ch%2==1){
					
						System.out.print(ch + " ");
					}
					else {
					
						System.out.print((char)ch + " ");
					}
				}

					
				ch++;
				
			}temp--;
			System.out.println();
		}

	}
}
