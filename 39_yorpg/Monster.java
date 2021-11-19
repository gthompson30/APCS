public class Monster {
	int hp = 20;

	public Monster() {
	}

	public int attack(Protagonist a) {
		return (int) (Math.random() * 6);
	}
	public boolean isAlive() {
		return hp > 0;
	}
}
