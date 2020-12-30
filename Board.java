
package conwayJavaFX;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/*******
 * <p> Title: UserInterface Class. </p>
 * 
 * <p> Description: A JavaFX demonstration application: This controller class describes the user
 * interface for the Conway's Game of Life </p>
 * 
 * <p> Copyright: Lynn Robert Carter © 2018-05-06 </p>
 * 
 * @author Vishwaja Meddela
 * @version 3.1	2020-12-29 An implementation of creating the board for Conway Game of Life
 * 
 */
public class Board {
	
	
	private int l[][];
//	private  int n;
//	private static boolean[][] board = new boolean[n][n];
	public Board() {
	
	}
	
	

	/**
	 * ****************Conways Game Of Life***********************************
	 * Initially, there is a board with some cells which may be alive or dead. 
	 * Task is to generate the next generation of cells based on the following rules: 
	 *     
	 * Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under
	 * population. 
	 * Rule 2:Any live cell with two or three live neighbors lives on
	 * to the next generation. 
	 * Rule 3: Any live cell with more than three live  neighbors dies, as if by overpopulation. 
	 * Ruele 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
	 * 
	 * Step 1 => find the no Of Neighbours that are alive; 
	 * Step 2 => apply rules of game to get next genration by use the if conditions
	 * to check all neighbors exluding it self as given video lecture
	 * 
	 * *************Rules of Life********************* 
	 * Lonely cell will die ==> aliveNeighbours < 2 ;
	 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
	 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
	 * 
	 * @author Sridevi. K.
	 * @author <Vishwaja Meddela, 2020501120>
	 * @version Version1.1
	 */

	

	    /**
	     * Creates initial genration [borad]
	     * @param n  size of the board n X n
	     * @param l[][]  array of live cells
	     */
	    public boolean[][] createBoard(int x,int y, int l[][]) {
	    	int r = l.length;
	        boolean[][] board = new boolean[r][r];
	        for(int i=0;i<l.length;i++){
	            int row=l[i][0];
	            int col=l[i][1];
	            board[row][col]=true;
	            
	        }
	        //   System.out.println("Board");
	        
//	        System.out.println("CurrentGenration");
//	        printBoard(board);
//	        System.out.println("NextGenration");
	        // printBoard(board);
	        return board;
	        
	    }

	    /**
	     * Check for the writeup on how to print the board.
	     * @param board[][]
	     * @param n
	     * @return
	     */
//	    public void printBoard(boolean board[][]) {
//	        StringBuffer sb = new StringBuffer();
//	        for(int i=0;i<board.length;i++)
//	        {
//	            for(int j=0;j<board[i].length;j++)
//	            {
//	                //System.out.print(board[i][j]+" ");
//	                if(board[i][j]) {
//	                	UserInterface obj = new UserInterface();
//	                	
//	                Rectangle rect=new Rectangle(6+74*cellSize,6+75*cellSize,20,20); 
//			         rect.setFill(Color.RED);
//
//			         oddCanvas.getChildren().add(rect);
//	                    sb.append("*");
//	                }
////	                else
////	                    sb.append(".");
//	                
//	            }
////	            sb.append("\n");
//	        }
////	        String str = sb.toString();
////	        System.out.print(str);
////	        return str;
//	    }

	    /**
	     * Method to gerate a next generation. Call the printBoard
	     * to print the next generation.
	     * 
	     * @param board[][] board
	     * 
	     */
	    public int countLiveCells(boolean[][] current,int p,int q){
	        int n = current.length;
	        int lives=0;
	        for(int i=p-1;i<=p+1;i++){
	            for(int j=q-1;j<=q+1;j++){
	                if(i!=p || j!=q){
	                    if(i>0 && i<n && j>0 && j<n && current[i][j]){
	                        lives+=1;
	                    }
	                }
	            }
	        }
	        return lives;
	    }

	    
	    



		public int[][] getL() {
			return l;
		}



		public void setL(int l[][]) {
			this.l = l;
		}

	    /**
	     * Do not modify this main Method.
	     * 
	     * @param args
	     * @return
	     */
	    
	}


