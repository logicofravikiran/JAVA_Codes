

import java.util.*;

class Pattern9{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();

		int sum = 0;

		for(int i=1; i<=rows; i++){
		
			sum += i;
		}
		//System.out.println(sum);

		for (int i=1; i<=rows; i++){
		
			for(int j=rows; j>=i; j--){
			
				System.out.print(((sum*2)-1) + " ");
				sum--;
			}
			System.out.println();
		}
	}
}
