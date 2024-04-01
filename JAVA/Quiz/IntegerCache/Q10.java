

class Q10{

	public static void main(String[]args){
	
		char ch1 = 'A'; 
		int ch2 = 65; 

		if (System.identityHashCode(ch1)==System.identityHashCode(ch2)){
		
			System.out.println("Same");
		}
		else{
		
			System.out.println("Different");
		}
	}
}
