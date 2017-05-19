package io.github.dauphine.lejema160.controller;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author lejema160
 *
 */
public class ConnectionToCongressLibraryTest {

	/***
	 * The REST connection under test
	 */
	ConnectionToCongressLibrary connection;

	@Test
	public void getResult_Should_Return_The_Marcxml_In_A_String() {
		String code = "70108638";
		connection = new ConnectionToCongressLibrary(code);
		String actual = connection.getResult();
		System.out.println(actual);
		CharSequence s1 = "French profiles.";
		boolean b1 = actual.contains(s1);
		System.out.println(b1);
		assertTrue(b1);
		CharSequence s2 = "Gosse, Edmund,";
		boolean b2 = actual.contains(s2);
		assertTrue(b2);		
		CharSequence s3 = "[1970]";
		boolean b3 = actual.contains(s3);
		assertTrue(b3);
	}


}
