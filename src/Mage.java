
public class Mage extends Character implements Playable {

	int mana;
	
	public Mage(String name, int level, int mana, int health) {
		super(name, level, health);
		this.mana = mana;
		
	}
	/*public void attack() {
		if (this.mana >= 20) {
			castSpell();
			this.mana -= 20;
		} 
		
		else {
		
	System.out.println(name + "is out of mana and casts flame bolt");
		
		}
	
	}
	public void castSpell() {
		System.out.println(name + " casts a powerful spell");
		
		mana -= 20;
		System.out.println("Remaining Mana: "+ mana);
		 
	
	}
	*/
	
	public void attack() {
		System.out.println(name + " casts a fireball using mana!");
	}
	
	public void specialAbility() {
		System.out.println(name + " casts a powerful spell using mana");
	
		
	}



}


