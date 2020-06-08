package no17_상속_2;

public class Person {

	private String name;
	private int age;
	private int height;
	private int weight;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Person(String name, int age, int height, int weight) {
		super();
		//자신의 부몬클래스의 생성자를 실행하겠다는 뜻
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
}
