package week10.exc3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sms {

    private String label;
    private String text;

    public Sms(String label, String text) {
        this.label = label;
        this.text = text;
    }

    public String getLabel() {
        return label;
    }

    public String getText() {
        return text;
    }

}
