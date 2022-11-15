package visiter;

import java.util.Random;

public abstract class Visiter {
	int odpornosc = 10 + new Random().nextInt(10);
	
	public abstract void nastraszMnie();
}
