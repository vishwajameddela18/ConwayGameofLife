package cglgame;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;
public class TestJunitBoard {
	


//	@Test
//	public void testcglone() {
////		System.out.println("======TEST ONE STARTED=======");
//		StringBuilder sb = new StringBuilder();
//
//		Board B1 = new Board();
//	sb.append("..........\n")
//			.append("...**.....\n") 
//			.append("....*.....\n") 
//			.append("..........\n")
//			.append("...**.....\n")
//			.append("...**.....\n")
//			.append("...**.....\n")
//			.append("...**.....\n")
//			.append( "..........");
////	int size = 9;
//	int[][] n = {{1,3},{1,4},{2,4}};
//	 
//	 
//	System.out.println("======TEST ONE EXECUTED=======");
//	
//		Assertions.assertEquals(sb.toString(), B1.printBoard(B1.createBoard(9,n)));
//	
//	}
	
	@Test
	public void testcglone() {
		Board board = new Board();
		String val = "....\n"
				+".***\n"
				+"....\n"
				+"....\n";
		int[][] n = {{1,1},{1,2},{1,3}};
//		int size = 4;
		System.out.println(val);
		System.out.println("======TEST ONE EXECUTED=======");
		
        Assertions.assertEquals(val, board.printBoard(board.createBoard(4 ,n)));
	   }
	
	@Test
	public void testcgltwo() {
		Board board = new Board();
		String val = ".........\n"
				+"...*.....\n"
				+"...*.....\n"
				+"...*.....\n"
				+".........\n"
				+".........\n"
				+".........\n"
				+".........\n"
				+".........\n";
		int[][] n = {{1,3},{2,3},{3,3}};
		System.out.println(val);
		System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals(val, board.printBoard(board.createBoard(9,n)));
	   }

}
