package Demonstrator;

import java.util.List;

import places.ApartBurned;
import places.ApartFloded;
import places.ApartMessed;
import places.ShopRybka;
import visiter.Visiter;

public class Demonstrator {

	public static void main(String[] args) {
		var apartBurned = new ApartBurned();
		var apartFloded = new ApartFloded();
		var apartMessed = new ApartMessed();
		var shopRybka = new ShopRybka();
		
		List<Visiter> visitors;
		
		for (int i = 0; i <5; i++) {
			visitors.add(new Visitor.Buyer());
			visitors.add(new Visitor.Seller());
			
		}
		
		
		

	}

}
