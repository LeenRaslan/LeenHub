package week6.exc2;

public class IceCreamApplication {

    public static void main(String[] args) {

        IceCream cone = new ConeIceCream("Chocolate","Oreo");
        IceCream cup = new CupIceCream("Vanilla","Cookies");

        System.out.println(cone.eat());
        System.out.println(cup.eat());
    }
}
