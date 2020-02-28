
public class SnakeGame {
	private boolean[][] game;
	private int[] headPosition;
	private static int exhaustiveChecks;
	private static int recursiveChecks;
	
	//Constructor
	SnakeGame(){
		int[][]board = new int[1][1];
	}
	SnakeGame(boolean[][] board, int x, int y) {
		headPosition = new int[] {x, y};
		game = board;
	}
	//Methods
	public int[] findTailExhaustive() {
		
		boolean check = true;
		int[] result = new int[3];
		int length = 0;
		resetCounters();
		for(int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if(check) {
					exhaustiveChecks++;
				}
				System.out.println("i: " + i);
				System.out.println("j: " + j);
				System.out.println();
				
				if(game[i][j]) {
					length++;
					
					//Call Neighbors
					int neighbors = countNeighbors(i, j);
					
					if (i == headPosition[0] && j == headPosition[1]) {
						System.out.println("head found at i: " + i + "j: " + j);
					}
					else {
						System.out.print("Tail found at i: " + i + "j: " + j);
						result[0] = i;
						result[1] = j;
						check = false;
					}
				}
				if (countNeighbors(0, 0) >= 2) {
					continue;
				}
				System.out.println("Exhautive Checks: " + exhaustiveChecks);
			}
		}
		System.out.println("Exhaustive checks = " + exhaustiveChecks);
		System.out.println("Length of the snake is " + length);
		result[2] = length;
		return result;
	}
	private int countNeighbors(int i, int j) {
		return 0;
	}
	private void resetCounters() {
		
	}
	public int[] findTailRecursive() {
		return headPosition;
		
	}
	//integer
	private int[] findTailRecursive(int[] currentPosition, int[] previousPosition) {
		int count = 0;
		int[][] previous;
		if(previous[currentPosition][previousPosition]== ) {
			count++;
		}
	
	return count;
	}
	
}
