public class Character implements Playable {

   
    String name;
    
    int level;
    
    protected int health;
    
    public Character(String characterName, int characterLevel, int characterHealth) {
        name = characterName;
        level = characterLevel;
        health = characterHealth;
    }

    
    public void attack() {
        System.out.println(name + " performs a basic attack."); 
    }


	public void specialAbility() {
		System.out.println(name + " has a panic attack and does nothing.");
		// TODO Auto-generated method stub
		
	}
	
	public void takeDamage(int amount) {
		this.health -= amount;
		System.out.println(name + " takes " + amount + "damage (Health remaining: " + health + ")");
		
		if (this.health <= 0) {
			this.health = 0;
			System.out.println(name + " has been defeated");
		}
	}
}