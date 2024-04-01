

class pr14{
	public static void main(String[]args){
		float marks = 85.90f;
		if(marks>=85.00){
			System.out.println("Take Medical Field");
		}
		else if (marks>=75.00 && marks<85.00){
			System.out.println("Take Engineering Field");
		}	
		else if (marks>=65.00 && marks<75.00){
			System.out.println("Take Pharmacy or Bachelor of Science");
		}
		else {	
			System.out.println("Start your Business");	
		}	
	}
}
