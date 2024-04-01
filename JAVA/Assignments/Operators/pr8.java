

class pr8{
	public static void main(String[]args){
		int a = 10;
		int b= 11;
		
		System.out.println((++a>=b)&&(a<++b));  	//true 
		System.out.println(a);      //11
		System.out.println(b);	//12
	}
}
