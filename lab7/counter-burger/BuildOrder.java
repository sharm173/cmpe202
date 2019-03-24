

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //Premium cheese
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese"} ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;

        //Sauce
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;

        //Bun
        Bun bb = new Bun( "Bun Option" ) ;
        String[] bun = { "Ciabatta (Vegan)" } ;
        bb.setOptions( bun ) ;
        bb.wrapDecorator( p ) ;

        //Sides
        Side ss = new Side( "Side Options" ) ;
        String[] sso = { "Shoestring Fries" } ;
        ss.setOptions( sso ) ;
        ss.wrapDecorator( bb ) ;


        // Setup Custom Burger Ingredients
        customBurger.setDecorator( ss ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bb ) ;
        customBurger.addChild( ss ) ;

        // Add Custom Burger to the ORder
        order.addChild( customBurger );

        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone and Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        //Premium cheese
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella"} ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;

        //Sauce
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        // 4 toppings free, extra +.75
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        // premium topping +1.50
        Premium p2 = new Premium( "Premium Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;

        //Bun
        Bun bb2 = new Bun( "Bun Option" ) ;
        String[] bun2 = { "Gluten-Free Bun" } ;
        bb2.setOptions( bun2 ) ;
        bb2.wrapDecorator( p2 ) ;

        //Sides
        Side ss2 = new Side( "Side Options" ) ;
        String[] sso2 = { "Shoestring Fries" } ;
        ss2.setOptions( sso2 ) ;
        ss2.wrapDecorator( bb2 ) ;


        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( ss2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bb2 ) ;
        customBurger2.addChild( ss2 ) ;

        order.addChild( customBurger2 );

        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/