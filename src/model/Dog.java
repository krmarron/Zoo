package model;

//Added by Kasey

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String makeNoise() {
		return "Bark";
	}

}