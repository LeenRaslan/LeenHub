package week4.exc10;

import week4.exc7.Topic;
import week4.exc9.FileReader;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderApplication {
    public static void main(String[] args) {
        TopicReader topicReader = new TopicReader();
        List<Topic> topicList = topicReader.getTopics("week4/exc10/topics");
        for (Topic topic : topicList) {
            System.out.println("Topic list: " + topic);
        }

        Set<Topic> topicSet = new HashSet<>(topicList);
        for (Topic topic : topicSet) {
            System.out.println("Topic set : " + topic);


        }
    }

}
