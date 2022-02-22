// Responsible for keeping track of student information
public class Student {
	private int id;
	private String name;
	private int grade; // from 1-12
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * 
	 * @param id id for the student: unique.
	 * @param name name of the student
	 * @param fees fees the student needs to pay, base is $30,000.
	 */
	public Student(int id, String name, int grade)
	{
		this.id = id;
		this.name = name; // Not going to alter student's name
		this.grade = grade;
	}
	
	/***** SETTERS *****/
	public void setGrade(int grade) { this.grade = grade; }
	
	public void setFeesPaid(int payment) 
	{ 
		feesPaid += payment;
		School.setTotalMoneyEarned(feesPaid);
	}
	
	/***** GETTERS *****/
	public int getId() { return id; }
	public String getName() { return name; }
	public int getGrade() { return grade; }
	public int getFeesPaid() { return feesPaid; }
	public int getFeesTotal() { return feesTotal; };
	public int getRemainingFees() { return feesTotal -= feesPaid; }
	
	@Override
	public String toString() {
		return "\nStudent's Name: " + name + 
				"\nTotal fees paid so far: $" + feesPaid; 
	}
}
