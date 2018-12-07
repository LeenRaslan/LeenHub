package week5.exc6;

public class AddTop implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("top");
    }
}
