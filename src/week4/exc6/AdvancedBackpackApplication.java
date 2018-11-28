package week4.exc6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {

        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);

        Item item1 = new Item("Water");
        Item item2 = new Item("Food");
        Item item3 = new Item("Medicine");

        backpack.addAll(Arrays.asList(item1,item2,item3));
        System.out.println("Backpack: " + backpack);

        Item item4 = new Item("Water");
        //if (backpack.contains(item4)){
        boolean containsItem = backpack.contains(item4);
        if (containsItem){
            System.out.println("The backpack contains " + item4);}
        backpack.remove(item4);
        System.out.println(backpack);
        if (!backpack.contains(item4)){
            System.out.println(backpack);
        }else System.out.println("");

        backpack.addAll(Arrays.asList(item2,item2));
        System.out.println(backpack);

        int size = backpack.size();
        System.out.println("backpack size: " + size);




    }



}
