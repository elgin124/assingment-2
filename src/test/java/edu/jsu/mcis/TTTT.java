package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

 public class TTTT
 {
	 @Test
	 
	 public void testEmptyBoard() {
		 boolean b;
		 TicTacToe board = new TicTacToe();
			String g;
			for (int r = 0; r < 3; r++) {
				for (int c = 0; c <3 ; c++){
					 g = board.get(r,c);
					assertEquals(g,board.get(r,c));
											}
										}
									}

		@Test
	public void testUserInput(){
		TicTacToe display = new TicTacToe();
		assertEquals(display.getInput(),1);
	}
	
		@Test
		
		public void testChangePlayer(){
			TicTacToe playerMark = new TicTacToe();
			assertEquals(playerMark.getInput(),'X','O');
		}
		
			
		
}



