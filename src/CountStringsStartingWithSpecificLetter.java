import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CountStringsStartingWithSpecificLetter {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original list of strings (colors): " + colors);
        colors.stream().filter(x-> x.startsWith("R")).collect(Collectors.toList()).forEach(System.out::println);
        char startingLetter = 'B';
        System.out.println("List with specifed letter ::: " + startingLetter);
        colors.stream().filter(x-> x.startsWith(String.valueOf(startingLetter))).collect(Collectors.toList()).forEach(System.out::println);

    }
}
