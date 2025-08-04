package com.topictutor.topictutor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.topictutor.topictutor.model.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    // You can add custom methods here if needed (optional)
}
