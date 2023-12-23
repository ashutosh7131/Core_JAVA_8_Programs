import java.util.Arrays;
import java.util.List;

public class SumOfEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvenNumbers = numbers.stream().filter(x -> x%2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Printing Sum of Even Numbers   :::: "  + sumOfEvenNumbers);
        System.out.println("=====================================================>   :::: ");
        int sumOfOddNumbers = numbers.stream().filter(x -> x%2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Printing Sum of Even Numbers   :::: "  + sumOfOddNumbers);
    }
}
