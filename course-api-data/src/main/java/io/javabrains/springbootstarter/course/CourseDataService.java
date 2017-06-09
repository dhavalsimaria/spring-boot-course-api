/**
 * 
 */
package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Dhaval
 *
 */
public interface CourseDataService extends  CrudRepository<Course, String>{

	public List<Course> findByTopicId(String topicId);
}
