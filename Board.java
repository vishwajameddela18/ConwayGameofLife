
package cglgame;
public class Board {
	
	
	private int livecells[][];
	private int size;
	private boolean[][] board = new boolean[size][size];
	public Board() {
	
	}
	
	public  boolean[][] createboard(int size, int livecells[][]) {
		
		for(int i=0;i<livecells.length;i++){
            int row=livecells[i][0];
            int col=livecells[i][1];
            board[row][col]=true;
        }
//		printboard();
		return board;
	}
	
	public String printboard() {
		StringBuffer sb = new StringBuffer();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                
                if(board[i][j])
                    sb.append("*");
                else
                    sb.append(".");
                
            }
            sb.append("\n");
        }
        String str = sb.toString();
        return str;
		
	}

	public int[][] getLivecells() {
		return livecells;
	}

	public void setLivecells(int livecells[][]) {
		this.livecells = livecells;
	}

}
