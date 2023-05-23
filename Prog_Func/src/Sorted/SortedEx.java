package Sorted;
import Consumer.Automobile;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {
    public static void main(String[] args) {
        List<Automobile> carList = Arrays.asList(
                new Automobile(3, "Chevrolet", "Camaro", 1980),
                new Automobile(5, "Ford", "Mustang", 2020),
                new Automobile(6, "Toyota", "Supra", 1998),
                new Automobile(1, "Nissan", "GT-R", 1987)
        );

        List<Automobile> filteredCars = carList.stream()
                .filter(a -> a.getYear() > 1990)
                .sorted(Comparator.comparing(Automobile::getName))
                .collect(Collectors.toList());

        System.out.println("The filtered cars are as follow:");
        filteredCars.forEach(a -> System.out.println(a.getName() + " " + a.getSeries() + " " + a.getYear()));
    }
}