

public class PackOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "" ) ;



        CustomBurger customBurger = new CustomBurger( "LBB" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "LBB" } ;
        b.setOptions( bo ) ;

        ToppingsType1 t1 = new ToppingsType1( "Toppings Options" ) ;
        String[] to1 = { "LETTUCE", "TOMATO" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( b ) ;
        ToppingsType2 t2 = new ToppingsType2( "Toppings Options" ) ;
        String[] to2 = {  "G ONION", "JALA Grilled" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( t1 ) ;
        ToppingsType3 t3 = new ToppingsType3( "Toppings Options" ) ;
        String[] to3 = { "BACON" } ;
        t3.setOptions( to3 ) ;
        t3.wrapDecorator( t2 ) ;

        // Setup Custom Burger Ingredients
        customBurger.setDecorator( t3 ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( t1 ) ;
        customBurger.addChild( t2 ) ;
        customBurger.addChild( t3 ) ;
        customBurger.price = false;

        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        //Add Little Cajun Fries to the Order
        order.addChild(new Leaf("1 LTL CAJ", 0.00 ));
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/