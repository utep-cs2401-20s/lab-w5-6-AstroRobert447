import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SnakeGameTester {
		public boolean [][] board1 = {
				{true, true, true, true, false},
				{true, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false}
		};
		
		public boolean [][] board2 = {
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, true, true, false, false},
				{false, false, true, false, false},
				{false, false, true, true, false}
		};
		
		public boolean [][] board3 = {
				{false, false, false, false, true},
				{false, true, false, false, true},
				{false, true, true, true, true},
				{false, false, false, false, false},
				{false, false, false, false, false}
		};
		
		public boolean [][] board4 = {
				{true, true, false, false, false},
				{true, false, false, false, false},
				{true, false, false, false, false},
				{true, true, true, true, false},
				{false, false, false, false, false}
		};
		
		public boolean [][] board5 = {
				{false, true, false, false, false},
				{false, true, false, false, false},
				{false, true, false, false, false},
				{false, true, true, false, false},
				{false, false, true, true, false},
				{false, false, false, false, false},
				{false, false, false, false, false}
		};
		
		public boolean [][] board6 = {
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, true, false, true},
				{false, false, true, false, true},
				{false, false, true, true, true},
				{false, false, false, false, false}
		};
		
		public boolean [][] board7 = {
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false}
		};
		
		public boolean [][] board8 = {
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false}
		};
		
		public boolean [][] board9 = {
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false}
		};
		
		public boolean [][] board10 = {
				{true, false, false, false, false, false, false},
				{true, false, false, false, false, false, false},
				{true, false, false, false, false, false, false},
				{true, true, false, false, false, false, false},
				{false, true, false, true, true, true, false},
				{false, true, true, true, false, true, false},
				{false, false, false, false, false, true, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false}
		};
		
	@Test
	public void test1() {	
		int[] result = {4, 0, 5};
		SnakeGame board = new SnakeGame(board1, 0, 0);
		assertArrayEquals(result, board.findTailExhaustive());
	}
	
	@Test
	public void test3() {	
		int[] result = {4, 0, 5};
		SnakeGame board = new SnakeGame(board3, 0, 0);
		assertArrayEquals(result, board.findTailExhaustive());
	}
	
	@Test
	public void test5() {	
		int[] result = {4, 0, 5};
		SnakeGame board = new SnakeGame(board5, 0, 0);
		assertArrayEquals(result, board.findTailExhaustive());
	}
	
	@Test
	public void test7() {	
		int[] result = {4, 0, 5};
		SnakeGame board = new SnakeGame(board7, 0, 0);
		assertArrayEquals(result, board.findTailExhaustive());
	}
	
	@Test
	public void test9() {	
		int[] result = {4, 0, 5};
		SnakeGame board = new SnakeGame(board9, 0, 0);
		assertArrayEquals(result, board.findTailExhaustive());
	}
	
	
}
