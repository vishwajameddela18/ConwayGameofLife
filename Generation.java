package cglgame;

import java.util.Scanner;

public class Generation {
	
	private static int no_of_generations;
	
//	public Generation(int row, int col) {
//		// TODO Auto-generated constructor stub
//		super();
//	}
	
	static Cell cell = new Cell();
	Board b = new Board();
	public static boolean[][] Nextgen (boolean current[][]) {
		int n = current.length;
        boolean[][] newBoard = new boolean[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int ilives = cell.countLiveCells(current,i,j);

                if(current[i][j]){
                    if(ilives<2){ 
                        newBoard[i][j]=false;
                    }else if(ilives<=3){
                        newBoard[i][j]=true;
                    } else if(ilives>3){
                        newBoard[i][j]=false;
                    }
                }
                else{
                    if(ilives==3){
                        newBoard[i][j] = true;
                    }
                }
                
                
            }
        }
//        b.printboard();
       
        return newBoard;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading size of the Board
        int size = sc.nextInt();

        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] livecells = new int[m][2];
        int i = 0;

        // Reading Live cells
        while (sc.hasNextInt()) {
            livecells[i][0] = sc.nextInt();
            livecells[i++][1] = sc.nextInt();
        }

        // creating instance to CGLVersion2
         Board c = new Board();
         

        // creating nextgenratin by calling nextgenration method
        boolean[][] nextgenboard = Nextgen(c.createboard(size, livecells));
        sc.close();
        
        while (no_of_generations > 0) {
			nextgenboard = Nextgen(nextgenboard);
			no_of_generations = no_of_generations - 1;
    }

	}
}