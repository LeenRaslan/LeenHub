package week11.exc3;

import java.util.HashMap;

public class TimeToWords {

    public String getWord(Integer number){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
        map.put(13,"thirteen");
        map.put(14,"fourteen");
        map.put(15,"fifteen");
        map.put(16,"sixteen");
        map.put(17,"seventeen");
        map.put(18,"eighteen");
        map.put(19,"nineteen");
        map.put(20,"twenty");
        map.put(21,"twenty one");
        map.put(22,"twenty two");
        map.put(23,"twenty three");
        map.put(24,"twenty four");
        map.put(25,"twenty five");
        map.put(26,"twenty six");
        map.put(27,"twenty seven");
        map.put(28,"twenty eight");
        map.put(29,"twenty nine");

        //Integer getMod = number % 10;
        //Integer getCalc = getMod /10 *10;
        return map.get(number);
    }


}
