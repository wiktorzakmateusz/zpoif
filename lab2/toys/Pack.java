package toys;

import task2.InitHelper;

public class Pack extends DogFood {

	public Pack() {
		super();
		InitHelper initHelper = new InitHelper();
		this.calority = initHelper.provideRandomCaloriesValue().func(100,150);
	}
	
}
