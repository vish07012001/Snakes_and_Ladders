
// -----------------------------------------------------
// Assignment :1
// Written by: (Vishva Shah ,Student id:40154310 and Ferdous Hasnat Nayeem, Student id: 40112912)
// -----------------------------------------------------


import java.util.Scanner;
public class PlayLadderAndSnake {

	
	
	
	public static void main(String args[])
	{   Scanner sc = new Scanner(System.in);
	    System.out.println("Welcome\nWritten by Vishva Shah and Ferdous Hasnat Nayeem\n");
	   System.out.println("Enter the # of players for your game- Number must be\n between two and four inclusively:");
        int n = sc.nextInt();
        
		Snakes L = new Snakes();  

		boolean no_of_players=L.Check_players(n);

		
		/**
		 * Method to Check Validity of Players 
		 */
		
		
		if(no_of_players)
		{   int count = 0;
		    do {
		    	count++;
		    	if(count ==4)
				{System.out.println("Bad Attempt " +count+ " You have exhausted all of your chances. Program will terminate!");
				
				  System.exit(0);
				}
			System.out.println("Bad Attempt " +count+ " plaease enter a # inclusively between 2 and 4:");
			n = sc.nextInt();
			
			no_of_players=L.Check_players(n);
			
			
			
		    }while(no_of_players);
		}
		
		
		
		/** Valid player entries will be assigned to the constructor */
		
		L = new Snakes(n);
		
	
	
	
    /**
     * Scanner class close
     */
	sc.close();
	}
}

