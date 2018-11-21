
public class CalculateScore {
	
	public static void main(String[] args) {
		int newScore = calculatescore("Mike", 500);
		System.out.println("New Score is "+ newScore);
		calculatescore(75);
		calculatescore();
	}
	public static int calculatescore(String playerName, int score) {
		System.out.println("player "+playerName+" scored "+score+" points");
		return score * 1100;
	}
	public static int calculatescore(int score) {
		System.out.println("Unnamed player scored "+score+" points");
		return score = 100;
	}
	public static void calculatescore() {
		System.out.println("No player, no score");
	}
}
