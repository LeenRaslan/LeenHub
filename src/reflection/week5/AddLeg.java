package reflection.week5;

import week5.exc6.Furniture;
import week5.exc6.Step;

public class AddLeg implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("back");
    }
}
