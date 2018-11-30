package week4.exc7;

import java.util.*;

public class AdvancedIndexApplication {

    public static void main(String[] args) {

        Map<Integer , List<Topic>> bookTopics = new HashMap<>();
        System.out.println("Index: " + bookTopics);

        Integer page1 = 3;
        Integer page2 = 7;

        Topic topic1 = new Topic("connecting");
        Topic topic2 = new Topic("possitive things");
        Topic topic3 = new Topic("ecologic economy");

        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();

        topics1.add(topic1);
        topics2.addAll(Arrays.asList(topic2,topic3));

        bookTopics.put(page1,topics1);
        bookTopics.put(page2,topics2);
        System.out.println("Index: " + bookTopics);

        Set<Integer> pages = bookTopics.keySet();
        System.out.println("Index keys: " +pages);

        Collection<List<Topic>> topics = bookTopics.values();
        System.out.println("Index values: " + topics);

        Topic newTopic = new Topic("teaching methods");

        List<Topic> stored = bookTopics.get(3);
        stored.add(newTopic);
        System.out.println("Index: " + bookTopics);

        boolean containsKey = bookTopics.containsKey(3);
        if (containsKey){
            System.out.println("The page number "+ page1 +" exists as key.");
        }else System.out.println("");

        List<Topic> stored2 = bookTopics.get(7);
        System.out.println("The topics in page number " + page2 + " are: " + stored2);

        int size = bookTopics.size();
        System.out.println("bookTopics size: " + size);





    }
}
