

class pr7{
	public static void main(String[]args){
		int num = 100;	
		num--;				//num = 99
		System.out.println(num<<1); 	//0110 0011 ----> //1100 0110 (198)
		num = num>>>1; //0011 0001
		num+=3;  	//102
		System.out.println(num); //52
	}
}
