package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Double> studentAndNote = new LinkedHashMap<>();
        studentAndNote.put("Alberto", 4.3);
        studentAndNote.put("Pipe", 2.1);
        studentAndNote.put("Juana", 4.5);

        for (Map.Entry<String, Double> entry : studentAndNote.entrySet()) {
            String student = entry.getKey();
            double grade = entry.getValue();
            System.out.println("Student " + student + " obtained the following grade: " + grade);
        }
    }
}