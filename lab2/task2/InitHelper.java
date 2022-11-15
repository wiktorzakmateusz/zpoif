package task2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class InitHelper {
	Random random = new Random();
	
	
	public Supplier<String> provideRandomProducerNameGenerator() {
		Supplier<String> provideRandomProducerNameGenerator = () -> {
			List<String> producerNames = Arrays.asList("DINGO", "FAFIK", "My pet", "LAPA", "CERBER", "raBIES");
			return producerNames.get(random.nextInt(producerNames.size()));
		};
		
		return provideRandomProducerNameGenerator;
	}
	
	public Supplier<Integer> provideRandomFrequencyGenerator() {
		Supplier<Integer> provideRandomFrequencyGenerator = () -> {
			List<Integer> frequencyValues = Arrays.asList(16,18,20,22,24);
			return frequencyValues.get(random.nextInt(frequencyValues.size()));
			
		};
		
		return provideRandomFrequencyGenerator;
		
	}
	
	/*
	public Function<Boolean, Boolean> provideRandomAttestationGenerator(boolean b) {
		Function<Boolean, Boolean> provideRandomAttestationGenerator = (b) -> {
			if (b) {return true;}
			if (random.nextDouble() < 0.05) {return true;}
			else return false;		
		};
		
		return provideRandomAttestationGenerator;
	}*/
	
	public Supplier<Boolean> provideRandomAttestationGenerator(boolean b) {
		Supplier<Boolean> provideRandomAttestationGenerator = () -> {
			if (b) {return true;}
			if (random.nextDouble() < 0.05) {return true;}
			else return false;		
		};
		
		return provideRandomAttestationGenerator;
	}
	
	/*
	public Calority provideRandomCaloriesValue(int x, int y) {
		Calority provideRandomCaloriesValue = ( x, y) -> random.nextInt(x, y + 1);
		return provideRandomCaloriesValue;
	}*/
	
	public Calority provideRandomCaloriesValue() {
		Calority provideRandomCaloriesValue = (x, y) -> random.nextInt(x, y + 1);
		return provideRandomCaloriesValue;
	
	}
}
