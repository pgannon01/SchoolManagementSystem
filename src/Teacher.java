// Responsible for keeping track of teacher information
public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * 
	 * @param id unique ID for teacher
	 * @param name teacher's name
	 * @param salary salary of the teacher per year
	 */
	public Teacher(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		salaryEarned = 0;
	}
	
	/***** SETTERS *****/
	public void setSalary(int newSalary) { salary = newSalary; }
	
	/***** GETTERS *****/
	public String getName() { return name; }
	public int getId() { return id; }
	public int getSalary() { return salary; }
	public int getSalaryEarned() { return salaryEarned; }
	
	/**
	 * Adds to teachers salary
	 * Removes from the total money earned from the school
	 * @param payment
	 */
	public void receiveSalary(int payment) 
	{
		salaryEarned += payment;
		School.setTotalMoneySpent(payment);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nTeacher Name: " + name + 
				"\nSalary Earned: " + salaryEarned;
	}
}
