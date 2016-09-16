package test;

import core.LivingAsset;

public class TestLivingAsset {

    public static void main(String[] args) {
        LivingAsset bear = new LivingAsset("Bear", 10, 10);
        System.out.println(
            "The card is named: " + 
             bear.getCardName() +
             ". " +
             "\n" +
             "It attacks for " + bear.getAttack() +
             " and it defends for " + bear.getHitPoints() + "." +
             "\n\n" +
              "\"Bears, beets, Battlestar Galactica\" -- Dwight Schrute");
        
        

    }

}