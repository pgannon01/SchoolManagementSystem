import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Mellisa", 700);
		Teacher james = new Teacher(3, "James", 300);
		
		List<Teacher> teachersList = new ArrayList<Teacher>();
		teachersList.add(james);
		teachersList.add(mellisa);
		teachersList.add(lizzy);
		
		Student marcus = new Student(1, "Marcus", 4);
		Student lilly = new Student(2, "Lilly", 8);
		Student janine = new Student(3, "Janine", 10);
		
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(janine);
		studentsList.add(lilly);
		studentsList.add(marcus);
		
		School fac = new School(teachersList, studentsList);
		
		// Testing student payment and school earning money functions
		marcus.setFeesPaid(5000);
		lilly.setFeesPaid(6000);
		System.out.println("FAC has earned: " + fac.getTotalMoneyEarned());
		
		// Testing school paying salary to teachers
		System.out.println("------------------------------- PAY MONEY TO TEACHERS -------------------------------------");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("FAC has paid " + lizzy.getName() + " their salary.");
		System.out.println(lizzy.getName() + " now has earned: " + lizzy.getSalaryEarned() + "\n");
		System.out.println("FAC has spent: $" + fac.getTotalMoneySpent());
		
		System.out.println(janine);
		System.out.println(james);

	}

}
