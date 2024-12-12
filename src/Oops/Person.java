package Oops;

public class Person {
	private String ename;
	private int age;
	private String country;
	
	public Person(String ename, int age, String country) {
		this.ename = ename;
		this.age = age;
		this.country = country;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
public static void main(String[] args) {
	Person p=new Person("sushma",23,"India");
	System.out.println(p.getEname()+" "+p.getAge()+" "+p.getCountry());
	p.setEname("Ravi");
	p.setAge(24);
	p.setCountry("usa");
	System.out.println(p.getEname()+" "+p.getAge()+" "+p.getCountry());
}
}