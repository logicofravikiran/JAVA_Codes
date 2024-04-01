

//UNARY OPERATORS---> operators which have only one operand
//---> + , - , ++(increament operator) , --(Decreament Operator)

class UnaryOp{
	public static void main(String[]args){
		int x = 10;
		System.out.println(+x);		//10
		System.out.println(-x);		//-10
		
		System.out.println(++x);	//11
		int y = 3;
		System.out.println(--y);	//2
		
		
		int z = 10;
		System.out.println(z++);	//10
		System.out.println(z);		//11
		
		int w = 66;
		System.out.println(w--);	//66	
		System.out.println(w);		//65
	}
}
