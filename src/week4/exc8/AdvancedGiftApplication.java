package week4.exc8;

import java.util.Optional;

public class AdvancedGiftApplication {

    public static void main(String[] args) {

        Optional<Box> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);

        Box present1 = new Box("Robotoy");
        giftBox= Optional.of(present1);
        System.out.println("Gift: " + giftBox);

        if (giftBox.isPresent()){
            System.out.println("There is a present in the gift box");
        }

        Box present = giftBox.get();
        System.out.println("The gift is a content= " + present);
    }

}
