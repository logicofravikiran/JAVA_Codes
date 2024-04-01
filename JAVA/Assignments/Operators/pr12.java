

class pr12{
	public static void main(String[]args){
		//Arithmetic 
		int a = 100;
		int b = 10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//unary
		int x = 10;
		System.out.println(++x);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
		
		//Relational
		int c = 5;
		int d = 8;
		System.out.println(c==d);
		System.out.println(c>d);
		System.out.println(c<d);
		System.out.println(c>=d);
		System.out.println(c<=d);
		System.out.println(c!=d);
		
		//Logical
		boolean r = true;
		boolean s = false;
		System.out.println(r&&s);
		System.out.println(r||s);
		System.out.println(!s);
		System.out.println(!r);
		
		//Bitwise
		int m = 8;	//0000 1000
		int n = 1;	//0000 0001
		System.out.println(m&n);
		System.out.println(m|n);
		System.out.println(m^n);
		System.out.println(~n);
		System.out.println(~m);

		//Assignment
		int p = 12;
		int q = 1;
		System.out.println(p=q);
		System.out.println(p+=q);
		System.out.println(p-=q);
		System.out.println(p*=q);
		System.out.println(p/=q);
		System.out.println(p%=q);

	}
}
