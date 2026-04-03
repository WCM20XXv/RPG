
public class Boss extends Character {
	private String bossID;

	public Boss(String characterName, int characterLevel, int characterHealth, String ID) {
		super(characterName, characterLevel, characterHealth);
		this.bossID = ID;
	}	
	
		public void attack() {
			System.out.println(name + "(" + bossID + ") Lunges forward with a spear");
		}
	
		public void attack(Character[] party) {
			System.out.println(name + " " + bossID + " Lets out a deafening scream!");
			for (Character c : party) {
				if (c != this && c != null) {
					c.takeDamage(10);
				}
			}
		}	
		

		public void specialAbility(Character[] party) {
			System.out.println(name + " " + bossID + " Unleashes a corrupting magic pulse!");
			for (Character c : party) {
				if (c != this && c != null) {
					c.takeDamage(20);
				
				}
			}
		
		}
}