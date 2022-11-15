package places;

import java.util.Random;

import scaringCreatures.ScaringCreature;
import visiter.Visiter;

public class ApartMessed extends Place {

	private int wartosc = 25000 + new Random().nextInt(50000);
	static int podatek = 15;
	
	@Override
	public void zbadaj(Visiter visiter) {
		if (new Random().nextDouble() < 0.4 ) {
			zbadajKuchnie(visiter);
			zbadajSalon(visiter);
		}
	}
	
	int getWartoscZPodatkiem() {
		return wartosc*(1 + podatek/100);
	}
	
	private void zbadajKuchnie(Visiter visiter) {
		if (getWartoscZPodatkiem() > 55000) {
			
			var sellerGhost1 = new ScaringCreature() {
				@Override
				public void nastraszKogos(Visiter visiter) {
					visiter.nastraszMnie();					
				}
			};
			
			var sellerGhost2 = new ScaringCreature() {
				@Override
				public void nastraszKogos(Visiter visiter) {
					visiter.nastraszMnie();					
				}
			};
			
			sellerGhost1.nastraszKogos(visiter);
			sellerGhost2.nastraszKogos(visiter);
			
		}
		
	}
	
	private void zbadajSalon(Visiter visiter) {
		for (int i = 0; i < 4; i++) {
		var studentGhost = new ScaringCreature.StudentGhost();
		studentGhost.nastraszKogos(visiter);
		}
	}

}
