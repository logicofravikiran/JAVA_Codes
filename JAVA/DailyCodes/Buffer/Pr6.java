
import java.io.*;

class Pr6{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Student Name: ");
		String name = br.readLine();
			
		System.out.print("Enter Your CGPA Score: ");
		float marks = Float.parseFloat(br.readLine());

		System.out.println("Student Name: "+ name);
		System.out.println("Your Score: "+ marks);
	}
}
