package PJ4;

import java.util.*;
import java.util.HashMap;

/*
 * Ref: http://en.wikipedia.org/wiki/Video_poker
 *      http://www.freeslots.com/poker.htm
 *
 *
 * Short Description and Poker rules:
 *
 * Video poker is also known as draw poker. 
 * The dealer uses a 52-card deck, which is played fresh after each playerHand. 
 * The player is dealt one five-card poker playerHand. 
 * After the first draw, which is automatic, you may hold any of the cards and draw 
 * again to replace the cards that you haven't chosen to hold. 
 * Your cards are compared to a table of winning combinations. 
 * The object is to get the best possible combination so that you earn the highest 
 * payout on the bet you placed. 
 *
 * Winning Combinations
 *  
 * 1. One Pair: one pair of the same card
 * 2. Two Pair: two sets of pairs of the same card denomination. 
 * 3. Three of a Kind: three cards of the same denomination. 
 * 4. Straight: five consecutive denomination cards of different suit. 
 * 5. Flush: five non-consecutive denomination cards of the same suit. 
 * 6. Full House: a set of three cards of the same denomination plus 
 * 	a set of two cards of the same denomination. 
 * 7. Four of a kind: four cards of the same denomination. 
 * 8. Straight Flush: five consecutive denomination cards of the same suit. 
 * 9. Royal Flush: five consecutive denomination cards of the same suit, 
 * 	starting from 10 and ending with an ace
 *
 */


/* This is the video poker game class.
 * It uses Decks and Card objects to implement video poker game.
 * Please do not modify any data fields or defined methods
 * You may add new data fields and methods
 * Note: You must implement defined methods
 */



public class VideoPoker {

   // default constant values
   private static final int startingBalance=100;
   private static final int numberOfCards=5;

   // default constant payout value and playerHand types
   private static final int[] multipliers={1,2,3,5,6,10,25,50,1000};
   private static final String[] goodHandTypes={ 
      "One Pair" , "Two Pairs" , "Three of a Kind", "Straight", "Flush	", 
      "Full House", "Four of a Kind", "Straight Flush", "Royal Flush" };

   // must use only one deck
   private final Decks gameDeck;

   // holding current poker 5-card hand, balance, bet    
   private List<Card> playerHand;
   private int playerBalance;
   private int playerBet;

   /** default constructor, set balance = startingBalance */
   public VideoPoker() {
      this(startingBalance);
   }

   /** constructor, set given balance */
   public VideoPoker(int balance) {
      this.playerBalance= balance;
      gameDeck = new Decks(1, false);
   }
   
   /** This display the payout table based on multipliers and goodHandTypes arrays */
   private void showPayoutTable() { 
      System.out.println("\n\n");
      System.out.println("Payout Table   	      Multiplier   ");
      System.out.println("=======================================");
      int size = multipliers.length;
      for (int i=size-1; i >= 0; i--) {
         System.out.println(goodHandTypes[i]+"\t|\t"+multipliers[i]);
      }
      System.out.println("\n\n");
   }

   /** Check current playerHand using multipliers and goodHandTypes arrays
    *  Must print yourHandType (default is "Sorry, you lost") at the end of function.
    *  This can be checked by testCheckHands() and main() method.
    */
   private void checkHands()
   {
      if (check_royal_flush()) {
         System.out.println("Royal Flush");
         calc_winnings(multipliers[8]);
         return;
      }

      if (check_straight_flush()) {
         System.out.println("Straight Flush");         
         calc_winnings(multipliers[7]);
         return;
      }

      if (check_of_kind(4)) {
         System.out.println("Four of a kind");
         calc_winnings(multipliers[6]);
         return;
      }

      if (check_full_house()) {
         System.out.println("Full House");
         calc_winnings(multipliers[5]);
         return;
      }

      if (check_flush())  {
         System.out.println("Flush");
         calc_winnings(multipliers[4]);
         return;
      }

      if (check_straight()) {       
         System.out.println("Straight");
         calc_winnings(multipliers[3]);
         return;
      }
      
      if (check_of_kind(3)) {
         System.out.println("Three of a kind");
         calc_winnings(multipliers[2]);
         return;
      }

      if (check_two_pairs()) {
         System.out.println("Two Pairs");
         calc_winnings(multipliers[1]);
         return;
      }
      
      if (check_of_kind(2)) {
         System.out.println("One Pair");
         calc_winnings(multipliers[0]);
         return;
      }

      System.out.println("You lost! \n") ;
      take_money();

      return;

   }

   private void calc_winnings(int m) {
      playerBalance = playerBalance + m * playerBet;
   }

   private void take_money() {
      playerBalance = playerBalance - playerBet;
   }
   
   private boolean check_flush() {
      int suit = playerHand.get(0).getSuit();

      for (int i=0; i<5; i++) {
         if (playerHand.get(i).getSuit() != suit) {
            return false;
         }
      }

      return true;
   }

   List<Integer> sorted_ranks() {
      List<Integer> ranks = new ArrayList<Integer>();

      for (int i=0; i<5; i++) {
         ranks.add(playerHand.get(i).getRank());
      }

      Collections.sort(ranks);
      return ranks;
   }
   
   boolean check_royal_flush() {

      if (! check_flush()) {
         return false;
      }

      List<Integer> ranks = sorted_ranks();
      List<Integer> match = new ArrayList<Integer>();
      match.add(1);
      match.add(10);
      match.add(11);
      match.add(12);
      match.add(13);

      Collections.sort(match);

      for (int i=0; i<5; i++) {
         if (ranks.get(i) != match.get(i)) {
            return false;
         }
      }
      
      return true;
   }

   int next_consecutive_card(int i) {
      int n = i + 1;
      if (n > 13) {          // may need to test for jokers
         n = 1;
      }
      return n;
   }
   
   boolean check_straight_flush() {

      if (! check_flush()) {
         return false;
      }

      if (! check_straight()) {
         return false;
      }
      
      return true;

   }

   int frequency(int c) {
      // count frequency of rank, of one card in the hand
      
      List<Integer> ranks = sorted_ranks();

      int count = 0;

      for (int i=0; i<5; i++) {
         if (ranks.get(i) == c) {
            count++;
         }
      }
      return count;
   }

   boolean check_of_kind(int k) {
      List<Integer> ranks = sorted_ranks();
      for (int i=0; i<5; i++) {
         if (frequency(ranks.get(i)) == k) {
            return true;
         }
      }
      return false;      
   }
   

   boolean check_full_house() {
      return (check_of_kind(3) && check_of_kind(2));
   }


   boolean check_straight() {
      List<Integer> ranks = sorted_ranks();
      int n = ranks.get(0);

      for (int i=0; i<5; i++) {
         if (ranks.get(i) != n) {
            return false;
         }
         n = next_consecutive_card(ranks.get(i));
      }
      return true;
   }

   private boolean check_two_pairs() {
      List<Integer> ranks = sorted_ranks();
      Collections.sort(ranks);
      for (int i=0; i<3; i++) {
         if (ranks.get(i)==ranks.get(i+1) && i<3) {
            for (int j=i+1; j<4; j++) {
               if (ranks.get(j) == ranks.get(j+1)) {
                  return true;
               }
            }
         }
      }
      return false;
   }


   /*************************************************
    *   add new private methods here ....
    *
    *************************************************/

   public void play_loop() {

// Steps:
// 		showPayoutTable()
// 		++	
// 		show balance, get bet 
// 	verify bet value, update balance
// 	reset deck, shuffle deck, 
// 	deal cards and display cards
// 	ask for positions of cards to replace 
//          get positions in one input line
// 	update cards
// 	check hands, display proper messages
// 	update balance if there is a payout

      
// 	if balance = O:
// 		end of program 

      while(playerBalance >= 0) {
         Scanner reader = new Scanner(System.in);
         showPayoutTable();
         System.out.println("Balance: " + playerBalance);
         System.out.println("Enter Bet: ");
         int bet = reader.nextInt();
         gameDeck.reset();
         gameDeck.shuffle();
         playerHand = new ArrayList<Card>();
         for (int i=0; i<5; i++) {
            playerHand.add(gameDeck.deal(1).get(0));
         }
         System.out.println("What positions to replace? ");
         String replace = reader.nextLine();
         List<String> replace_list = Arrays.asList(replace.split(","));
         while(! replace_list.isEmpty()) {
            int pos = Integer.valueOf(replace_list.get(0));
            playerHand.set(pos-1, gameDeck.deal(1).get(0));
         }
         checkHands();
         
      }

   }

   public void play() 
   {
      Scanner s = new Scanner(System.in);
      String playAgain = "yes";
      
      while (! playAgain.equals("no")) {
         play_loop();
         System.out.println("Game over.");
         System.out.println("Do you want to play again? (yes/no): ");
         String playAgain = reader.nextLine();
         if (playAgain.equals("no") {
               // print payout table  
            }
      }
      
//  The main algorithm for single player poker game 
// 	else
// 		ask if the player wants to play a new game
// 		if the answer is "no" : end of program
// 		else : showPayoutTable() if user wants to see it
// 		goto ++



      // implement this method!

   }

   /****************************************************************
    /* Do not modify methods below
    /****************************************************************

     /* testCheckHands is used to test checkHands() method 
     *  checkHands() should print your current hand type
     */ 
   public void testCheckHands()
   {
      System.out.println("**** Test checkHands method ****\n");
      try {
    		playerHand = new ArrayList<Card>();

         // set Royal Flush
         playerHand.add(new Card(1,3));
         playerHand.add(new Card(10,3));
         playerHand.add(new Card(12,3));
         playerHand.add(new Card(11,3));
         playerHand.add(new Card(13,3));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set Straight Flush
         playerHand.set(0,new Card(9,3));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set Straight
         playerHand.set(4, new Card(8,2));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set Flush 
         playerHand.set(4, new Card(5,3));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // "Royal Pair" , "Two Pairs" , "Three of a Kind", "Straight", "Flush	", 
         // "Full House", "Four of a Kind", "Straight Flush", "Royal Flush" };

         // set Four of a Kind
         playerHand.clear();
         playerHand.add(new Card(8,3));
         playerHand.add(new Card(8,0));
         playerHand.add(new Card(12,3));
         playerHand.add(new Card(8,1));
         playerHand.add(new Card(8,2));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set Three of a Kind
         playerHand.set(4, new Card(11,3));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set Full House
         playerHand.set(2, new Card(11,1));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set Two Pairs
         playerHand.set(1, new Card(9,1));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set One Pair
         playerHand.set(0, new Card(3,1));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set One Pair
         playerHand.set(2, new Card(3,3));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");

         // set no Pair
         playerHand.set(2, new Card(6,3));
         System.out.println(playerHand);
    		checkHands();
         System.out.println("-----------------------------------");
      }
       catch (Exception e)
       	{
             System.out.println("Exception Caught");
             System.out.println(e);
       	}
   }

   /* Quick testCheckHands() */
   public static void main(String args[]) 
   {
      VideoPoker pokergame = new VideoPoker();
      pokergame.testCheckHands();
   }
}
