package homework_KodlamaIo.entities;

public class Course {
	private String courseName;
	private String id;
	private double coursePrice;
	private String courseDescription;
	private String instructorFullName;
	public Course() {
	
	}

	public Course(String courseName, String id, double coursePrice, String courseDescription,
			String instructorFullName) {
		super();
		this.courseName = courseName;
		this.id = id;
		this.coursePrice = coursePrice;
		this.courseDescription = courseDescription;
		this.instructorFullName = instructorFullName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getInstructorFullName() {
		return instructorFullName;
	}
	public void setInstructorFullName(String instructorFullName) {
		this.instructorFullName = instructorFullName;
	}
	
	

}
