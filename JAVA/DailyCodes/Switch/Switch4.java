

class Switch4{
	public static void main(String[]args){
		int a = 2;
		System.out.println("Before Switch");
		switch (a){
		
			case 1:
				System.out.println("ONE");
				break;
			case 2 :
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");	
				break;
			default:
				System.out.println("In the Default State");
		}
		System.out.println("After Switch");
	}
}
