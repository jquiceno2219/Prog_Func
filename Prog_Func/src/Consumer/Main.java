package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<Automobile> automobileList = createAutomobileList();

        Consumer<Automobile> consumerForAutomobile = s -> System.out.println(s);
        automobileList.forEach(consumerForAutomobile);
    }

    public static List<Automobile> createAutomobileList() {
        List<Automobile> automobileList = new ArrayList<>();
        Automobile s1 = new Automobile(1, "Chevrolet", "Camaro", 1997);
        Automobile s2 = new Automobile(2, "Ford", "F150", 1960);
        Automobile s3 = new Automobile(3, "Toyota", "Corolla AE86", 1986);
        Automobile s4 = new Automobile(4, "Tesla", "T", 2020);


        automobileList.add(s1);
        automobileList.add(s2);
        automobileList.add(s3);
        automobileList.add(s4);
        return automobileList;
    }
}
