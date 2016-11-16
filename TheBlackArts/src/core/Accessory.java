package core;
import java.util.ArrayList; 
import java.util.Scanner;
public class Accessory extends Card {
	private int loseHP = 1;
	private int gainHP = 1;
	private boolean isUsed = false;
	Scanner input = new Scanner(System.in);
	public Accessory() {
	 
	}

	public Accessory (int loseHP, int gainHP){
		this.loseHP = loseHP;
		this.gainHP = gainHP;
	}
    public Accessory (String name, int loseHP, int gainHP, int goldCost) {
    	super.setCardName(name);
    	this.loseHP = loseHP;
		this.gainHP = gainHP;
        super.setGoldCost(goldCost);
        
    }
    //
    
    public void setgainHP(int gainHP){
    	this.gainHP = gainHP;
    }
    public int getgainHP(){
    	return this.gainHP;	
    }
    //
    public void setloseHP(int loseHP){
    	this.loseHP = loseHP;
    }
    public int getloseHP(){
    	return this.loseHP;	
    }
    //
    
    public void AccessoryCard(){
    	ArrayList<Card> inPlayZone = new ArrayList<Card>();
    	for(Card card: inPlayZone){
    		System.out.println(" "+card.getCardName());
    	}
    	if(isUsed){
    		System.out.println("select a CARD from your enemy: ");
			int s = input.nextInt();

			if(s>inPlayZone.size()){
				System.out.println("Please enter a valid number: ");
				    	s = input.nextInt();
				    }

			else{
				Card card = inPlayZone.get(s-1);
		    	if(card instanceof Monster){
		    		inPlayZone.remove(s);
		    		System.out.println("You removed a Monster from your enemy");
		    	}
		    	if(card instanceof Action){
		    		inPlayZone.remove(s);
		    		System.out.println("You removed an Action card from your enemy");
		    	}
			}
			}
    	}
    }
    

