
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    PriceDecorator decorator = null ;
    boolean price = true;

    public CustomBurger ( String d )
    {
        super(d) ;
    }

    public void setDecorator( PriceDecorator p )
    {
        this.decorator = p ;
    }

    public void printDescription() {
        //System.out.println("Paper Receipt: \n");
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.print("1" + description + " ");
        if(price)
           System.out.println( fmt.format(decorator.getPrice()) );
       else System.out.println();
        for (Component obj  : components)
        {
            obj.printDescription();
        }


    }
}

