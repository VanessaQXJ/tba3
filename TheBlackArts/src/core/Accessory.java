package core;

import java.util.ArrayList;
import java.util.Scanner;
public class Accessory extends Card {
	
public Accessory(String name, int goldCost) {
		super.setGoldCost(goldCost);
	}
    public void removeACard(Game game){
    	public void removeACard(ArrayList<Card> inPlayZone, ArrayList<Card> deadZone){
        	Scanner input = new Scanner(System.in);
    		Card cards;

        	if(game.getTotalTurns() % 2 == 0){
        		ArrayList<Card> playerTwoInPlayZone = game.getPlayerTwoInPlayZone();
        		System.out.println("select a CARD you want to remove: ");
        		
        		for (int i = 0, n = playerTwoInPlayZone.size(); i < n; i++) {
    					System.out.println(playerTwoInPlayZone.get(i).getCardName());
        		}
        		int selectCard = input.nextInt() - 1;
            	
            	cards = PlayerTwoInPlayZone.get(selectCard);
            	PlayerTwoInPlayZone.remove(selectCard);
            	deadZone.add(cards);
        		
        	}
        	
        	else{
        		
        		for (int i = 0, n = inPlayZone.size(); i < n; i++) {
                    	System.out.println("Select a card to remove ");
        		}
        		
        		for (int j = 0; j < n; j++){
                     System.out.println((j + 1) + ": " + inPlayZone.get(j).getCardName());
                     }
                    	
        			int selectCard = input.nextInt() - 1;
                	
                	cards = inPlayZone.get(selectCard);
                	inPlayZone.remove(selectCard);
                	deadZone.add(cards);
        	}
        	}
    }
}

    

    
   

