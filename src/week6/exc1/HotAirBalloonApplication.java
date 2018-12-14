package week6.exc1;

public class HotAirBalloonApplication {

    public static void main(String[] args) {

        System.out.println("smallBalloon --");
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        smallBalloon.liftUp();
        smallBalloon.land();

        System.out.println("bigBalloon --");
        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        bigBalloon.liftUp();
        bigBalloon.land();

        HotAirBalloon small = smallBalloon;
        HotAirBalloon big = bigBalloon;

        System.out.println("small --");
        small.liftUp();
        small.land();

        System.out.println("big --");
        big.liftUp();
        big.land();
    }
}
