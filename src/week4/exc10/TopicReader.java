package week4.exc10;

import week4.exc7.Topic;
import week4.exc9.FileReader;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {

    private FileReader fileReader = new FileReader();

    public List<Topic> getTopics(String filePath) {
        List<Topic> topics = new ArrayList<>();
        List<String> lines = fileReader.asLines("week4/exc10/topics");
        for (String line : lines) {
            Topic topic = new Topic(line);
            topics.add(topic);


        }
        return topics;


    }

}

