package model.domain;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4046439826317925371L;
	private String name;
	private int age;
	private transient int personalNumber;
	
	public Person() {}
	public Person(String name, int age, int personalNumber) {
		super();
		this.name = name;
		this.age = age;
		this.personalNumber = personalNumber;
	}
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
	public int getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(int personalNumber) {
		this.personalNumber = personalNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", personalNumber=" + personalNumber + "]";
	}
	
}