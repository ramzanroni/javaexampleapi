package com.javaexample.api.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Spring", "Java Spring Boot"),
                new Topic("2", "PHP", "Laravel"),
                new Topic("3", "C#", ".Net")
        );
    }
}
