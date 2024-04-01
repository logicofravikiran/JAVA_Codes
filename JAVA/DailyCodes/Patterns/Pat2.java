
// 1 4 3 16 5 36 7 64 9
class Pattern2{

	public static void main(String[]args){
	
		for(int i = 1; i<=9; i++){
		
			if (i%2==1){
			
				System.out.print(i + " ");
			}
			else {
			
				System.out.print(i*i + " ");
			}
			
		}System.out.println();
	}
}
