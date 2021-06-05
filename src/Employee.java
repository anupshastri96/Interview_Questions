import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
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


	private int id;
	private String name;
	
	
	public static Comparator<Employee> NameComparator = new Comparator<>() {

		@Override
		public int compare(Employee arg0, Employee arg1) {
			// TODO Auto-generated method stub
			return arg0.getName().compareTo(arg1.getName());
		}


	};



	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return this.id = arg0.id;
	}

}
