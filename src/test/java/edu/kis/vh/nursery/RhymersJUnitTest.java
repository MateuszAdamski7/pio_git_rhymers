package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	public static final int TEST_VALUE = 4;
	public static final int EMPTY_STACK_VALUE = -1;
	public static final int FULL_STACK_VALUE = 888;


	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = TEST_VALUE;
		rhymer.countIn(testValue);

		int result = rhymer.callPeekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(FULL_STACK_VALUE);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.callPeekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.callPeekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.callPeekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = RhymersJUnitTest.EMPTY_STACK_VALUE;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = TEST_VALUE;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
