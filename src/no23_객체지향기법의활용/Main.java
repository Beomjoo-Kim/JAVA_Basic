package no23_객체지향기법의활용;


public class Main {
	
	
	
	public static void main(String[] args) {
		Hero[] heroes = new Hero[3];
		heroes[0] = new Warrior("전사");
		heroes[1] = new Archer("궁수");
		heroes[2] = new Wizard("마법사");
		
		for(int i = 0; i< heroes.length; i++) {
			System.out.println(heroes[i].name);
			heroes[i].attak();
			
			if(heroes[i] instanceof Warrior) {
				Warrior temp = (Warrior)heroes[i];
				temp.groundCutting();
			}
			if(heroes[i] instanceof Archer) {
				Archer temp = (Archer)heroes[i];
				temp.fireArrow();
			}
			if(heroes[i] instanceof Wizard) {
				Wizard temp = (Wizard)heroes[i];
				temp.Freezing();
			}
		}
	}
}
