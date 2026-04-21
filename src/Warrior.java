
public class Warrior extends Character implements Playable  {
int strength;
	public Warrior(String characterName, int characterLevel, int strength, int health ) {
		super(characterName, characterLevel, health);
		this.strength = strength;
		
		
	}

	public void attack() {
	System.out.println(name + " swings a sword with great strength!");
	}

	public void specialAbility() {
		System.out.println(name + " enters rage mode");
		
	}

	public void takeDamage(int amount){

	}

}

