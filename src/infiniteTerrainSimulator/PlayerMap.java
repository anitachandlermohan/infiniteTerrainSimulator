package infiniteTerrainSimulator;

public class PlayerMap {
	int[][] playerGrid = new int[100][100];
	private int i;
	private int j;
	public void startPosition(int starti, int startj) {
		i = starti;
		j = startj;
	}
		
	public int getxPosition() {
		return i;
		
	}
	public int getyPosition() {
		return j;
	}
	public String directionInput() {
		return "a direction";
	}
	
	public int walkNorth(int distance) {
		return j = j-distance;
	}
	public int walkSouth(int distance) {
		return j = j + distance;	
	}
	public int walkEast(int distance) {
		return i = i + distance;
	}
	public int walkWest(int distance) {
		return i = i- distance;
	}

}
