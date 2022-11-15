package places;

import java.util.Random;

import scaringCreatures.ScaringCreature;
import visiter.Visiter;

public class ApartBurned extends Place {

	private int wartosc = 10000 + new Random().nextInt(25000);

	@Override
	public void zbadaj(Visiter visiter) {
		var fireFighterGhost = new ScaringCreature.FireFighterGhost();
		
		if (wartosc < 15000) {
			fireFighterGhost.nastraszKogos(visiter);
		}	
		
		var oneTimeScaringCreature = new ScaringCreature() {
			@Override
			public void nastraszKogos(Visiter visiter) {
				if (visiter.toString() == "CHETNY" | visiter.toString() == "POIRYTOWANY") {
					visiter.nastraszMnie();
				}
				
			}
			
		};
		
		oneTimeScaringCreature.nastraszKogos(visiter);		
		
	}
	
	
	
	
	

}
