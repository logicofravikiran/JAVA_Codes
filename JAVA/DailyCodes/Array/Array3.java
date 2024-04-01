

import java.util.*;

class Array3{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		float empSal[] = new float[3];
		
		System.out.println(empSal[0]);
		System.out.println(empSal[1]);
		System.out.println(empSal[2]);

		System.out.print("Enter Salary No.:- ");
		empSal[0] = sc.nextFloat();
		System.out.print("Enter Salary No.:- ");
		empSal[1] = sc.nextFloat();
		System.out.print("Enter Salary No.:- ");
		empSal[2] = sc.nextFloat();

		System.out.println(empSal[0]);
		System.out.println(empSal[1]);
		System.out.println(empSal[2]);
	}
}
