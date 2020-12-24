package cglgame;

public class Generation {
	
	private int no_of_generations;
	
	public Generation() {
		// TODO Auto-generated constructor stub
	}
	
	Cell cell = new Cell();
	Board b = new Board();
	public void Nextgen (boolean current[][]) {
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
        b.printboard(newBoard);
	
	}
}