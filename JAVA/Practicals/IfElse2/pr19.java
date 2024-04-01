

class pr19{
	public static void main(String[]args){
		int a,b,c;
		a=2;b=2;c=4;

		if (a>b && a>c){
			if ((a*a) == (b*b) + (c*c)){
				System.out.println("Yes!!"+ a +", "+ b +", "+ c+" Are Pythagorian Triplet");
			}
			else{
				System.out.println("Not a Pythagorian Triplet");
			}
		}
			
		else if (b>a && b>c){
			if ((b*b) == (a*a) + (c*c)){
				System.out.println("Yes!!"+ a +", "+ b +", "+ c+" Are Pythagorian Triplet");
			}
			else{
				System.out.println("Not a Pythagorian Triplet");
			}
		}

		else if (c>a && c>b){
			if ((c*c) == (b*b) + (a*a)){
				System.out.println("Yes!!"+ a +", "+ b +", "+ c+" Are Pythagorian Triplet");
			}
			else{
				System.out.println("Not a Pythagorian Triplet");
			}
		}
		else{	
				System.out.println("Not a Pythagorian Triplet");
		}
	}	
}
