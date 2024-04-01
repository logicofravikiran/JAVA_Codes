


import java.io.*;

class Pr5{

	public static void main(String[]args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Your Name: ");
		String name = br.readLine();

		System.out.print("Enter Company Name: ");
		String cmpname = br.readLine();
		
		System.out.print("Enter Employee ID : ");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Name:- "+ name);
		System.out.println("Company Name:- "+ cmpname);
		System.out.println("Employee ID :- "+ empId);

	
	
	}
}
