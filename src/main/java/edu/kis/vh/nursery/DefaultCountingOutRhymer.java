package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int TOTAL_START = -1;
	private final int[] numbers = new int[SIZE];

	public int total = TOTAL_START;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == TOTAL_START;
		}
		
	public boolean isFull() {
				return total == 11;
			}
		
	protected int callPeekaboo() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total--];
	}

}
