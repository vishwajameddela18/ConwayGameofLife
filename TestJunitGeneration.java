package cglgame;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJunitGeneration {

	
	@Test
	public void testcglone() throws java.lang.AssertionError,ClassNotFoundException {
		String string = "..........\r\n"
				+ "        ...**.....\r\n"
				+ "        ...**.....\r\n"
				+ "        ..........\r\n"
				+ "        ..........\r\n"
				+ "        ..........";
		Generation gen = new Generation();
		Board B2 = new Board();
		int[][] n = {{2,4},{2,5},{3,5}};
		B2.createboard(4,n);
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(string, gen.Nextgen(B2.createboard(4,n)));
	}
	
	@Test
	public void testcgltwo() throws java.lang.AssertionError,ClassNotFoundException {
		String string = "..........\n"
		        +"...**.....\n"
		        +"...**.....\n"
		        +"..........\n"
		        +"..........\n"
		        +"..***.....\n"
		        +"..**......\n"
		        +"...**.....\n"
		        +"..........\n"
		        +"..........";
		Generation gen = new Generation();
		Board B2 = new Board();
		int[][] n = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		B2.createboard(9,n);
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(string, gen.Nextgen(B2.createboard(4,n)));
	}
}
