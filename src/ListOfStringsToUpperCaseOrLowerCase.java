import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsToUpperCaseOrLowerCase {

    public static void main(String[] args) {

        List< String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        System.out.println("Converting to uppercase");
        colors.stream().map(String::toUpperCase).forEach(System.out::println);
        List<String> uppercaseStrings =  colors.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("\nUppercase Strings: " + uppercaseStrings);
        System.out.println("===========================================================");
        System.out.println("Converting to lowercase");
        colors.stream().map(String::toLowerCase).forEach(System.out::println);
        List < String > lowercaseStrings = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Lowercase Strings: " + lowercaseStrings);
        System.out.println("===========================================================");

    }
}
