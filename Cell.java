package cglgame;

public class Cell {

	private int Row;
	private int Col;
	
	private boolean Status;
	
	public class(int Row, int Col, boolean Status) {
		this.Row = row;
		this.Col = col;
		this.Status = status;
	}

//	public int getRow() {
//		return Row;
//	}
//
//
//	public int getCol() {
//		return Col;
//	}

	

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	
	

}
