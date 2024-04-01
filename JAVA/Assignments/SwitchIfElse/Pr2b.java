

class Pr2b{

	public static void main(String[]args){
	
		char grades = 'u';
		switch(grades){
		
			case 'O':
				System.out.println("Outstanding");	
				break;	
				
			case 'A':
				System.out.println("Excellent");
				break;

			case 'B':
				System.out.println("Very Good");
				break;

			case 'C':
				System.out.println("Good");
				break;

			case 'D':
				System.out.println("Above Average");
				break;

			case 'E':
				System.out.println("Average");
				break;

			case 'P':
				System.out.println("Pass");

			case 'F':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Please Enter valid grade");	


		}
	}
}
