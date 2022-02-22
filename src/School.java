import java.util.List;

// Keeps track of all teachers, students, the amount of money earned from tuition and spent on salaries
public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * Create a new School instance
	 * @param teachers list of all teachers in the school
	 * @param students list of all students in the school
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	/***** GETTERS *****/
	/**
	 * 
	 * @return the list of all students enrolled in the school
	 */
	public List<Student> getStudents() { return students; }
	
	/**
	 * 
	 * @return the list of all teachers employed by the school
	 */
	public List<Teacher> getTeachers() { return teachers; }
	
	/**
	 * 
	 * @return the total money earned
	 */
	public int getTotalMoneyEarned() { return totalMoneyEarned; }
	
	/**
	 * 
	 * @return the total money spent by the school
	 */
	public int getTotalMoneySpent() { return totalMoneySpent; }
	
	/***** SETTERS *****/
	/**
	 * Add a new teacher to the list of teachers employed by the school
	 * @param newTeacher The teacher to be added
	 */
	public void setTeachers(Teacher newTeacher) { teachers.add(newTeacher); }
	
	/**
	 * Add a new student to the list of students enrolled at the school
	 * @param newStudent the student to be added
	 */
	public void setStudents(Student newStudent) { students.add(newStudent); }
	
	/**
	 * Increase the income the school has made
	 * @param income the amount of money coming into the school in this instance
	 */
	static public void setTotalMoneyEarned(int income) { totalMoneyEarned += income; }
	
	/**
	 * Increase the amount of money the school has spent
	 * @param expenditures the amount of money the school is spending in this instance
	 */
	static public void setTotalMoneySpent (int expenditures) { totalMoneyEarned -= expenditures; }
	
}
