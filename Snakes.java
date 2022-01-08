// -----------------------------------------------------
// Assignment :1
// Written by: (Vishva Shah ,Student id:40154310 and Ferdous Hasnat Nayeem, Student id 40112912:)
// -----------------------------------------------------

/**
 *Assignment 1
 * Due Date:08-02-2021
 * @author Vishva Shah 40154310  and Ferdous Hasnat Nayeem 40112912
 */
public class Snakes {
    
	/** Instance variables */
	private String str[]=new String[100];
    private int[] snakes = new int[100];
	private int number_of_players;
	 private String [] name = {"A","B","C","D"};
	 private int[] dice_value;
	private boolean b=false;
	private int [] retain=new int[4];
	
	/** default constructor*/
	public Snakes()        
	{
		
		number_of_players=0;
	}
	
	 /**
	  *  constructor with one parameter 
	  *  @param n Number of players
	  */
	public Snakes(int n)  
	{
		/**if the number of players are valid, then the method sets number of players */
		if(!(Check_players(n)))    
		{setNumber_of_players(n);
		 play();
		
		}
	}
	
	
   /**
    * For Random Dice value
    * @return Random Dice value*/
    
	
	public int flipDice()              
	{
		int max = 6;
		
		
		int j = (int)(Math.random()*max)+1;
		return j ;
	}
	
	
	/**
	 * Method to check number of players
	 * @param n for number of players
	 * @return Return true or false
	 */
	public boolean Check_players(int n)          
	{
		if (n<2 || n>4)
		return true;
			
		return false;
	}
	
	
	/**
	 * Method for setting number of players
	 * @param number_of_players Number of players*/
	
	public void setNumber_of_players(int number_of_players)          
	{   this.number_of_players=number_of_players;                    
	    dice_value=new int[number_of_players];
		System.out.println("There are a total of "+getNumber_of_players()+" players who will play the game");
		
		for(int i =1;i<=number_of_players;i++)
		{   int z =i;
			System.out.println("The name of player "+i+" is "+name[--z]);
			}
		

	}
	
	/** 
  * Accessor method to get number of players
 * @return Number of players
	  */

	
	public int getNumber_of_players()                          
	{
		
		return(this.number_of_players);
	}
	
	
	/** Method for game concept */
	public void play()
	{
		System.out.println("\nNow deciding which player will start playing!\n");
		for(int i = 1; i<=number_of_players;i++)
		{   int z=i;
			dice_value[--z]=flipDice();
			System.out.println("Player "+name[z]+" got a dice value of "+dice_value[z]);
		}
		
		
		
		do {
			
			/**loop for tie*/
			
		for(int i =number_of_players-1;i>=0;i--)  
		{  
			 int z=i;
		    
			for(int j = 0; j<z;j++)
			{
				if(dice_value[j]==dice_value[z])
			{  
					
					i=number_of_players;
				b=true;
				do
				{
				System.out.println("\nPlayer "+name[j]+" and Player "+name[z]+" have a tie\nAttempting to break the tie!");
				dice_value[j]=flipDice();
				dice_value[z]=flipDice();
				System.out.println("\nPlayer "+name[j]+" got a dice value of "+dice_value[j]+"\nPlayer "+name[z]+" got a dice value of "+dice_value[z]);
				}while(dice_value[j]==dice_value[z]);
			}
				else
					b= false;
		}
		}
		}while(b);
		
		/** loop for order of paying*/
		for(int i = number_of_players-1;i>=0;i--)     
		{
			
			for(int j =0;j<i;j++)
			{
				if(dice_value[j]<dice_value[i])
				{   
					int swa=dice_value[j];
					dice_value[j]=dice_value[i];
					dice_value[i]=swa;
					
					String swap = name[j];
					name[j]=name[i];
					name[i]=swap;
				}

			}
			
		}
		
		System.out.print("\nReached final decision on order of playing:");
		for(int i =0;i<number_of_players;i++)
			System.out.print(name[i]+" ");
		    
			System.out.println();
		
			int [] initial = new int[number_of_players];
		    int [] final_pos = new int[number_of_players];
			for(int i =0;i<initial.length;i++)
		    {
		    	
		    	initial[i]=1;
		    }
			
			 
		    int c =1;
		    
		    /**To store numbers from 1 t0 100*/
		   
		    for(int i =0; i<100;i++)     
		{    
		
				snakes[i]=c;
			     c++;
			    
		}
			
		    /**To convert into String*/
		
		for(int i = 0;i<100;i++)           
		{
			

				 str[i] = String.valueOf(snakes[i]);
		}
		
		str[15]=str[47]=str[61]=str[63]=str[92]=str[94]=str[96]=str[97]="Snake";
		str[3]=str[8]=str[20]=str[27]=str[35]=str[50]=str[70]=str[79]="Ladder";
		
		
        int winner =0;
			do {
			
		    
		    
		    System.out.println();
		    
		  outer:  for(int m =0;m<initial.length;m++)
		    {
		    	
		    	final_pos[m]=flipDice();
		    	
		    	System.out.print("Player "+name[m]+" got dice value of "+final_pos[m]+"; gone to square "+(initial[m]+final_pos[m]));
		        initial[m]=initial[m]+final_pos[m];
		        if(initial[m]==16 || initial[m]==48 || initial[m]==62 || initial[m]==64 || initial[m]==93 || initial[m]==95 || initial[m]==97 || initial[m]==98)
		        {
		        	
		        	switch(initial[m])
		        	{
		        	
		        	  case 16:
		        		  initial[m]=6;
		        		  System.out.println(" then upto square " + initial[m]);
		        		  break;
		        		  
		        	  case 48:
		        		  initial[m]=30;
		        		  System.out.println(" then upto square " + initial[m]);
                           break;
                           
		        	  case 62:
		        		  initial[m]=19;
		        		  System.out.println(" then upto square " + initial[m]);
                          break;
                          
		        	  case 64:
		        		  initial[m]=60;
		        		  System.out.println(" then upto square " + initial[m]);
                          break;
                          
		        	  case 93:
		        		  initial[m]=68;
		        		  System.out.println(" then upto square " + initial[m]);
                          break;
                          
		        	  case 95:
		        		  initial[m]=24;
		        		  System.out.println(" then upto square " + initial[m]);
                          break;
		        	  case 97:
		        		  initial [m]=76;
		        		  System.out.println(" then upto square " + initial[m]);
                          break;
		        	  case 98:
		        		  initial[m]=78;
		        		  System.out.println(" then upto square " + initial[m]);
                          break;
		        	
		        	}
		        }
		        
		        else if (initial[m]==4 || initial[m]==9 || initial[m]==21 || initial[m]==28 || initial[m]==36 || initial[m]==51 || initial[m]==71 || initial[m]==80)
		        {
		        	
		        	switch(initial[m])
		        	{
		        	case 4:
		        		initial[m]=14;
		        		  System.out.println(" then upto square " + initial[m]);
		        		break;
		        		
		        	case 9:
		        		initial[m]=31;
		        		  System.out.println(" then upto square " + initial[m]);
		        		break;
		        		
		        	case 21:
		        	initial[m]= 42;
	        		  System.out.println(" then upto square " + initial[m]);
		        	break;
		        	
		        	case 28:
		        		initial[m]=84;
		        		  System.out.println(" then upto square " + initial[m]);
		        		break;
		        		
		        	case 36:
		        		initial[m]=44;
		        		  System.out.println(" then upto square " + initial[m]);
		        		break;
		        		
		        	case 51:
		        		initial[m]=67;
		        		  System.out.println(" then upto square " + initial[m]);
		        		break;
		        		
		        	case 71:
		        		initial[m]=91;
		        		  System.out.println(" then upto square " + initial[m]);
		        		break;
		        		
		        	case 80:
		        		initial[m]=100;
		        		  System.out.println(" then upto square " + initial[m]);
		        		  System.out.println("Player "+name[m]+" is Winner!");
		        		  winner = 1;
		        		  retain[m]=initial[m];
		                  str[initial[m]-1]=name[m];
		        		break outer;
		        		
		        	
		        	
		        	}
		        }
		        
		        else if(initial[m]>100)
		        {
		        	int difference = initial[m]-100;
		        	initial[m]=100-difference;
	        		  System.out.println(" gone to square " + initial[m]);

		        }
		        
		        else if (initial[m]==100)
		        {
		        	 winner = 1;
		        	 System.out.println("\n Player " + name[m] + " is Winner!");
		        	 retain[m]=initial[m];
		                str[initial[m]-1]=name[m];
		                break;
		        	 
		        }
		        else
		        	System.out.println();
		        retain[m]=initial[m];
                str[initial[m]-1]=name[m];
		        
		    }
		    
		   System.out.println();
		    int count = 0;
			int i =99;
		
		
			/* For displaying ladders*/
		for(  ; i>=0;i--)                   
		{  
		 if(i==89 ||i==69||i==49||i==29||i==9)
		 {
			for(int z = i-9;z<=i;z++)
				System.out.print(str[z]+"\t");
			System.out.println();
			i=i-9;
		 }
		 else
		 	{System.out.print(str[i]+"\t");
			
			count++;
			if(count==10)
			{
				System.out.println();
				count =0;
			}
			}
		}
		
	    for(int m =0;m<initial.length;m++)
	    {
	    	 str[initial[m]-1]=String.valueOf(retain[m]);
	    	
	    }
		
		
		  
			}while(winner<1);
		
	}
	
	
}
