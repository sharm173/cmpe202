public class Burger extends LeafDecorator
{
    private String[] options ;


    public Burger( String d )
    {
        super(d) ;
    }

    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "HB".equals(options[i]) ) this.price += 6.39 ;
            if ( "CB".equals(options[i]) ) this.price += 7.19 ;
            if ( "BB".equals(options[i]) ) this.price += 7.19 ;
            if ( "BCB".equals(options[i]) ) this.price += 7.79 ;
            if ( "LHB".equals(options[i]) ) this.price += 4.59 ;
            if ( "LCB".equals(options[i]) ) this.price += 5.29 ;
            if ( "LBB".equals(options[i]) ) this.price += 5.59 ;
            if ( "LBCB".equals(options[i]) ) this.price += 6.19 ;
        }
    }

    public String getDescription()
    {
        String desc = "" ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }
        return desc ;
    }

}
