package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

// Uses interface because it comes with the common methods used when interacting with database
// CRUD (Create, Read, Update, Delete)
// CrudRepository needs generic types
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByName(String name);

    public List<Course> findByDescription(String description);

    public List<Course> findByTopicId(String topicId);
}