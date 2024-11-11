package com.javaexample.api.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics =new ArrayList<>(Arrays.asList(
            new Topic("1", "Spring", "Java Spring Boot"),
            new Topic("2", "PHP", "Laravel"),
            new Topic("3", "C#", ".Net")
        )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }

}
