
public class Archer extends Character {

	int arrows;
	
	public Archer(String characterName, int characterLevel, int arrows, int health) {
		super(characterName, characterLevel, health);
		// TODO Auto-generated constructor stub
	}

	public void attack() {
		System.out.println(name + " shoots an arrow from a distance! ");
		
	}
		public void specialAbility() {
			System.out.println(name + " fires multiple arrows");
		}
		
		public void takeDamage() {
			health =- 5;
			System.out.println(name + "has taken damage!");
		}
}

