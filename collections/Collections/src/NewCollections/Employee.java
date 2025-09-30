package NewCollections;

public class Employee {
	private int id;
	private String name;
	private int Eid;
	private double sal;
	
	
	
	public Employee(int id, String name, int eid, double sal) {
		super();
		this.id = id;
		this.name = name;
		Eid = eid;
		this.sal = sal;
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
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Eid=" + Eid + ", sal=" + sal + "]";
	}
	
	
	

}
