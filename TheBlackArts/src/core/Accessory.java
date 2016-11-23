package core;
import java.util.ArrayList;
import java.util.Scanner;

public class Accessory extends Card {
	
	
	public Accessory(String name, int goldCost) {
		super.setCardName(name);
		super.setGoldCost(goldCost);
		
	}
	Game game = null;  
	
    	public void removeACard(ArrayList<Card> inPlayZone, ArrayList<Card> deadZone)
    	{
    		/* this is Ancient Tomb, what this does is to remove a card from another player's
    		 in play zone randomly. the player who use this card will lose 10 HP*/
        	Scanner input = new Scanner(System.in);
    		Card c;

			if(game.getTotalTurns() % 2 == 0){
				//this is player ONE's term
				
        		ArrayList<Card> playerTwoInPlayZone = game.getPlayerTwoInPlayZone(); 
        		/********here i want to get playertwo's in play zone's cards, 
        		 but don't know if this is 
        		the right format to write the code.???********/
        		
        		
        		
        		int i;
        		for (i = 0; i < playerTwoInPlayZone.size(); i++) {
    					//System.out.println(playerTwoInPlayZone.get(i).getCardName());
    					System.out.println( i );

        		}
        		//display numbers of all cards from playerTwoInPlayZone
        		
        		System.out.println("select a CARD you want to remove: ");
        		
        		int selectCard = input.nextInt() - 1;
            	
            	c = playerTwoInPlayZone.get(selectCard);  //get selected card's name
            	playerTwoInPlayZone.remove(selectCard);   //remove selected card
            	
            	System.out.println("You removed "+playerTwoInPlayZone.get(i).getCardName()+ "from player");//display removed card

            	deadZone.add(c);   // add selected card to deadzone
            	int newHP = super.getHitPoints()-10;  //player one loose 10 HP
            	this.setHitPoints(newHP);   //set new HP
            	System.out.println("You've removed a card, you lost 10 HP");
            	
            	
        		
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
                    this.setHitPoints(newHP);
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
