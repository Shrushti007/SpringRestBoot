package example.spring.rest;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String profession;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String firstName, String lastName, int age, String profession) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.profession = profession;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", profession="
				+ profession + "]";
	}
	
}
