

import java.util.*;

class Pattern10{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();

		int temp = rows;

		for(int i=1; i<=rows; i++){
			int num = temp ;
			for (int j=1; j<=temp; j++){
			
				if (temp%2==1){
				
					System.out.print((char)(num+96) + " ");
				}
				else {
				
					System.out.print((char)(num+64)+ " ");

				}
				num--;

			}
			temp--;
			System.out.println();
		}
	}
}
