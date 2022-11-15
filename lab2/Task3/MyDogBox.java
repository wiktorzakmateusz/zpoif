package Task3;
import java.util.List;
import java.util.Random;

import toys.ChewingToy;
import toys.ChewingToyWithSound;
import toys.DogFood;
import toys.DogThings;
import toys.Pack;
import toys.Tin;

public class MyDogBox {
	Random random;
	
	List<DogThings> dogThings;{
	
	
	
	for (int i = 0; i < 50; i++) {
		if (i<20) {dogThings.add(new ChewingToy(random.nextBoolean()));}
		if (i<20) {dogThings.add(new ChewingToyWithSound(random.nextBoolean()));}
		if (i<40) {dogThings.add(new Pack());}
		dogThings.add(new Tin());
	}}
	
	void detectNonAttestationChew() {
		for (DogThings dt: dogThings) {
			if (dt instanceof ChewingToy & ((ChewingToy)dt).isAtest()) {
				System.out.println("Brak atestu");
			}			
		}
	}
	
	void detectCaloricFood() {
		for (DogThings dt: dogThings) {
			int sum = 0;
			if (dt instanceof DogFood & ((DogFood)dt).getCalority() > 350) {
				sum++;
				if (sum <= 31) {
					System.out.println("Uwaga na kalorie!");					
				}
			}			
		}
	}
	
	

}



