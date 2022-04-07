package ExT;
class J{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
}
public class Class_Test {

	public static void main(String[] args) {
		J j = new J();
		j.setName("¡ÿªÛ");
		j.setAge(27);
		
		System.out.println(j.getName());
		System.out.println(j.getAge());
	}

}
