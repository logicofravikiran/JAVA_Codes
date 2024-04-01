


class Cricket{
	public static void main(String[]args){
		String teamName = "INDIA";
		String player1 = "Virat Kohli*";
		String player2 = "M S Dhoni";
		short runs = 183;
	 	float overs = 19.4f;
		byte wickets = 4;
		int crowd = 98567;
		long cost = 2155544666l;
		boolean status = true ;
		System.out.println(" ");
		System.out.println("------------------India's Scorecard------------------------");
		System.out.println("**Batting**");
		System.out.println("Score-> "+runs +"/"+wickets+" in "+overs);
		System.out.println(player1 +" & "+ player2);
		System.out.println("  ");
		System.out.println("Total Attendance-> "+ crowd);
		System.out.println("Cost= "+cost);
		System.out.println(" ");
		System.out.println("Win / Loss-> "+status);
		System.out.println("Winner= "+teamName);
		System.out.println("  ");
		System.out.println("*Condition-true for win & false for loss");
	}

	

}
