package Filter;

import java.util.stream.Stream;

public class FilterEx {
    public static void main(String[] args) {

        Stream<String> restaurantMenu = Stream.of("Pizza", "Burger", "Pasta", "Salad", "Coke");

        // Filtra los platos que tengan la letra "a"
        restaurantMenu.filter(item -> item.toLowerCase().contains("a"))
                .forEach(System.out::println);
    }
}