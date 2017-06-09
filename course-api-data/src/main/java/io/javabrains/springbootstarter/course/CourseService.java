/**
 * 
 */
package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dhaval
 *
 */

@Service
public class CourseService {

	@Autowired
	private CourseDataService courseDataService;
	
	
	public List<Course> getAllCourses(String topicId){
		List<Course> allCourseList = new ArrayList<>();
		courseDataService.findByTopicId(topicId);
		courseDataService.findAll().forEach(allCourseList::add);
		return allCourseList;
	}
	
	public Course getCourse(String id){
		return courseDataService.findOne(id);
	}

	public void addCourse(Course course) {
		courseDataService.save(course);
	}

	public void updateCourse(Course course) {
		
		courseDataService.save(course);		/** Topic instance contains the id field 
											 *  and hence if the particular id is already present then it is updated 
											 *	else a new record is inserted.
											 */
	}

	public void deleteCourse(String id) {
		courseDataService.delete(id);
	}
}
