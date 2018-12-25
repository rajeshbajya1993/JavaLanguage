package oops.collectionFramework;

public class Student implements Comparable{

	public int id;
	public String name;
	public String college;
	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public int compareTo(Object o) {
		Student st = (Student)o;
		if(name.equals(st.name)){
			return id-st.id;
		}
		return name.compareTo(st.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
}
