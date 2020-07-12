package no22_Object클래스;

public class Archer {
	String name;
	String power;
	
	public Archer(String name, String power) {
		super();
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) {
		Archer temp = (Archer)obj;
		if(name == temp.name && power == temp.power) {
			return true;
		}
		else return false;
	}
}
