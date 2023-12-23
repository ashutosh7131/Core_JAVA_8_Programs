import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(1);
        integerList.add(5);
        integerList.add(121);
        integerList.add(1277);
        integerList.add(1255);
        double average = integerList.stream().mapToDouble(Integer::doubleValue).sum();
        System.out.println("Average value of the said numbers: " + average);



    }
}
