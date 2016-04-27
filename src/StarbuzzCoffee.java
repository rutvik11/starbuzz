import java.util.Scanner;

public class StarbuzzCoffee {
    public static void main(String args[]) {
    	
    	// order up an expresso ,no condiments and print its description and cost
       /* Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        
        // make a darkroast object
        // wrap it with a mocha
        // wrap it a second mocha
        // wrap it in a whip
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
        
        // Finally give us a HouseBlend with soy,Mocha and whip
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    */
    	Scanner inp= new Scanner(System.in);
    	int ch = 0,n=0;
    	System.out.println("STARBUCKS COFFEE CAFE");
    	System.out.println();
    	while(ch!=4)
    	{
    		System.out.println("Please Enter the Choice");
    		System.out.println("1.Expresso      $1.99");
    		System.out.println("2.Dark Roast	$0.95");
    		System.out.println("3.House Blend	$0.89");
    		System.out.println("4.Exit");
    		ch=inp.nextInt();
    		
    		switch(ch)
    		{
    			case 1: Beverage beverage1 = new Expresso();
    					while(n!=4)
    					{
    				
    						System.out.println("Please Enter the Choice");
    						System.out.println("1.Mocha 	$0.20");
    						System.out.println("2.Whip  	$0.60");
    						System.out.println("3.Soy		$0.40");
    						System.out.println("4.Exit");
    						n=inp.nextInt();
    						if(n==1)
    						{
    							beverage1 = new Mocha(beverage1);
    						}
    						else if(n==2)
    						{
    							beverage1 = new Whip(beverage1);
    						}
    						else if(n==3)
    						{
    							beverage1 = new Soy(beverage1);
    						}
    						else if(n==4)
    						{
    							System.out.println("Your Bill is "+" $" + beverage1.cost()+" for "+beverage1.getDescription()
    		    		                );
    							System.exit(0);
    						}
    					}
    					
    			case 2: Beverage beverage2 = new DarkRoast();
						while(n!=4)
						{
			
							System.out.println("Please Enter the Choice");
							System.out.println("1.Mocha 	$0.20");
							System.out.println("2.Whip  	$0.60");
							System.out.println("3.Soy		$0.40");
							System.out.println("4.Exit");
							n=inp.nextInt();
							if(n==1)
							{
								beverage2 = new Mocha(beverage2);
							}
							else if(n==2)
							{
								beverage2 = new Whip(beverage2);
							}
							else if(n==3)
							{
								beverage2 = new Soy(beverage2);
							}
							else if(n==4)
							{
								System.out.println("Your Bill is "+" $" + beverage2.cost()+" for "+beverage2.getDescription()
	    		                );
								System.exit(0);
							}
						}
						
    			case 3: Beverage beverage3 = new HouseBlend();
    					while(n!=4)
    					{
	
    						System.out.println("Please Enter the Choice");
    						System.out.println("1.Mocha 	$0.20");
    						System.out.println("2.Whip  	$0.60");
    						System.out.println("3.Soy		$0.40");
    						System.out.println("4.Exit");
    						n=inp.nextInt();
    						if(n==1)
    						{
    							beverage3 = new Mocha(beverage3);
    						}
    						else if(n==2)
    						{
    							beverage3 = new Whip(beverage3);
    						}
    						else if(n==3)
    						{
    							beverage3 = new Soy(beverage3);
    						}
    						else if(n==4)
    						{
    							System.out.println("Your Bill is "+" $" + beverage3.cost()+" for "+beverage3.getDescription()
    									);
    							System.exit(0);
    						}
    					}
    					
    			case 4: System.exit(0);
    				
    		}
    		}
    				
    	}
    }
    
