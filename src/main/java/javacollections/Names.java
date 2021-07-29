package javacollections;
import java.util.*;

public class Names {

    public List<String> names = new ArrayList(Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));

    public void getListOfNamesWithoutDuplicates() {
        Set<String> namesWithoutDuplicates = new HashSet<>(names);
        System.out.println("Lista bez duplikatów: " + namesWithoutDuplicates);
     }

    public void getReversedListOfNames() {
        Collections.reverse(names);
        System.out.println("Elementy w odwrotnej kolejności:  " + names);
    }

    public void replaceName(String originalName, String substitutingName) {
        while(names.contains(originalName))
            names.set(names.indexOf(originalName), substitutingName);

        System.out.println("Elementy po zmianie: " + originalName+" -> " + substitutingName + ": " + names );
    }
}
