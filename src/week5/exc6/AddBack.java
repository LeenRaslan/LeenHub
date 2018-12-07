package week5.exc6;

public class AddBack implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("back");
    }
}
