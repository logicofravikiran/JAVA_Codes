

class SwitchChar{
	public static void main(String[]args){
		char data = 'B';
		System.out.println("Before Switch");
		switch (data){
		
			case 'A':
				System.out.println("A");
				break;
			case 65:
				System.out.println("65");
				break;	
			case 'B' :
				System.out.println("B");
				break;
			case 66:
				System.out.println("66");
				break;	
			case 'C' :
				System.out.println("C");	
				break;
			default:
				System.out.println("In the Default State");
		}
		System.out.println("After Switch");
	}
}
