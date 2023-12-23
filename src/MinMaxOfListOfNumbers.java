import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxOfListOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbs = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        System.out.println("Original list of numbers: " + numbs);
        Integer max_Value = numbs.stream().max(Integer::compare).orElse(null);
        System.out.println("Printing Max Number ::: " + max_Value);
        Integer min_Value = numbs.stream().min(Integer::compare).orElse(null);
        System.out.println("Printing Min Number ::: " + min_Value);

    }
}
