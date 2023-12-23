import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListInAscOrderDescOrder {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("List in Original Order ::::::  " + colors);
        List<String> sortedAscColorsList = colors.stream().sorted().toList();
        System.out.println("List in Ascending Order ::::::  " + sortedAscColorsList);
        List<String> sortedDescColorsList = colors.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("List in Descending Order ::::::  " + sortedDescColorsList);
    }
}
