public class PremiumCheese extends LeafDecorator
{
    private String[] options ;


    public PremiumCheese( String d )
    {
        super(d) ;
    }

    // 1 cheese free, extra cheese +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        this.price += (options.length) * 1.50 ;
    }

    public String getDescription()
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }
        return desc ;
    }

}