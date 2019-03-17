

public class Client {

    public static void runTest()
    {
        System.out.println("Paper Receipt:");
        Component theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();
        System.out.println("Packing slip:");
        Component theOrder2 = PackOrder.getOrder() ;
        theOrder2.printDescription();

    }
}

