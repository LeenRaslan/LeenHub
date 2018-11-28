package week4.exc5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedShoppingApplication {

    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);
        Grocery grocery1 = new Grocery("bananas");
        Grocery grocery2 = new Grocery("oranges");
        Grocery grocery3 = new Grocery("tomatoes");
        groceries.addAll(Arrays.asList(grocery1,grocery2,grocery3));
        System.out.println("Groceries: "+groceries);
        Grocery grocery5 = new Grocery("oranges");
            groceries.remove(grocery5);
        System.out.println(groceries);

        //groceries.addAll(Arrays.asList(grocery1,grocery1));
        //System.out.println("Groceries: " + groceries);

        groceries.remove(2);
        System.out.println("Groceries: " + groceries);
        int size = groceries.size();
        System.out.println("Groceries size: " + size);
    }

}
