package toys;

import task2.InitHelper;

public class Tin extends DogFood {

	public Tin() {
		InitHelper initHelper = new InitHelper();
		this.calority = initHelper.provideRandomCaloriesValue().func(300,400);
	}
	
}
