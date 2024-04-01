

class Logical1{
	public static void main(String[]args){
		int x = 10;
		int y = 50;

		System.out.println((x>=y)&&(x<y));	//false (Always Remember :- in && if there is FALSE then it will not visit or operate other side)
		System.out.println((x<=y)||(x<y));	//true (Always Remember :- in && if there is TRUE then it will not visit or operate other side)  
		System.out.println(!(x<y));		//false
	
	}

}
