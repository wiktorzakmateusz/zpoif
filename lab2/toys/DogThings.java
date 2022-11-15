package toys;

import java.util.function.Supplier;
import task2.InitHelper;

public abstract class DogThings {
	private String producentName;
	
	DogThings() {
		InitHelper initHelper = new InitHelper();
		
		producentName = initHelper.provideRandomProducerNameGenerator().get();
	}
}
