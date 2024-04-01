

import java.util.*;

class Pattern2{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();
		int num = 1;

		for (int i=1; i<=rows; i++){
		
			for(int j=rows; j>=i; j--){
			
				System.out.print(num*2 + " ");
				num++;
			}
			System.out.println();
		}
	}
}
