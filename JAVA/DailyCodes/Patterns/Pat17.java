
//1 2 3 
//D E F 
//7 8 9 
//J K L

class Pattern17{

	public static void main(String[]args){
		
		int num = 1;
		int row =4;
		for(int i=1; i<=row; i++){
		
			for (int j=1; j<=3; j++){
			
				if (i%2==1){		
					System.out.print(num + " ");
				}
				else {
				
					System.out.print((char)(num+64) + " ");
				}num++;
				
			}System.out.println();
		} 
		
	}
}
