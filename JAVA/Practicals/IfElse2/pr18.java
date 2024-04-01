

class pr18{
	public static void main(String[]args){
		float percent = 0f;

		if(percent >= 75.00 && percent<=100){
			System.out.println("First class with distincion");
		}

		else if (percent >= 60.00 && percent < 75.00){
			System.out.println("First class");
		}	

		else if (percent >= 50.00 && percent < 60.00){
			System.out.println("Second Class");
		}

		else if (percent >= 40 && percent <50.00) {	
			System.out.println("Pass");	
		}	
		
		else if (percent <40 && percent>=0) {
			System.out.println("Fail");		
		}

		else {
			System.out.println("Invalid Input");
		}
	}
}
