

public class Archer extends Character implements Playable {


	int arrows;
	
	public Archer(String characterName, int characterLevel, int arrows, int health) {
		super(characterName, characterLevel, health);
		// TODO Auto-generated constructor stub
	}

	public void attack() {
		arrows -= 1;
		System.out.println(name + " shoots an arrow from a distance!" + arrows + "left");
		
	}
		public void specialAbility() {
			System.out.println(name + " fires multiple arrows");
		}



	@Override
	public void takeDamage(int amount) {

	}


}


