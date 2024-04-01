

//ASSIGNMENT OPERATORS ---> =, +=, -=, /=, *=, %=

class AssignmentOp{
	public static void main(String[]args){
		int x = 5;
		int y = 10;

		System.out.println("x=y = "+(x=y));		//assigns value of y to x 
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);

		System.out.println("x+=y = "+(x+=y));		//x=x+y //x=15
		System.out.println("x= "+ x);
		System.out.println("y= "+y);
		
		System.out.println("x-=y = "+(x-=y));		//x=x-y //x=5
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		System.out.println("x*=y = "+(x*=y));		//x=x*y //x=50
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		System.out.println("x/=y = "+(x/=y));		//x=x/y //x=5
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		System.out.println("x%=y = "+(x%=y));		//x=x%y //x=
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
