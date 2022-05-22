public class Player {
  String name1, name2;
  
  Player() { //default constructor
	  name1 = "Virat";
	  name2 = "Rohit";
  }
  
  Player(Player p) { //copy constructor   
	 this.name1 = p.name2;
	 this.name2 = p.name1;
  }
  
  public void showPlayerData() {
	  System.out.println("Name one is :"+name1);
	  System.out.println("Name two is :"+name2);
  }
}
