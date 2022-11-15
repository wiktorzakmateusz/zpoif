package toys;

import task2.InitHelper;

public class ChewingToyWithSound extends ChewingToy {
	private int frequency;

	public ChewingToyWithSound(boolean alwaysTrue) {
		super(alwaysTrue);
		InitHelper initHelper = new InitHelper();
		this.frequency = initHelper.provideRandomFrequencyGenerator().get();
	}
	
	
}
