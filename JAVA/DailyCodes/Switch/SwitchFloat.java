

class SwitchFloat{
	public static void main(String[]args){
		float a = 2.5f;
		System.out.println("Before Switch");
		switch (a){
		
			case 1.5:
				System.out.println("1.5");
				break;
			case 2.0 :
				System.out.println("2.0");
				break;
			case 2.5:
				System.out.println("2.5");	
				break;
			default:
				System.out.println("In the Default State");
		}
		System.out.println("After Switch");
	}
}
