package BiFunction;


import Consumer.Automobile;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Automobile car = new Automobile(1, "Toyota", "Corolla", 1989);
        Mechanic mechanic = new Mechanic(1, "José", "Perez");

        BiFunction<Automobile, Mechanic, String> asignMechanic = (a, m) -> {
            return m.getName() + " " + m.getLastName() + " has been asigned with car " + a.getName() + " " + a.getSeries() + ".";
        };

        System.out.println(asignMechanic.apply(car, mechanic));
    }
}