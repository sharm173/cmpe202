import java.util.*;

public class Simple{
    public static void main(String args[]){
        public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(totalValues(numbers, number -> true));
        System.out.println(totalValues(numbers, number -> number%2==1));
        System.out.println(totalValues(numbers, number -> number%2==0));

    }

    }

    public static int totalValues(List<Integer> numbers,
                           Predicate<Integer> selector) {
    return numbers.stream()
                  .filter(selector)
                  .mapToInt(value -> value)
                  .sum();
    }
}

