package kodlamaIoWeek3Homework.entities;

public class Courses {
	private int id;
	private String name;
	private int instructorId;
	private int courseUnitPrice;

	Courses() {

	}

	public Courses(int id, String name, int instructorId, int courseUnitPrice) {
		this.id = id;
		this.name = name;
		this.instructorId = instructorId;
		this.courseUnitPrice = courseUnitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getCourseUnitPrice() {
		return courseUnitPrice;
	}

	public void setCourseUnitPrice(int courseUnitPrice) {
		this.courseUnitPrice = courseUnitPrice;
	}

}
