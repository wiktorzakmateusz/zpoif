package visiter;

public class Buyer extends Visiter {

	private int fearCounter = 0;
	
	@Override
	public String toString() {
		if (fearCounter > 2) return "NEUTRALNY";
		else if (fearCounter > 5) return "POIRYTOWANY";
		else if (fearCounter > 10) return "ZNIECHECONY";
		return "CHETNY";
	}

	@Override
	public void nastraszMnie() {
		fearCounter += 1;
	}
	
	
}
