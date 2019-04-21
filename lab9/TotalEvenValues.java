public class TotalEvenValues implements Strategy{
   @Override
   public int doOperation(List<Integer> numbers) {
    int sum = 0;
    for(int i:numbers) {
        if(i%2==0) sum+=i;
    }

    return sum;
   }
}