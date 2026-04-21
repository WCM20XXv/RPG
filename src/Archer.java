

public class Archer extends Character implements Playable {


	int arrows;
	
	public Archer(String characterName, int characterLevel, int arrows, int health) {
		super(characterName, characterLevel,  health);
		this.arrows = arrows;
		// TODO Auto-generated constructor stub
	}

	public void attack() {

		if (this.arrows  > 0) {
			this.arrows--;
			System.out.println(name + " shoots an arrow from a distance! " + arrows + " arrows left");
		} else {
			System.out.println(name + " Is out of arrows");
		}

		
	}
		public void specialAbility() {

			if (this.arrows >= 3) {

				this.arrows -= 3;
				System.out.println(name + " fires multiple arrows. arrows left: " +arrows);

			} else {
				System.out.println(name + " Is out of arrows");
			}

				}







}





