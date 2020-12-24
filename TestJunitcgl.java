package cglgame;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class TestJunitcgl {

	@Test
	public void testcglone() throws ClassNotFoundException{
	String string1 = "..........\r\n"
			+ "        ...**.....\r\n"
			+ "        ....*.....\r\n"
			+ "        ..........\r\n"
			+ "        ..........";
	Board B1 = new Board();
	int[][] n = {(2,4),(2,5),(3,5)};
	boolean[][] cell = B1.createboard(4,n);
	System.out.println("======TEST ONE EXECUTED=======");
	Assertions.assertEquals(string1, B1.printboard(cell));
	
	}
	@Test
	public void testcgltwo() throws ClassNotFoundException {
		String string2 = "..........\r\n"
				+ "        ...**.....\r\n"
				+ "        ...**.....\r\n"
				+ "        ..........\r\n"
				+ "        ..........\r\n"
				+ "        ..........";
		Generation gen = new Generation();
		Board B2 = new Board();
		int[][] n = {(2,4),(2,5),(3,5)};
		boolean[][] cell = B2.createboard(4,n);
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(string2, gen.Nextgen(cell)) );
	}
	
//	@Test
//	public void testcglthree() throws ClassNotFoundException {
//		System.out.println("======TEST THREE EXECUTED=======");
//	
//	}
}
