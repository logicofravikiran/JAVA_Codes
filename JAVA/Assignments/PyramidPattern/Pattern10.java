

import java.util.*;

class Pattern10{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();
		int num = rows;

		for (int i=1; i<=rows; i++){
		
			for (int sp=rows; sp>i; sp--){
			
				System.out.print(" "+ "\t");
			}
			for (int j=1; j<=i*2-1; j++){
			
				if (j<i){
					System.out.print((char)(num+64) + "\t");
					num++;
				}
				else {
				
					System.out.print((char)(num+64) + "\t");
					num--;
				}
			}
			System.out.println();
		}
		
	}
}
