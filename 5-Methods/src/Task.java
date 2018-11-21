
public class Task {

	public static void main(String[] args) {
		displayHighScorePosition("Mike", calculateHighScorePosition(1500));
		displayHighScorePosition("John", calculateHighScorePosition(900));
		displayHighScorePosition("Larry", calculateHighScorePosition(400));
		displayHighScorePosition("Tom", calculateHighScorePosition(50));
	}
	public static void displayHighScorePosition(String player1, int position) {
		System.out.println(player1 + " managed to get into position "+position+" on the high score table");
	}
	public static int calculateHighScorePosition(int score) {
		if (score>=1000) {
			return 1;
		} else if (score>=500 && score<1000) {
			return 2;
		} else if (score>=100 && score <500) {
			return 3;
		} else {
			return 4;
		}
	}
}
