public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new TotalValues());

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
      System.out.println("Total: " + context.executeStrategy(numbers));

      context = new Context(new TotalOddValues());
      System.out.println("OddTotal: " + context.executeStrategy(numbers));

      context = new Context(new TotalEvenValues());
      System.out.println("Even Total: " + context.executeStrategy(numbers));
   }
}