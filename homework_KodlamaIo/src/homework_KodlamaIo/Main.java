package homework_KodlamaIo;

import homework_KodlamaIo.business.CoursCategoryManager;
import homework_KodlamaIo.business.CourseManager;
import homework_KodlamaIo.core.logging.Databaselogger;
import homework_KodlamaIo.core.logging.FileLogger;
import homework_KodlamaIo.core.logging.Logger;
import homework_KodlamaIo.core.logging.MailLogger;
import homework_KodlamaIo.dataAccess.HibernateCategoryDao;
import homework_KodlamaIo.dataAccess.HibernateCourseDao;
import homework_KodlamaIo.dataAccess.JdbcCategoryDao;
import homework_KodlamaIo.dataAccess.JdbcCourseDao;
import homework_KodlamaIo.entities.Category;
import homework_KodlamaIo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "4", 0, "", "Engin Demirog");
		// loglamalar
		Logger[] loggers = { new MailLogger(), new FileLogger(), new Databaselogger() };
		// çıktılar hibernate
		Category category = new Category("Frontend");
		CoursCategoryManager coursCategoryManager = new CoursCategoryManager(new HibernateCategoryDao());
		coursCategoryManager.add(category);
		System.out.println("kategory : " + category.getCategoryName());
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

		System.out.println("");

		// çıktılar jdbc
		CoursCategoryManager coursCategoryManager2 = new CoursCategoryManager(new JdbcCategoryDao());
		coursCategoryManager2.add(category);
		System.out.println("kategory : " + category.getCategoryName());

		CourseManager courseManager2 = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager2.add(course1);

	}

}
