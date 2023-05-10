package exerciseTwo;

import java.util.List;

public class ThreadPartialSum extends Thread {
	
	private List<Integer> numberOne;

	public ThreadPartialSum(List<Integer> numberOne) {
		this.numberOne = numberOne;
	}
	

	public int partialSumOne = 0;
	
	@Override
	public void run() {
		
		for(Integer number : numberOne){
			partialSumOne += number;
		}
		
		System.out.println("Partial sum: " + partialSumOne);
	}
	
	public int getSum() {
		return partialSumOne;
	}

}
