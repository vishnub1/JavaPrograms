public class Main1 {

	public static void main(String[] args) {
		Player p1 = new Player();
		
		Player p2 = new Player(p1);
		
		p1.showPlayerData();  p2.showPlayerData();
	}

}
