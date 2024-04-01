

import java.io.*;

class Pr28{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter Your Name:- ");
		String name = br.readLine();
		
		br.close();

		System.out.print("Enter Society Name:- ");
		String socName = br.readLine();

		System.out.print("Enter Wing :- ");
		String wing = br.readLine();
		
		System.out.print("Enter Flat No.:- ");
		String flatNo = br.readLine();

		System.out.println("Name:-"+ name);
		System.out.println("Society:-"+ socName);
		System.out.println("Wing:-"+ wing);
		System.out.println("Flat No.:-"+ flatNo);
	}
}
