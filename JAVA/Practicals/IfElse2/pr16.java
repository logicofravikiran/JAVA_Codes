


class pr16{
	public static void main(String[]args){
		int age = 31;
		if (age>=0){
			System.out.println("Valid Age");
			if (age>=18){
				System.out.println("You are eigible for voting");
			}else{	
				System.out.println("You are not eigible for voting");
			}
		}
		else {	
				System.out.println("Enter Positive age");
		}
	}
}
