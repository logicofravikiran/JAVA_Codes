
//1 8 3 64 5 216 
class Pattern3{

	public static void main(String[]args){
	
		for(int i = 1; i<=6; i++){
		
			if (i%2==1){
			
				System.out.print(i + " ");
			}
			else {
			
				System.out.print(i*i*i + " ");
			}
			
		}System.out.println();
	}
}
