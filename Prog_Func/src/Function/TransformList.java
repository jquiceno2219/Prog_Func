package Function;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TransformList {
    public static List<Integer> transformList(List<Integer> numbers, Function<Integer, Integer> function) {
        List<Integer> multipliedList = new ArrayList<>();

        numbers.forEach(number -> multipliedList.add(function.apply(number)));

        return multipliedList;
    }
}