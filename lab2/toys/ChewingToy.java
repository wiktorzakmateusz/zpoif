package toys;

import task2.InitHelper;

public class ChewingToy extends DogThings {
	private boolean atest;

	public ChewingToy(boolean alwaysTrue) {
		super();
		InitHelper initHelper = new InitHelper();
		this.atest = initHelper.provideRandomAttestationGenerator(alwaysTrue).get();
	}

	public boolean isAtest() {
		return atest;
	}
	
	
	
}
