package core;

import java.util.ArrayList;

public class Game {
    /** Let's call a Deck a deck manager to make it clear
     *  what we are using it for in a game and distinguish
     *  it from each of the player's decks.
     */
	public Deck deckManager = new Deck("Deck Manager Two");
	
    /** Each game is played by two players */
    private Player playerOne = new Player();
    private Player playerTwo = new Player();
    
    /** Each player has one deck in a game */
    private ArrayList<Card> deckOne = buildDeck(); 
    private ArrayList<Card> deckTwo = buildDeck();
    
    /** Shuffle each deck */
    public void shuffleDeck(ArrayList<Card> deck) {
    	deckManager.shuffleDeck(deck);
    }

    
    /** Each player has one hand */
    public ArrayList<Card> playerOneHand = new ArrayList<Card>();
    public ArrayList<Card> playerTwoHand = new ArrayList<Card>(); 
    
    
    /** Each player has an activatorResource pool */
    // Player one's resource pool
    
    
    // Player two's resource pool
    /** Constructors */
    public Game() {
        
    }
    
    public Game(Player p1, Player p2) {
        this.playerOne = p1;
        this.playerTwo = p2;
    }
    
    
    /** Setters */
    public void setPlayerOne(Player player) {
        this.playerOne = player;
    }
    
    public void setPlayerTwo(Player player) {
        this.playerTwo = player;
    }
    
    
    /** Getters */
    public Player getPlayerOne() {
        return playerOne;
    }
    
    public Player getPlayerTwo() {
        return playerTwo;
    }
    
    public ArrayList<Card> getDeckOne() {
        return deckOne;
    }
    
    public ArrayList<Card> getDeckTwo() {
        return deckTwo;
    }
    
    
    /** Announce the game! */
    public void announceGame() {
        System.out.println("** Welcome to The Dark Arts game **\n");   
    }
    
    /** Make the decks */
    // Create a deck object from Deck (half activator, half bear)
    public ArrayList<Card> buildDeck() {
       Deck deck = new Deck();
       ArrayList<Card> myDeck = deck.getDeckArrayList();
       deck.buildDeckOfHalfActivatorClubs(myDeck);
       deck.addToDeckTwentySixBears(myDeck);
       return myDeck;
    }
    
    
}