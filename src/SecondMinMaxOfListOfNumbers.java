import java.util.Arrays;
import java.util.List;

public class SecondMinMaxOfListOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbs = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        System.out.println("Original list of numbers: " + numbs);
        Integer max_Second_Value = numbs.stream().distinct().sorted((a,b)-> Integer.compare(b,a)).skip(1).findFirst().orElse(null);
        System.out.println("Printing Second Maximum Number ::: " + max_Second_Value);
        Integer min_Second_Value = numbs.stream().sorted().skip(1).findFirst().orElse(null);
        System.out.println("Printing Second Minimum Number ::: " + min_Second_Value);

    }
}
