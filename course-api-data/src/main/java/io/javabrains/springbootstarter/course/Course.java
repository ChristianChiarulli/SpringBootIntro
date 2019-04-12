package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

// When you declare an entity JPA knows to create the columns defined below
@Entity
public class Course {

    // these are created as text columns in database
    @Id // choose this to be the Primary Key
    private String id;
    private String name;
    private String description;

    // many to one relationship
    @ManyToOne
    private Topic topic;

    // No Arg Constructor
    public Course() {

    }

    // Constructor
    public Course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}