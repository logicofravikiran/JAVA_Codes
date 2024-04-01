

import java.io.*;

class Pr7{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Employee Name: ");
		String name = br.readLine();
		
		System.out.print("Enter Employee ID: ");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Employee Salary: ");
		double sal = Double.parseDouble(br.readLine());
		
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("Employee Name:- "+ name);
		System.out.println("Employee ID:- "+ empId);
		System.out.println("Employee Salary:- "+ sal+ " Cr");

		
	}
}
