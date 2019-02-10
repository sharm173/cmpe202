public class Machine2 extends GumballMachine {
    private int num_quarters;

    public Machine2(int size) {
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