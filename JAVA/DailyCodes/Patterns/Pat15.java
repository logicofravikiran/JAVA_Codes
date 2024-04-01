
//1 2 3 
//3 2 1 
//1 2 3 
//3 2 1 
//1 2 3 
//3 2 1 

class Pattern15{

	public static void main(String[]args){
		int row =6;	
		for (int i=1; i<=row; i++){
			int num = 3;
			for (int j=1; j<=3; j++){
				
				if (i%2==1){
				
					System.out.print(j + " ");
				}else{
				
					System.out.print(num -- + " ");
				}
			}System.out.println();
		}
	}
}
