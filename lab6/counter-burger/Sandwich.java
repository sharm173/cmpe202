public class Sandwich extends LeafDecorator
{
    private String[] options ;


    public Sandwich( String d )
    {
        super(d) ;
    }

    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "VS".equals(options[i]) ) this.price += 4.49 ;
            if ( "GC".equals(options[i]) ) this.price += 4.89 ;
            if ( "BLT".equals(options[i]) ) this.price += 5.79 ;
        }
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
