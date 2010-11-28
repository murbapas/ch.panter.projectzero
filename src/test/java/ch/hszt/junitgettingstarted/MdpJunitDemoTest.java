package ch.hszt.junitgettingstarted;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MdpJunitDemoTest {
	
	private String instance;	
	private MdpJunitDemoImpl impl;
	
	@Before
	public void init(){
		this.instance = "junittest";
		this.impl = new MdpJunitDemoImpl();
	}
	
	@Test
	public void stringIsEmpty(){
		String nullString = null;
		String emptyString = "";
		assertTrue(impl.isEmpty(nullString) && impl.isEmpty(emptyString));
	}
	
	
	@Test
	public void isCapitalized(){
		String expected = "Junittest";
		String allCapital = "JUNITTEST";
		String someCaitals = "jUnITteSt";
		assertTrue(expected.equals(impl.capitalize(instance)) 
				&& expected.equals(impl.capitalize(allCapital))
				&& expected.equals(impl.capitalize(someCaitals)));
	}
	
	@Test
	public void isReverse(){
		String expected = "tsettinuj";
		assertTrue(expected.equals(impl.reverse(instance)));
	}
	
	@Test(expected = NullPointerException.class)
	public void revThrowsException(){
		String nString = null;
		impl.reverse(nString);
	}
	
	@Test
	public void stringsAreJoined(){
		String a = "a";
		String b = "b";
		String c = "c";
		String expected = "a b c";
		assertTrue(expected.equals(impl.join(a, b, c)));
	}
	

}
