package scaringCreatures;

import visiter.Visiter;

public abstract class ScaringCreature {
	public void nastraszKogos(Visiter visiter) {
		visiter.nastraszMnie();
	}
	public static class FireFighterGhost extends ScaringCreature {

		@Override
		public void nastraszKogos(Visiter visiter) {
			super.nastraszKogos(visiter);
		}
		
	}
	
	public static class StudentGhost extends ScaringCreature {

		@Override
		public void nastraszKogos(Visiter visiter) {
			if (visiter instanceof visiter.Seller)
				super.nastraszKogos(visiter);
		}
		
	}
	
	public static class SwimmerGhost extends ScaringCreature {		
	}
	
	
	
	
	
	
	
}
