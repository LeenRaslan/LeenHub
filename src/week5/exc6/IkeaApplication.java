package week5.exc6;

public class IkeaApplication {

    public static void main(String[] args) {
        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Wardrobe wardrobe  =wardrobeBuilder.build();
        System.out.println(wardrobe);
    }
}
