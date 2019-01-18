package week9.exc1exc2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int number = 1; number < 21; number++) {
            numbers.add(number);
        }
        System.out.println(numbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(e -> e%2 == 1)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<Integer> divisibleBy3 = numbers.stream()
                .filter(e -> e%3 == 0)
                .filter(e -> e > 10)
                .collect(Collectors.toList());
        System.out.println(divisibleBy3);

        List<Integer> multipliedBy3 = numbers.stream()
                .filter(e -> e<5)
                .map(e -> e*3)
                .collect(Collectors.toList());
        System.out.println(multipliedBy3);

        List<String> num = numbers.stream()
                .filter(e -> e > 8 && e < 12)
                .map(e -> "number " + e + " has " +e.toString().length()+ " digits")
                .collect(Collectors.toList());
       // String digitNumbers = num.toString();
      //  String[] split = digitNumbers.split(",");
        System.out.println(num);
    }
}
