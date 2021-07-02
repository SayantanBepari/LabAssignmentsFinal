package core_java_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import day16_JUnit.Money;
import day16_JUnit.NotSameCurrencyException;

public class MoneyTest {
	Money inr20;
	Money inr30;
	Money inr50;
	Money yen50;
		
	@Before
	public void setUp() throws Exception {
		inr20 = new Money(20,"INR");
		inr30 = new Money(30,"INR");
		inr50 = new Money(50,"INR");
		yen50 = new Money(50,"YEN");
		System.out.println("SetUp Block !");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TearDown Block!\n");
	}

	@Test
	public void testAddMoney() throws NotSameCurrencyException {
		Money result = inr20.addMoney(inr30);
		assertEquals(result,inr50);
		System.out.println("Test1 Done!");
//		fail("Not yet implemented");
	}
	
	@Test(expected = NotSameCurrencyException.class)
	public void testException() throws NotSameCurrencyException {
		System.out.println("Test2 Done!");
		yen50.addMoney(inr50);
	}

}
