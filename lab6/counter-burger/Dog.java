public class Dog extends LeafDecorator
{
    private String[] options ;


    public Dog( String d )
    {
        super(d) ;
    }

    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "KSHD".equals(options[i]) ) this.price += 4.59 ;
            if ( "CD".equals(options[i]) ) this.price += 5.19 ;
            if ( "BD".equals(options[i]) ) this.price += 5.39 ;
            if ( "BCD".equals(options[i]) ) this.price += 5.99 ;
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
