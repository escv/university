/**
 * 
 */
package com.prodyna.pac.university.course;

import java.util.List;

/**
 * @author andrealbert
 *
 */
public interface CourseService {
	
	Course addCourse(Course c);
	
	List<Course> readCourses();
	
	void deleteCourse(long id);
	
	Course updateCourse(Course c);

}
