

class Pr2a{

	public static void main(String[]args){
	
		char grade = 'P';
		if(grade=='O'){
		
			System.out.println("Outstanding");
		}
		else if(grade=='A'){
		
			System.out.println("Excellent");
		}
		else if(grade=='B'){
		
			System.out.println("Very Good");
		}
		else if(grade=='C'){
		
			System.out.println("Good");
		}
		else if(grade=='D'){
		
			System.out.println("Above Average");
		}
		else if(grade=='E'){
		
			System.out.println("Average");
		}
		else if(grade=='P'){
		
			System.out.println("Pass");
		}
		else if(grade=='F'){
		
			System.out.println("Fail");
		}else{
		
			System.out.println("Please enter Valid grade to get Appropriate Remark according to the Grade");
		}
	}
}
