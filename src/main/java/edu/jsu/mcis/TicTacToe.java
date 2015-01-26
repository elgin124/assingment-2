package edu.jsu.mcis;
import java.util.*;
import java.lang.*;

public class TicTacToe
{
	private char currentPlayerMark;
	public String[][] board = new String[3][3];
	int x = 0;
	int y= 0;
	public void TicTacToe() 
	{
		for(int r = 0; r < 3;r++) 
		{
			
			for (int c = 0; c < 3; c++)
			{
			board [r][c]= "-";
			
			}
		}
		
	}
	public String get(int r,int c){
		String s = board[r][c];
		return s;
	}
	
	public int getInput(){
		int q = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row");
		if (!scan.hasNext()){
			q = 1;
			
		}
		 if (scan.hasNext()){
			 q = scan.nextInt();
		 }
		 return q;
	}
	public void changePlayer(){
		
		if (currentPlayerMark == 'X'){
			currentPlayerMark = 'O';
		}
		else {
			currentPlayerMark = 'X';
		}
	}
	
}

	