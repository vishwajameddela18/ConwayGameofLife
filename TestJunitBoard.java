package cglgame;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class TestJunitBoard {
	
//	@SuppressWarnings("static-access")
//	@Test
//	public void testThing() {
//	    final ByteArrayOutputStream out = new ByteArrayOutputStream();
//	    System.setOut(new PrintStream(out));
//	    String expected = "..........\r\n"
//				+ "        ...**.....\r\n"
//				+ "        ....*.....\r\n"
//				+ "        ..........\r\n"
//				+ "        ..........";
//		Board B1 = new Board();
//		int[][] n = {{2,4},{2,5},{3,5}};
//		boolean[][] cell = B1.createboard(4,n);
//		System.out.println("======TEST ONE EXECUTED=======");
//	    Board.printboard(cell);
//
//	    final String written = out.toString();
//
//	    Assert.assertEquals(expected, written);
	

	@Test
	public void testcglone() throws java.lang.AssertionError,ClassNotFoundException{
		StringBuilder sb = new StringBuilder();

		Board B1 = new Board();
	sb.append("..........\n")
			.append("...**.....\n") 
			.append("....*.....\n") 
			.append("..........\n") 
			.append( "..........");
	int size = 9;
	int[][] n = {{1,3},{1,4},{2,4}};
	 B1.createboard(size,n);
	 
	System.out.println("======TEST ONE EXECUTED=======");
	
		Assertions.assertEquals(sb.toString(), B1.printboard());
	
	}
	
	@Test
	public void testcgltwo() {
		Board board = new Board();
		String val = ".....\n"
				+".***.\n"
				+".....";
		int[][] n = {{1,1},{1,2},{1,3}};
		board.createboard(4 ,n);
		System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals(val, board.printboard());
	   }
	
	@Test
	public void testcglthree() {
		Board board = new Board();
		String val = "........../n"
		        +"...**...../n"
		        +"....*...../n"
		        +"........../n"
		        +"........../n"
		       +"...**...../n"
		        +"..**....../n"
		        +".....*..../n"
		        +"....*...../n"
		        +"..........";
		int[][] n = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		board.createboard(4 ,n);
		System.out.println("======TEST THREE EXECUTED=======");
        Assertions.assertEquals(val, board.printboard());
	   }
//	@Test
//	public void testcgltwo() throws java.lang.AssertionError,ClassNotFoundException {
//		String string2 = "..........\r\n"
//				+ "        ...**.....\r\n"
//				+ "        ...**.....\r\n"
//				+ "        ..........\r\n"
//				+ "        ..........\r\n"
//				+ "        ..........";
//		Generation gen = new Generation();
//		Board B2 = new Board(5,5);
//		int[][] n = {{2,4},{2,5},{3,5}};
//		boolean[][] cell = B2.createboard(4,n);
//		System.out.println("======TEST TWO EXECUTED=======");
//		Assertions.assertEquals(string2, gen.Nextgen(cell));
//	}
	
//	@Test
//	public void testcglfour() throws java.lang.AssertionError,ClassNotFoundException{
//		Board board = new Board();
////		Nextgen cgl = new Nextgen();
//		String val = "..*..\n"
//				+"..*..\n"
//				+"..*..";
//		int[][] n = {(0,2)(1,2),(2,2)};
//		boolean[][] cell = board.createboard(4,n);
//		System.out.println("======TEST FOUR EXECUTED=======");
//        Assertions.assertEquals(val, board.printboard(cell));
//	   }

//	@Test
//	public void testcglthree() throws ClassNotFoundException {
//		System.out.println("======TEST THREE EXECUTED=======");
//	
//	}
}
