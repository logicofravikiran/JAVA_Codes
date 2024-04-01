
//1 2 3 4 
//4 3 2 1 
//1 2 3 4 
//4 3 2 1 

class Pattern18{

	public static void main(String[]args){
		
		
		int row =4;
		for(int i=1; i<=row; i++){
			int num = 4;
			for (int j=1; j<=row; j++){
			
				if (i%2==1){		
					System.out.print(j + " ");
				}
				else {
				
					System.out.print(num-- + " ");
				}
				
			}System.out.println();
			
		} 
		
	}
}
