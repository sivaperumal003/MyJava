package colectionPro;

public class Employee {
	int empno;
	String name;
	int deptno;
	public Employee(int empno, String name, int deptno) {
		super();
		this.empno = empno;
		this.name = name;
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", deptno=" + deptno + "]";
	}
	

}
