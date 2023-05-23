package predicate;

import java.util.function.Predicate;
class PredicateEx {
    public static Predicate<String> hasLengthOf9 = t -> t.length() > 9;

    public static void predicate_or() {

        Predicate<String> containsLetterA = p -> p.contains("A");
        //Paso un string.
        String containsA = "Ole";
        //Verificará si el string es más largo de 9 caractéres o tiene la letra A.
        boolean outcome = hasLengthOf9.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }

}