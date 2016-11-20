package test;
import java.util.ArrayList;
import core.Accessory;
import core.Card;

public class TestAccessory {
	public static void main(String[] args){
		ArrayList<Card> inPlayZone = new ArrayList<Card>();
		ArrayList<Card> deadZone = new ArrayList<Card>();

		inPlayZone.add(new Card());
		inPlayZone.add(new Card());
	
		System.out.println(inPlayZone);
		System.out.println(deadZone);
		
		Accessory accessory = new Accessory ("Ancient Tomb",2);
		
		accessory.removeACard(inPlayZone, deadZone);
		System.out.println(inPlayZone);
		System.out.println(deadZone);
	}
	
////11
}
