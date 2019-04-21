public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(List<Integer> numbers){
      return strategy.doOperation(List<Integer> numbers);
   }
}