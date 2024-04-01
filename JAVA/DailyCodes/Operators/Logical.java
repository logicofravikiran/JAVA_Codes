

//LOGICAL OPERATORS ---> true or false 
//-----> && (logical AND), ||(logical OR) , !(logical NOR)
//
//condition ---> both operands should be of boolean type
//if not then it will give error about bad operands type according to sign
//

class LogicalOp{
	public static void main(String[]args){
		boolean x = true;
		boolean y = false;
		System.out.println("x&&y= "+(x&&y));
		System.out.println("x||y= "+(x||y));
		System.out.println("!y= "+(!y));
		System.out.println("!x= "+(!x));

	}
}


