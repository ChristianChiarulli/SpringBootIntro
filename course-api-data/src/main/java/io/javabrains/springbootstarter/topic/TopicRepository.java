package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

// Uses interface because it comes with the common methods used when interacting with database
// CRUD (Create, Read, Update, Delete)
// CrudRepository needs generic types
public interface TopicRepository extends CrudRepository<Topic, String> {

    // getAllTopics()
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)
}