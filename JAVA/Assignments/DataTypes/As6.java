

class Date{
	public static void main(String[]args){
		
		short date, month, year;
		date = 24;
		month = 04;
		year = 2003;
		System.out.println("Date= "+date +"/"+month+"/"+year);

		int secDay, secMonth1, secMonth2, secMonth3, secMonth4,secYear1,secYear2;
		secDay = 86400;
		
		secMonth1 = 2419200;
		secMonth2 = 2505600;
		secMonth3 = 2592000;
		secMonth4 = 2678400;

		System.out.println("Seconds in a Day = "+ secDay);
		System.out.println("Seconds in a 28 days Month = "+ secMonth1);
		System.out.println("Seconds in a 29 days Month = "+ secMonth2);
		System.out.println("Seconds in a 30 days Month = "+ secMonth3);
		System.out.println("Seconds in a 31 days Month = "+ secMonth4);
		
		secYear1 = 31536000;
		secYear2 = 31622400;
		
		System.out.println("Seconds in a Year= "+ secYear1);
		System.out.println("Seconds in a LEAP Year= "+ secYear2);


	}

}
