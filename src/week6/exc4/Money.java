package week6.exc4;

public abstract class Money {

    private Integer amount;

    public Money(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }
    public Boolean isApplicable(Integer coin){
        return amount >= coin;
    }
}
