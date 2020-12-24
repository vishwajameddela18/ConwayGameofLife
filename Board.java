package cglgame;

public class Board {
	
	
	private int livecells[][];
	private int size;
	
	public Board() {
	
	}
	
	public boolean[][] createboard(int size, int livecells[][]) {
		boolean[][] board = new boolean[size][size];
		for(int i=0;i<livecells.length;i++){
            int row=livecells[i][0];
            int col=livecells[i][1];
            board[row][col]=true;
        }
		printboard(board);
		return board;
	}
	
	public void printboard(boolean[][] board) {
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
        System.out.print(str);
		
	}

}
