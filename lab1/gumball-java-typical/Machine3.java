public class Machine3 extends GumballMachine {
    private int num_nickels;
    private int num_dimes;
    private int num_quarters;
    private int change;
    public Machine3(int size) {
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