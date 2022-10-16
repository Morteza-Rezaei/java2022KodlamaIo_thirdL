package homework_KodlamaIo.dataAccess;

import homework_KodlamaIo.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi : " + course.getCourseName() + " "
				+ course.getInstructorFullName());
		
	}

}
