package cglgame;

public class Cell {

	private int row;
	private int col;
	
//	private boolean status;
	
//	public Cell(int row, int col) {
//		this.row = row;
//		this.col = col;
////		this.setStatus(status);
//	}
//	
	

	public int countLiveCells(boolean[][] current,int row,int col){
        int n = current.length;
        int lives=0;
        for(int i=row-1;i<=row+1;i++){
            for(int j=col-1;j<=col+1;j++){
                if(i!=row || j!=col){
                    if(i>=0 && i<n && j>=0 && j<n && current[i][j]){
                        lives+=1;
                    }
                }
            }
        }
        return lives;
    }



//	public boolean isStatus() {
//		return status;
//	}
//
//
//
//	public void setStatus(boolean status) {
//		this.status = status;
//	}
	
	
	
	

	
	
	

}
