package com.topictutor.topictutor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topictutor.topictutor.model.Topic;
import com.topictutor.topictutor.repository.TopicRepository;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    // Save new topic
    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    // Get all topics
    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    // Get a topic by ID
    public Topic getTopicById(Long id) {
        return topicRepository.findById(id).orElse(null);
    }

    // Delete topic by ID
    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
