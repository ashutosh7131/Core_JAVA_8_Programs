import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FilterAndSortMapBasedOnValue {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        Map.Entry<Integer, String> result2 ;
        map.put(1, "Computer");
        map.put(2, "Mouse");
        map.put(8, "Computer");
        map.put(4, "Trackpad");
        map.put(6, "Mouse");
        map.put(5, "Computer");

        map.entrySet().stream().filter(x->x.getValue().contains("Computer")).forEach(System.out::println);
        map.entrySet().stream().filter(entry -> entry.getValue().contains("Computer")).map(Map.Entry::getKey).forEach(System.out::println);





        }
    }