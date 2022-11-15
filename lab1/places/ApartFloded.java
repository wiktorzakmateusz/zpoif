package places;

import java.util.Random;

import scaringCreatures.ScaringCreature;
import visiter.Visiter;

public class ApartFloded extends Place {

	private int wartosc = 25000 + new Random().nextInt(25000);
	static int podatek = 15;
	
	@Override
	public void zbadaj(Visiter visiter) {
		if (new Random().nextBoolean()) zbadajKuchnie(visiter);
		else zbadajSalon(visiter);
		}
	
	
	int getWartoscZPodatkiem() {
		return wartosc*(1 + podatek/100);
	}
	
	private void zbadajKuchnie(Visiter visiter) {
		if (getWartoscZPodatkiem() > 55000) {
			
			var sellerGhost1 = new ScaringCreature() {};
			
			var sellerGhost2 = new ScaringCreature() {};
			
			sellerGhost1.nastraszKogos(visiter);
			sellerGhost2.nastraszKogos(visiter);
			
		}
		
		var swimmerGhost = new ScaringCreature.SwimmerGhost();
		swimmerGhost.nastraszKogos(visiter);
	}	
	
	private void zbadajSalon(Visiter visiter) {
		
	}

}
