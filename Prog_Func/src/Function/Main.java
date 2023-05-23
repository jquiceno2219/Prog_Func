package Function;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 5, 9, 12);
        System.out.println("Pre-Transformed list: " + numberList);
        Function<Integer, Integer> multiplyByTwo = num -> num * 2 ;

        List<Integer> multipliedList = TransformList.transformList(numberList, multiplyByTwo);

        System.out.println("Transformed list: " + multipliedList);
    }
}