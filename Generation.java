package conwayJavaFX;


import java.util.Scanner;

public class Generation {
	
//	private  int no_of_generations;
	
//	public Generation(int row, int col) {
//		// TODO Auto-generated constructor stub
//		super();
//	}
	
//	static Cell cell = new Cell();
	Board b = new Board();
	public boolean[][] generateNextGeneration(int x, int y,boolean current[][]) { //create board output = currentarray
        int n = current.length;
//        int n = current[0].length;
        boolean[][] newBoard = new boolean[x][y];
//        while(no_of_generations > 0) {
        for(int i=0;i<n;i++){
            for(int j=0;j<current[0].length;j++){
                int ilives = b.countLiveCells(current,i,j);

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
        return newBoard;
//        no_of_generations = no_of_generations-1;
//        }
//        System.out.println(no_of_generations);
//        System.out.println(b.printBoard(newBoard));
//        return b.printBoard(newBoard);
    }
	
//	public static void main(String[] args) {
//		File myObj = new File("C:\\Users\\cakar\\eclipse-workspace\\Conway’s Game of Life Version2.1\\input1");
//        Scanner sc = new Scanner(System.myObj);
//        
//        // Reading size of the Board
//        int n = sc.nextInt();
//        
//        // Reading no. of initial live cells
//        int m = sc.nextInt();
//        int[][] l = new int[m][2];
//        int i = 0;
//        
//        // Reading Live cells
//        while (sc.hasNextInt()) {
//            l[i][0] = sc.nextInt();
//            l[i++][1] = sc.nextInt();
//        }
//        
        // creating instance to CGLVersion2
//        Board c = new Board();
//        
//        // creating nextgenratin by calling nextgenration method
//        boolean[][] nextgenboard = c.generateNextGeneration(c.createBoard());
////        sc.close();
//    
//        
//        while (no_of_generations > 0) {
//        	nextgenboard = c.generateNextGeneration(nextgenboard);
//			no_of_generations = no_of_generations - 1;
//    }
//
//	}
}
