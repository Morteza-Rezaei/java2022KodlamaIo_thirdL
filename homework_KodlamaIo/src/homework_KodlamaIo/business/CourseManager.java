package homework_KodlamaIo.business;

import homework_KodlamaIo.core.logging.Logger;
import homework_KodlamaIo.dataAccess.CourseDao;
import homework_KodlamaIo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Hata : Kurs fiyatı 0'dan küçük olamaz");
		}

		Course[] courses = {
				new Course("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", "1", 0, "", "Engin Demirog"),
				new Course("Senior Yazılım Geliştirici Yetiştirme Kampı", "2", 0, "", "Engin Demirog"),
				new Course("Programlamaya Giriş İçin Temel Kurs", "3", 0, "", "Engin Demirog") };
		for (Course course2 : courses) {
			if (course.getCourseName() == course2.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}

		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
