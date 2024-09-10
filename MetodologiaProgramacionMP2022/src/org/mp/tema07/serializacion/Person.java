package org.mp.tema07.serializacion;

import java.util.List;

public class Person {
	private String name;
	private String age;
	private String place;
	private String title;
	private List<String> myHobbies;

	public Person(String name, String age, String place, String title, List<String> myHobbies) {
		super();
		this.name = name;
		this.age = age;
		this.place = place;
		this.title = title;
		this.myHobbies = myHobbies;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getPlace() {
		return place;
	}

	public String getTitle() {
		return title;
	}

	public List<String> getMyHobbies() {
		return myHobbies;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMyHobbies(List<String> myHobbies) {
		this.myHobbies = myHobbies;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", place=" + place + ", title=" + title + ", myHobbies="
				+ myHobbies + "]";
	}
}
