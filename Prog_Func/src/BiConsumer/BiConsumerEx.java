package BiConsumer;

import java.util.function.BiConsumer;
import java.util.Arrays;
import java.util.List;

public class BiConsumerEx {
    public static void main(String[] args) {
        List<String> StudentsNames = Arrays.asList("Juan", "Pepe", "Lola");
        List<Double> StudentsGrades = Arrays.asList(4.6, 3.2, 4.9);

        BiConsumer<String, Double> NamesAndGrades = (name, grade) -> System.out.println("Student \"" + name + "\" obtained the grade: " + grade);
        for (int i = 0; i < StudentsNames.size(); i++) {
            String name = StudentsNames.get(i);
            Double grade = StudentsGrades.get(i);
            NamesAndGrades.accept(name, grade);
        }
    }
}