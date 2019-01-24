package week10.exc3;

import week4.exc9.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsReader {
    FileReader reader = new FileReader();

    public List<Sms> getSms() {
        return reader.asStream("week10/exc3/sms.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Sms(e[0], e[1]))
                .collect(Collectors.toList());
    }
    /*List<String> words = getSms().stream()
                .map(e-> e.getText().split(" "))
            .flatMap(Stream::of)
                .map(e -> e.replaceAll(",", ""))
                .map(e -> e.replaceAll("\\.", ""))
                .map(e -> e.replaceAll("\\?", ""))
            .map(e-> e.replaceAll())
                .collect(Collectors.toList());
    }
    */
}
