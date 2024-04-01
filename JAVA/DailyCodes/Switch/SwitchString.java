

class SwitchString{
	public static void main(String[]args){
		String friends = "Kanha";
		System.out.println("Before Switch");
		switch (friends){
		
			case "Ashish":
				System.out.println("Barclays");
				break;
			case "Kanha" :
				System.out.println("BMC Software");
				break;
			case "Rahul" :
				System.out.println("Infosys");	
				break;
			default:
				System.out.println("In the Default State");
		}
		System.out.println("After Switch");
	}
}
