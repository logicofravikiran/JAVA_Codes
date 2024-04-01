
class Pr3b{

	public static void main(String[]args){
	
		String size = "S";
		switch(size){
		
			case "XXXL":
				System.out.println("Trible Extra Large");	
				break;	
				
			case "XXL":
				System.out.println("Double Extra Large");
				break;

			case "XL":
				System.out.println("Extra Large");
				break;

			case "L":
				System.out.println("Large");
				break;

			case "M":
				System.out.println("Medium");
				break;

			case "S":
				System.out.println("Small");
				break;

			case "XS":
				System.out.println("Extra Small");

			default:
				System.out.println("Please Enter valid size");	


		}
	}
}
