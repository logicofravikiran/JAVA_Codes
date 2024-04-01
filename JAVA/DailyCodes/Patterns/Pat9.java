
//9 B 7 D 5 F 3 H 1

class Pattern9{

	public static void main(String[]args){
		
		char ch = 'A';	
		int num =9;
		for(int i=1; i<=9; i++)	{
			if (i%2==1){
				System.out.print(num + " ");
			}
			else {
			
				System.out.print(ch + " ");
			}
			ch++;
			num--;
		}	
	}
}
