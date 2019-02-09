public class machine1 extends GumballMachine {
    public machine1(int size) {
        super(size);
    }


}

public class machine2 extends GumballMachine {
    private int num_quarters;

    public machine2(int size) {
        super(size);
        this.num_quarters = 0;
    }

    public void insertCoin(int coin)
    {
        if ( coin == 25 )
            this.num_quarters++ ;
    }
    public void turnCrank()
    {
        if ( num_quarters >= 2 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.num_quarters-=2;
                System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert quarters" ) ;
        }
    }
}

public class machine3 extends GumballMachine {
    private int num_nickels;
    private int num_dimes;
    private int num_quarters;
    private int change;
    public machine3(int size) {
        super(size);
        this.num_quarters = 0;
        this.num_dimes = 0;
        this.num_nickels = 0;
        this.change = 0;
    }
    public void insertCoin(int coin)
    {
        switch(coin) {

            case 5:
            this.num_nickels++;
            break;

            case 10:
            this.num_dimes++;
            break;

            case 25:
            this.num_quarters++;
            break;
        }
    }

    public void turnCrank()
    {
        int total = num_nickels*5 + num_dimes*10 + num_quarters*25;
        if ( total+change >= 50 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.change = total - 50;
                this.num_quarters = 0;
                this.num_dimes = 0;
                this.num_nickels = 0;
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert coins" ) ;
        }
    }

}

public class GumballMachine
{

    protected int num_gumballs;
    protected boolean has_quarter;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertCoin(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else
            this.has_quarter = false ;
    }

    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}
    }
}
