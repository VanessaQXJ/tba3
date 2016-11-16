package core;

public class Action extends Card {
	private String cardType = "Action";
	private int attack = 0;
	private int hitPoints = 1;
	private int goldCost = 0;
	
	Action() {
	 
	}

    public Action (String name, int hitPoints, int goldCost) {
    	super.setCardName(name);
       //* super.setActionCardSpeed(ActCardSpeed);
        //*this.attack = attack;
        this.hitPoints = hitPoints;
        super.setGoldCost(goldCost);
    }
    
    //setter
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    
    //getter
    public int getAttack() {
        return this.attack;
    }
    
    public int getHitPoints() {
        return this.hitPoints;
    }

	
	 
	 
}
