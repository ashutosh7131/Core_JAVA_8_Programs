import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List <Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Original List of numbers: " + nums);
        List<Integer> distinctList = nums.stream().distinct().sorted().toList();
        System.out.println("Distinct List of numbers: " + distinctList);



    }
}
