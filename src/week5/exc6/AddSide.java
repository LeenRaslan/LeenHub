package week5.exc6;

public class AddSide implements Step {

    @Override
    public void perform(Furniture furniture) {

        furniture.add("side");
    }
}
