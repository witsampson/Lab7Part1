//Wit Sampson
// Data Created: 10/19/2018
// The purpose of this class is to put the player into the game, the one that is being played by the user
public class playerOne {
	private String playerName;
	private String imagePath;
	private int itemCollected;
	
	
	public playerOne(String playerName, String imagePath,int itemCollected){
		this.playerName = playerName;
		this.imagePath = imagePath;
		this.itemCollected = itemCollected;
	}
	
	public void Movement() {
		Movement move = new Movement(playerName);
	}
	
	public int collectingItems(int itemCollected) {
		return 0;
	}
}
