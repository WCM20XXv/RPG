
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character[] party = new Character[5];

		party[0] = new Character("Civilian", 1, 5);

		party[1] = new Mage("Jaina", 3, 70, 40);

		party[2] = new Warrior("Tryndamere", 3, 50, 70);

		party[3] = new Archer("Max Verstappen", 3, 50, 50);

		party[4] = new Boss("Atraxa", 100, 2000000, "The Grand Unifier");


		for (int i = 0; i < party.length; i++) {

			party[i].attack();

			if (party[i] instanceof Boss tempBoss) {
				tempBoss.attack(party);
				tempBoss.specialAbility(party);

				} else {

					if (party[i] instanceof Mage tempMage) {

					tempMage.specialAbility();

					} else if (party[i] instanceof Boss tempBoss) {

						tempBoss.specialAbility(party);
					} else if (party[i] != null) {

					Character tempCharacter = (Character) party[i];

					tempCharacter.specialAbility();
				}
			}


		   }

		}
	}
