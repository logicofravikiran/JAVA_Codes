

import java.util.*;

class Pattern7{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();
		
		int temp = rows;
		
		for(int i=1; i<=rows; i++){
			int num = temp ;
			int ch = temp;
			for(int j=1; j<=temp; j++){
			
				if (j%2==1){
				
					System.out.print(num + " ");

				}
				else {
				
					System.out.print((char)(ch+96) + " ");
					
					
				}num--;	
				ch--;
			}
			temp--;
			System.out.println();
		}
	}
}
