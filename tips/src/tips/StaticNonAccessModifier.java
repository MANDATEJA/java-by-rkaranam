package tips;

class Player {
	private String name;
	private static int count = 0;
	public Player(String name) {
		super();
		this.name = name;
		this.count++;
	}
	public static int getCount() {
		return count;
	}


}

public class StaticNonAccessModifier {
	public static void main(String[] args) {
		Player playerOne = new Player("Sachin");
		System.out.println(Player.getCount());

		Player playerTwo = new Player("Dhoni");
		System.out.println(Player.getCount());
		System.out.println(Player.getCount());
	}
}
