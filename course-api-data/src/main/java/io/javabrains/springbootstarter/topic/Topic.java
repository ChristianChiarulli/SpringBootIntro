package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

// When you declare an entity JPA knows to create the columns defined below
@Entity
public class Topic {

    // these are created as text columns in database
    @Id // choose this to be the Primary Key
    private String id;
    private String name;
    private String description;

    // No Arg Constructor
    public Topic() {

    }

    // Constructor
    public Topic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
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
}