

import java.io.*;

class Pr36{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter Your Name:- ");
		String name = br.readLine();

		System.out.print("Enter Society Name:- ");
		String socName = br.readLine();
		
		System.out.print("Enter Wing :- ");
		char wing = (char)br.read();
		
		br.skip(1);					//to skip the garbage values inside BufferedReader 
		System.out.print("Enter Flat No.:- ");
		int flatNo = Integer.parseInt(br.readLine());
		

		System.out.println("Name:-"+ name);
		System.out.println("Society:-"+ socName);
		System.out.println("Wing:-"+ wing);
		System.out.println("Flat No.:-"+ flatNo);
	}
}
