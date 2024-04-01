

class Logical2{
	public static void main(String[]args){
		int x = 5;
		int y = 3;
		System.out.println((x--<++y)&&(x++<=y--));				//false
				//x=4!<y=4
				//false
				//hence will not visit another side of the operation 
		System.out.println(x);							//x=4
		System.out.println(y);							//y=4

		int a = 10;
		int b = 12;
		System.out.println((++a>=--b)&&(--a<+b++));		//true 
				//a=11==b=11
				//true
		//will traverse to another
		//side of the operation
					     //a=10<b=12
					     //true
		//overall operation results
		//true && true ---> true

		System.out.println(a);		//a = 10
		System.out.println(b);		//b = 12
				
	}
}
