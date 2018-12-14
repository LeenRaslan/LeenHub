package week6.exc2;

public abstract class IceCream {

    private String flavor;
    private String topping;

    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }
    public abstract String eat();

    public String getFlavor() {
        return flavor;
    }

    public String getTopping() {
        return topping;
    }
}
