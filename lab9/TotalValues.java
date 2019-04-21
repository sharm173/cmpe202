public class TotalValues implements Strategy{
   @Override
   public int doOperation(List<Integer> numbers) {
    int sum = 0;
    for(int i:numbers)
        sum+=i;
    return sum;
   }
}