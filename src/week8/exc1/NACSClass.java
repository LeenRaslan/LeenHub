package week8.exc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NACSClass {
    public static void main(String[] args) {
        List<String> classTools = new ArrayList<>(Arrays.asList(
                "somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println(classTools);

        classTools.removeIf(e -> e.endsWith("e"));
        System.out.println(classTools);

        classTools.replaceAll(e -> e.toUpperCase());
        System.out.println(classTools);

        classTools.removeIf(e -> e.length()<6);
        System.out.println(classTools);

        classTools.forEach(classTool -> System.out.println(classTool));

    }
}

   /* public List<String> nClass(List<String> elements, Predicate<String> condition) {
        List<String> classTools = new ArrayList<>();
        for (String element : elements) {
            if (condition.test(element)) {
                classTools.add(element);
            }
        }
        return classTools;
    }*/


