package cglgame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestJunitCell {
	

	
		
		@Test
		public void testCellOne(){
			Cell cell1 = new Cell(0,0);
			System.out.println("======TEST ONE EXECUTED=======");
			Assertions.assertEquals("0",Integer.toString(cell1.getRow()));
			
		}
		@Test
		public void testCellTwo(){
			Cell cell1 = new Cell(1,1);
			System.out.println("======TEST TWO EXECUTED=======");
			Assertions.assertEquals("1",Integer.toString(cell1.getCol()));
		}
		
	

}