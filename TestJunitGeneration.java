package cglgame;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJunitGeneration {

	
	@Test
	public void testcglone() throws java.lang.AssertionError,ClassNotFoundException {
		String string = ".........\n"
				+ "....**...\n"
				+ "....**...\n"
				+ ".........\n"
				+ ".........\n"
				+ ".........\n"
				+ ".........\n"
		+ ".........\n"
			+ ".........\n";
//		Generation gen = new Generation();
		Board B2 =  new Board();
		int[][] n = {{1,4},{1,5},{2,5}};
//		B2.createBoard(9,n);
	Generation G2 = new Generation();
//		System.out.println("======Next generation=======");
//		System.out.println(G2.generateNextGeneration(B2.createBoard(9,n), 1));
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(string, G2.generateNextGeneration(B2.createBoard(9,n),1));
		
	}
	
	@Test
	public void testcgltwo() throws java.lang.AssertionError,ClassNotFoundException {
		String string = ".........\n"
		        +"...**....\n"
		        +"...**....\n"
		        +".........\n"
		        +".........\n"
		        +"..***....\n"
		        +"..**.....\n"
		        +"...**....\n"
		        +".........\n";
		        
//		Generation gen = new Generation();
		Board B2 = new Board();
		int[][] n = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
//		B2.createBoard(9,n);
		Generation G2 = new Generation();
//		System.out.println("======Next generation=======");
//		System.out.println(G2.generateNextGeneration(B2.createBoard(9,n),1));
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(string, G2.generateNextGeneration(B2.createBoard(9,n), 1));
		
	}
	
//	public void testcgltwo()  {
//		
//		String string = ".........\n"
//				+"...*.....\n"
//				+"...*.....\n"
//				+"...*.....\n"
//				+".........\n"
//				+".........\n"
//				+".........\n"
//				+".........\n"
//				+".........\n";
//		int[][] n = {{1,3},{2,3},{3,3}};
//		Board B2 =  new Board();
////		System.out.println(string);
//		Generation G2 = new Generation();
////		System.out.println("======Next generation=======");
////		System.out.println(G2.generateNextGeneration(B2.createBoard(9,n),1));
//		System.out.println("======TEST THREE EXECUTED=======");
//		Assertions.assertEquals(string, G2.generateNextGeneration(B2.createBoard(9,n), 1));
//		
//	}
}
