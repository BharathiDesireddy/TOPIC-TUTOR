package com.topictutor.topictutor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topictutor.topictutor.model.Topic;
import com.topictutor.topictutor.service.TopicService;
import com.topictutor.topictutor.service.YouTubeService;

@RestController
@RequestMapping("/topics")
@CrossOrigin(origins = "*") // Allow frontend to call these APIs
public class TopicController {

    @Autowired
    private TopicService topicService;

    @Autowired
    private YouTubeService youTubeService;

    // Create new topic
    @PostMapping
    public Topic createTopic(@RequestBody Topic topic) {
        return topicService.saveTopic(topic);
    }

    // Get all topics
    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    // Get topic by ID
    @GetMapping("/{id}")
    public Topic getTopic(@PathVariable Long id) {
        return topicService.getTopicById(id);
    }

    // Delete topic by ID
    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
    }

    // Get AI explanation or video suggestions for a topic (now real YouTube links)
    @GetMapping("/{id}/explanation")
    public List<String> getTopicExplanations(@PathVariable Long id) {
        Topic topic = topicService.getTopicById(id);
        String title = topic.getTitle();
        return youTubeService.getVideoLinks(title);
    }
}
