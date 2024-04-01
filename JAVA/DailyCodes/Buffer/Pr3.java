

import java.io.*;

class Pr3{

	public static void main(String[]args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Your Name: ");
		String name = br.readLine();
		System.out.println("Name:- "+ name);

	
	
	}
}
