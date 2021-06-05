import java.util.ArrayList;
import java.util.Collections;



public class InterviewMain {

	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Anup");
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Aditi");
		e.add(employee1);
		e.add(employee2);
		Collections.sort(e, Employee.NameComparator);
		
		System.out.println(e);
	}

}
