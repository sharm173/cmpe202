public class ToppingsType3 extends LeafDecorator
{
    private String[] options ;


    public ToppingsType3( String d )
    {
        super(d) ;
    }

    // 4 toppings free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
    }

    public String getDescription()
    {
        String desc = "" ;
        for ( int i = 0; i<options.length; i++ )
        {
            desc += "{{{" + options[i] + "}}}\n" ;
        }
        return desc ;
    }

}