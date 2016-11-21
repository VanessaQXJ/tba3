package core;

import java.util.ArrayList;
import java.util.Scanner;
import core.Game;
import core.Card;

public class Accessory extends Card {
	
	
	public Accessory(String name, int goldCost) {
		super.setCardName(name);
		super.setGoldCost(goldCost);
		
	}
	Game game = null;
	
    	public void removeACard(ArrayList<Card> inPlayZone, ArrayList<Card> deadZone){
        	Scanner input = new Scanner(System.in);
    		Card c;
//test from v
    		
        	
			if(game.getTotalTurns() % 2 == 0){
        		ArrayList<Card> playerTwoInPlayZone = game.getPlayerTwoInPlayZone();
        		System.out.println("select a CARD you want to remove: ");
        		
        		for (int i = 0, n = playerTwoInPlayZone.size(); i < n; i++) {
    					System.out.println(playerTwoInPlayZone.get(i).getCardName());
        		}
        		int selectCard = input.nextInt() - 1;
            	
            	c = playerTwoInPlayZone.get(selectCard);
            	playerTwoInPlayZone.remove(selectCard);
            	deadZone.add(c);
            	System.out.println("You've removed a card, you will loose 10 HP");
            	int newHP = super.getHitPoints()-10;
            	this.setHitPoints(newHP);
        		
        	}
        	
        	else{
        		
        		for (int i = 0; i<inPlayZone.size(); i++) {
                    	System.out.println("Select a card to remove ");
        		}
        		
        		for (int j = 0; j < inPlayZone.size(); j++){
                     System.out.println((j + 1) + ": " + inPlayZone.get(j).getCardName());
                     }
                    	
        			int selectCard = input.nextInt() - 1;
                	
                	c = inPlayZone.get(selectCard);
                	inPlayZone.remove(selectCard);
                	deadZone.add(c);
                	int newHP = super.getHitPoints()-10;
                	super.setHitPoints(newHP);
        	}
        	
    }
  
    	public void gainOneHP(ArrayList<Card> inPlayZone, ArrayList<Card> deadZone){
        	
		if(game.getTotalTurns() % 2 == 0){
    		for (int i = 0, n = inPlayZone.size(); i < n; i++) {
                if (inPlayZone.get(i) instanceof Monster) { 
                	int newHP = inPlayZone.get(i).getHitPoints() + 1;
                	inPlayZone.get(i).setHitPoints(newHP);	
                }
                }
    	}
    	else{
    		//player two's term,all monsters in playertwo's playzone +1 hp
    	
    		ArrayList<Card> playerTwoInPlayZone = game.getPlayerTwoInPlayZone();
    		for (int j = 0, n = playerTwoInPlayZone.size(); j < n; j++) {
                if (playerTwoInPlayZone.get(j) instanceof Monster) { 
                	int newHP = playerTwoInPlayZone.get(j).getHitPoints() + 1;
                	playerTwoInPlayZone.get(j).setHitPoints(newHP);	
                }
                }
    	}
    	
    }
    
	
    }
    //Accessory card DarkShield


    

    
   

