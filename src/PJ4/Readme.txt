CSC220 Programming Project#4
============================
 
Due Date: 11:55pm, Tuesday, 12/12 *** No late projects will be accepted ****

- Upload a zip file, including PlayingCard.java and VideoPoker.java, to ilearn

- Implement poker game program in package PJ4:
 
      Part I  (40%) Implement Decks class
      Part II (60%) Implement VideoPoker class
 
      Bonus   (30%) Add GUI, only after you have completed I & II
                    Must complete by same due date.
                    Submit both non-GUI and GUI versions
 
  See PJ4/PlayingCard.java and PJ4/VideoPoker.java for more info. 
 

- Use TestVideoPoker.java to test correctness of your program

- Compile programs (you are in directory containing Readme file):
	
  javac PJ4/*.java 
  javac TestVideoPoker.java

- Run programs (you are in directory containing Readme file):

  // Run tests in PJ4 classes 
  java PJ4.Decks
  java PJ4.VideoPoker

  // Run main test program
  java TestVideoPoker


******************************************************************************************
  
- Sample output :  java PJ4.Decks


*******    Create 1 decks of cards      ********

getNumberDecks:1

print deck:[Joker #1, Joker #2, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades]

Size:54 cards

*******    Create 2 decks of cards      ********

getNumberDecks:2
getJockers:true

************************************************

Loop # 0

Before shuffle:108 cards

	[Joker #1, Joker #2, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades, Joker #1, Joker #2, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades]

==============================================

After shuffle:108 cards

	[5 Clubs, 10 Hearts, 8 Hearts, J Spades, 6 Hearts, 2 Hearts, 2 Diamonds, K Spades, A Clubs, 2 Spades, 8 Hearts, 9 Hearts, 2 Diamonds, 5 Hearts, 5 Hearts, 3 Hearts, 5 Clubs, J Clubs, 9 Clubs, 3 Diamonds, 8 Clubs, 4 Hearts, Q Diamonds, 8 Clubs, 7 Diamonds, 4 Diamonds, A Spades, K Clubs, Joker #2, 3 Clubs, 3 Clubs, A Hearts, K Diamonds, A Diamonds, 5 Diamonds, 6 Spades, 7 Hearts, Joker #1, 7 Diamonds, K Clubs, 7 Clubs, K Hearts, 10 Diamonds, J Clubs, 2 Clubs, A Spades, 9 Spades, 7 Spades, 3 Spades, 10 Clubs, 5 Diamonds, 10 Spades, 3 Spades, 10 Diamonds, J Hearts, 8 Spades, Q Spades, Q Diamonds, Q Hearts, 10 Hearts, Q Clubs, A Diamonds, Joker #1, 7 Clubs, 7 Hearts, 9 Clubs, K Spades, 10 Clubs, 9 Diamonds, 4 Spades, 9 Diamonds, A Hearts, 6 Clubs, 6 Hearts, 10 Spades, 8 Spades, 6 Spades, 3 Hearts, 9 Hearts, 4 Hearts, K Hearts, A Clubs, 2 Hearts, 2 Spades, 4 Clubs, Joker #2, 4 Diamonds, 8 Diamonds, Q Hearts, 4 Clubs, 6 Diamonds, Q Spades, J Spades, J Diamonds, 7 Spades, 5 Spades, 5 Spades, 2 Clubs, 3 Diamonds, 4 Spades, 9 Spades, K Diamonds, 6 Diamonds, J Hearts, 6 Clubs, Q Clubs, 8 Diamonds, J Diamonds]


Hand 0:27 cards

	[A Clubs, 2 Hearts, 2 Spades, 4 Clubs, Joker #2, 4 Diamonds, 8 Diamonds, Q Hearts, 4 Clubs, 6 Diamonds, Q Spades, J Spades, J Diamonds, 7 Spades, 5 Spades, 5 Spades, 2 Clubs, 3 Diamonds, 4 Spades, 9 Spades, K Diamonds, 6 Diamonds, J Hearts, 6 Clubs, Q Clubs, 8 Diamonds, J Diamonds]


Remain:81 cards

	[5 Clubs, 10 Hearts, 8 Hearts, J Spades, 6 Hearts, 2 Hearts, 2 Diamonds, K Spades, A Clubs, 2 Spades, 8 Hearts, 9 Hearts, 2 Diamonds, 5 Hearts, 5 Hearts, 3 Hearts, 5 Clubs, J Clubs, 9 Clubs, 3 Diamonds, 8 Clubs, 4 Hearts, Q Diamonds, 8 Clubs, 7 Diamonds, 4 Diamonds, A Spades, K Clubs, Joker #2, 3 Clubs, 3 Clubs, A Hearts, K Diamonds, A Diamonds, 5 Diamonds, 6 Spades, 7 Hearts, Joker #1, 7 Diamonds, K Clubs, 7 Clubs, K Hearts, 10 Diamonds, J Clubs, 2 Clubs, A Spades, 9 Spades, 7 Spades, 3 Spades, 10 Clubs, 5 Diamonds, 10 Spades, 3 Spades, 10 Diamonds, J Hearts, 8 Spades, Q Spades, Q Diamonds, Q Hearts, 10 Hearts, Q Clubs, A Diamonds, Joker #1, 7 Clubs, 7 Hearts, 9 Clubs, K Spades, 10 Clubs, 9 Diamonds, 4 Spades, 9 Diamonds, A Hearts, 6 Clubs, 6 Hearts, 10 Spades, 8 Spades, 6 Spades, 3 Hearts, 9 Hearts, 4 Hearts, K Hearts]

==============================================

After shuffle:81 cards

	[2 Diamonds, 5 Diamonds, 8 Spades, 3 Hearts, A Spades, 3 Hearts, 9 Diamonds, K Diamonds, Q Hearts, Q Diamonds, 6 Hearts, 4 Spades, 8 Clubs, A Clubs, Q Spades, 8 Hearts, A Diamonds, K Hearts, 7 Clubs, 6 Hearts, 3 Spades, 4 Hearts, A Hearts, 4 Diamonds, 8 Spades, 10 Clubs, Joker #2, 5 Clubs, 9 Spades, 6 Clubs, 2 Hearts, A Hearts, 9 Hearts, 4 Hearts, A Diamonds, Q Clubs, 8 Hearts, 7 Spades, 9 Clubs, 9 Hearts, 3 Clubs, 2 Spades, 10 Hearts, 10 Spades, 10 Diamonds, 7 Hearts, 10 Diamonds, 7 Diamonds, J Spades, 3 Clubs, 5 Diamonds, 5 Hearts, K Spades, 9 Diamonds, A Spades, 9 Clubs, 3 Spades, 3 Diamonds, Joker #1, 2 Clubs, 8 Clubs, 10 Clubs, 6 Spades, 7 Clubs, 10 Spades, Joker #1, 6 Spades, 2 Diamonds, K Clubs, K Hearts, 10 Hearts, 5 Clubs, K Clubs, K Spades, J Clubs, Q Diamonds, J Clubs, J Hearts, 7 Hearts, 5 Hearts, 7 Diamonds]


Hand 1:27 cards

	[A Spades, 9 Clubs, 3 Spades, 3 Diamonds, Joker #1, 2 Clubs, 8 Clubs, 10 Clubs, 6 Spades, 7 Clubs, 10 Spades, Joker #1, 6 Spades, 2 Diamonds, K Clubs, K Hearts, 10 Hearts, 5 Clubs, K Clubs, K Spades, J Clubs, Q Diamonds, J Clubs, J Hearts, 7 Hearts, 5 Hearts, 7 Diamonds]


Remain:54 cards

	[2 Diamonds, 5 Diamonds, 8 Spades, 3 Hearts, A Spades, 3 Hearts, 9 Diamonds, K Diamonds, Q Hearts, Q Diamonds, 6 Hearts, 4 Spades, 8 Clubs, A Clubs, Q Spades, 8 Hearts, A Diamonds, K Hearts, 7 Clubs, 6 Hearts, 3 Spades, 4 Hearts, A Hearts, 4 Diamonds, 8 Spades, 10 Clubs, Joker #2, 5 Clubs, 9 Spades, 6 Clubs, 2 Hearts, A Hearts, 9 Hearts, 4 Hearts, A Diamonds, Q Clubs, 8 Hearts, 7 Spades, 9 Clubs, 9 Hearts, 3 Clubs, 2 Spades, 10 Hearts, 10 Spades, 10 Diamonds, 7 Hearts, 10 Diamonds, 7 Diamonds, J Spades, 3 Clubs, 5 Diamonds, 5 Hearts, K Spades, 9 Diamonds]

==============================================

After shuffle:54 cards

	[A Hearts, 7 Clubs, 10 Hearts, 2 Hearts, A Diamonds, 7 Spades, 4 Spades, Q Spades, 5 Clubs, 8 Hearts, A Diamonds, 8 Clubs, 9 Diamonds, Q Clubs, 3 Clubs, K Hearts, 9 Hearts, K Spades, K Diamonds, A Clubs, 7 Diamonds, 9 Hearts, J Spades, 8 Spades, 6 Clubs, 10 Spades, Q Hearts, 4 Hearts, 8 Hearts, 4 Hearts, 2 Diamonds, 9 Clubs, 3 Hearts, 8 Spades, 3 Hearts, 3 Clubs, A Hearts, 6 Hearts, A Spades, 4 Diamonds, 5 Diamonds, 3 Spades, 9 Spades, 5 Hearts, 9 Diamonds, 2 Spades, Q Diamonds, 7 Hearts, 5 Diamonds, 10 Diamonds, 10 Diamonds, 6 Hearts, 10 Clubs, Joker #2]


Hand 2:27 cards

	[4 Hearts, 8 Hearts, 4 Hearts, 2 Diamonds, 9 Clubs, 3 Hearts, 8 Spades, 3 Hearts, 3 Clubs, A Hearts, 6 Hearts, A Spades, 4 Diamonds, 5 Diamonds, 3 Spades, 9 Spades, 5 Hearts, 9 Diamonds, 2 Spades, Q Diamonds, 7 Hearts, 5 Diamonds, 10 Diamonds, 10 Diamonds, 6 Hearts, 10 Clubs, Joker #2]


Remain:27 cards

	[A Hearts, 7 Clubs, 10 Hearts, 2 Hearts, A Diamonds, 7 Spades, 4 Spades, Q Spades, 5 Clubs, 8 Hearts, A Diamonds, 8 Clubs, 9 Diamonds, Q Clubs, 3 Clubs, K Hearts, 9 Hearts, K Spades, K Diamonds, A Clubs, 7 Diamonds, 9 Hearts, J Spades, 8 Spades, 6 Clubs, 10 Spades, Q Hearts]

==============================================

After shuffle:27 cards

	[A Hearts, 7 Diamonds, 9 Diamonds, A Diamonds, 8 Hearts, K Spades, 7 Spades, 8 Clubs, 4 Spades, 10 Hearts, 10 Spades, 2 Hearts, 5 Clubs, Q Spades, K Hearts, 9 Hearts, J Spades, K Diamonds, A Clubs, Q Clubs, 6 Clubs, Q Hearts, A Diamonds, 7 Clubs, 9 Hearts, 8 Spades, 3 Clubs]


Hand 3:27 cards

	[A Hearts, 7 Diamonds, 9 Diamonds, A Diamonds, 8 Hearts, K Spades, 7 Spades, 8 Clubs, 4 Spades, 10 Hearts, 10 Spades, 2 Hearts, 5 Clubs, Q Spades, K Hearts, 9 Hearts, J Spades, K Diamonds, A Clubs, Q Clubs, 6 Clubs, Q Hearts, A Diamonds, 7 Clubs, 9 Hearts, 8 Spades, 3 Clubs]


Remain:0 cards

	[]

==============================================

After shuffle:0 cards

	[]


Hand 4:27 cards
*** In catch block:PlayingCardException:Error Msg: Not enough cards to deal

************************************************

Loop # 1

Before shuffle:108 cards

	[Joker #1, Joker #2, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades, Joker #1, Joker #2, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades]

==============================================

After shuffle:108 cards

	[K Hearts, A Hearts, J Clubs, 6 Diamonds, 7 Diamonds, 6 Diamonds, 6 Hearts, 2 Diamonds, J Hearts, Joker #2, 6 Spades, 2 Diamonds, Joker #1, 10 Clubs, J Diamonds, 10 Hearts, 9 Hearts, 5 Hearts, 4 Spades, 3 Diamonds, 5 Clubs, 6 Clubs, 10 Diamonds, 4 Diamonds, 7 Clubs, Joker #1, Q Clubs, 4 Spades, 10 Clubs, 2 Clubs, 7 Spades, 6 Hearts, 5 Spades, 8 Clubs, K Clubs, K Hearts, 4 Hearts, 8 Diamonds, 2 Spades, K Spades, 2 Spades, 8 Spades, 4 Clubs, 4 Clubs, Q Hearts, 5 Diamonds, 2 Hearts, 9 Spades, Joker #2, 7 Diamonds, 9 Hearts, 8 Hearts, 10 Spades, 10 Spades, 3 Hearts, 9 Spades, 3 Spades, J Spades, 8 Clubs, A Diamonds, 7 Spades, 9 Clubs, 5 Spades, A Clubs, K Clubs, J Spades, 8 Spades, 10 Hearts, Q Clubs, Q Hearts, 3 Diamonds, K Diamonds, 3 Spades, Q Spades, 7 Clubs, J Diamonds, A Clubs, J Clubs, A Spades, 9 Clubs, 6 Clubs, 3 Clubs, 3 Hearts, A Diamonds, 9 Diamonds, 8 Diamonds, 7 Hearts, Q Spades, 2 Hearts, 8 Hearts, K Diamonds, A Hearts, 2 Clubs, 6 Spades, 9 Diamonds, 5 Clubs, Q Diamonds, 10 Diamonds, A Spades, 5 Hearts, K Spades, 4 Diamonds, 5 Diamonds, Q Diamonds, 4 Hearts, 3 Clubs, 7 Hearts, J Hearts]


Hand 0:27 cards

	[3 Clubs, 3 Hearts, A Diamonds, 9 Diamonds, 8 Diamonds, 7 Hearts, Q Spades, 2 Hearts, 8 Hearts, K Diamonds, A Hearts, 2 Clubs, 6 Spades, 9 Diamonds, 5 Clubs, Q Diamonds, 10 Diamonds, A Spades, 5 Hearts, K Spades, 4 Diamonds, 5 Diamonds, Q Diamonds, 4 Hearts, 3 Clubs, 7 Hearts, J Hearts]


Remain:81 cards

	[K Hearts, A Hearts, J Clubs, 6 Diamonds, 7 Diamonds, 6 Diamonds, 6 Hearts, 2 Diamonds, J Hearts, Joker #2, 6 Spades, 2 Diamonds, Joker #1, 10 Clubs, J Diamonds, 10 Hearts, 9 Hearts, 5 Hearts, 4 Spades, 3 Diamonds, 5 Clubs, 6 Clubs, 10 Diamonds, 4 Diamonds, 7 Clubs, Joker #1, Q Clubs, 4 Spades, 10 Clubs, 2 Clubs, 7 Spades, 6 Hearts, 5 Spades, 8 Clubs, K Clubs, K Hearts, 4 Hearts, 8 Diamonds, 2 Spades, K Spades, 2 Spades, 8 Spades, 4 Clubs, 4 Clubs, Q Hearts, 5 Diamonds, 2 Hearts, 9 Spades, Joker #2, 7 Diamonds, 9 Hearts, 8 Hearts, 10 Spades, 10 Spades, 3 Hearts, 9 Spades, 3 Spades, J Spades, 8 Clubs, A Diamonds, 7 Spades, 9 Clubs, 5 Spades, A Clubs, K Clubs, J Spades, 8 Spades, 10 Hearts, Q Clubs, Q Hearts, 3 Diamonds, K Diamonds, 3 Spades, Q Spades, 7 Clubs, J Diamonds, A Clubs, J Clubs, A Spades, 9 Clubs, 6 Clubs]

==============================================

After shuffle:81 cards

	[K Hearts, 10 Spades, 4 Clubs, Q Clubs, A Clubs, 3 Spades, 2 Spades, Joker #2, 3 Diamonds, 7 Clubs, 2 Clubs, 9 Spades, 8 Spades, 6 Hearts, Q Hearts, 4 Spades, 10 Clubs, 5 Spades, 8 Spades, 10 Clubs, 5 Hearts, J Clubs, 4 Hearts, 6 Spades, 4 Diamonds, Q Hearts, 2 Diamonds, 9 Hearts, A Hearts, 7 Diamonds, 10 Hearts, 5 Diamonds, K Spades, 4 Spades, 8 Hearts, 7 Spades, A Diamonds, 9 Clubs, 2 Spades, 3 Spades, 10 Hearts, J Hearts, 3 Hearts, K Clubs, 9 Spades, A Spades, Q Clubs, 5 Spades, A Clubs, 8 Clubs, 9 Clubs, 7 Spades, 10 Diamonds, J Spades, Joker #2, 2 Hearts, 7 Diamonds, 9 Hearts, K Diamonds, J Clubs, 6 Clubs, 4 Clubs, Joker #1, 6 Hearts, 10 Spades, J Diamonds, 8 Diamonds, Q Spades, K Clubs, 7 Clubs, 6 Diamonds, 3 Diamonds, J Spades, 5 Clubs, 6 Clubs, J Diamonds, Joker #1, 8 Clubs, K Hearts, 6 Diamonds, 2 Diamonds]


Hand 1:27 cards

	[Joker #2, 2 Hearts, 7 Diamonds, 9 Hearts, K Diamonds, J Clubs, 6 Clubs, 4 Clubs, Joker #1, 6 Hearts, 10 Spades, J Diamonds, 8 Diamonds, Q Spades, K Clubs, 7 Clubs, 6 Diamonds, 3 Diamonds, J Spades, 5 Clubs, 6 Clubs, J Diamonds, Joker #1, 8 Clubs, K Hearts, 6 Diamonds, 2 Diamonds]


Remain:54 cards

	[K Hearts, 10 Spades, 4 Clubs, Q Clubs, A Clubs, 3 Spades, 2 Spades, Joker #2, 3 Diamonds, 7 Clubs, 2 Clubs, 9 Spades, 8 Spades, 6 Hearts, Q Hearts, 4 Spades, 10 Clubs, 5 Spades, 8 Spades, 10 Clubs, 5 Hearts, J Clubs, 4 Hearts, 6 Spades, 4 Diamonds, Q Hearts, 2 Diamonds, 9 Hearts, A Hearts, 7 Diamonds, 10 Hearts, 5 Diamonds, K Spades, 4 Spades, 8 Hearts, 7 Spades, A Diamonds, 9 Clubs, 2 Spades, 3 Spades, 10 Hearts, J Hearts, 3 Hearts, K Clubs, 9 Spades, A Spades, Q Clubs, 5 Spades, A Clubs, 8 Clubs, 9 Clubs, 7 Spades, 10 Diamonds, J Spades]

==============================================

After shuffle:54 cards

	[2 Diamonds, Q Clubs, K Spades, 7 Clubs, A Clubs, 10 Clubs, 3 Hearts, A Clubs, 4 Diamonds, 3 Spades, 8 Hearts, 9 Clubs, K Hearts, 4 Spades, 8 Spades, 8 Clubs, A Diamonds, 5 Hearts, Q Hearts, 4 Clubs, 10 Hearts, Q Hearts, Joker #2, A Spades, 6 Hearts, 5 Diamonds, A Hearts, 10 Spades, K Clubs, 4 Spades, 9 Spades, 6 Spades, 9 Hearts, 8 Spades, 5 Spades, 5 Spades, 2 Clubs, 10 Diamonds, J Clubs, J Spades, 9 Spades, J Hearts, 4 Hearts, 2 Spades, 9 Clubs, 10 Clubs, Q Clubs, 3 Spades, 2 Spades, 10 Hearts, 7 Diamonds, 7 Spades, 7 Spades, 3 Diamonds]


Hand 2:27 cards

	[10 Spades, K Clubs, 4 Spades, 9 Spades, 6 Spades, 9 Hearts, 8 Spades, 5 Spades, 5 Spades, 2 Clubs, 10 Diamonds, J Clubs, J Spades, 9 Spades, J Hearts, 4 Hearts, 2 Spades, 9 Clubs, 10 Clubs, Q Clubs, 3 Spades, 2 Spades, 10 Hearts, 7 Diamonds, 7 Spades, 7 Spades, 3 Diamonds]


Remain:27 cards

	[2 Diamonds, Q Clubs, K Spades, 7 Clubs, A Clubs, 10 Clubs, 3 Hearts, A Clubs, 4 Diamonds, 3 Spades, 8 Hearts, 9 Clubs, K Hearts, 4 Spades, 8 Spades, 8 Clubs, A Diamonds, 5 Hearts, Q Hearts, 4 Clubs, 10 Hearts, Q Hearts, Joker #2, A Spades, 6 Hearts, 5 Diamonds, A Hearts]

==============================================

After shuffle:27 cards

	[6 Hearts, 2 Diamonds, 10 Hearts, 3 Hearts, A Spades, A Diamonds, Joker #2, Q Hearts, 4 Clubs, 5 Hearts, K Spades, 3 Spades, Q Clubs, 9 Clubs, A Hearts, 10 Clubs, A Clubs, 8 Spades, K Hearts, 4 Diamonds, Q Hearts, 8 Hearts, 8 Clubs, A Clubs, 5 Diamonds, 4 Spades, 7 Clubs]


Hand 3:27 cards

	[6 Hearts, 2 Diamonds, 10 Hearts, 3 Hearts, A Spades, A Diamonds, Joker #2, Q Hearts, 4 Clubs, 5 Hearts, K Spades, 3 Spades, Q Clubs, 9 Clubs, A Hearts, 10 Clubs, A Clubs, 8 Spades, K Hearts, 4 Diamonds, Q Hearts, 8 Hearts, 8 Clubs, A Clubs, 5 Diamonds, 4 Spades, 7 Clubs]


Remain:0 cards

	[]

==============================================

After shuffle:0 cards

	[]


Hand 4:27 cards
*** In catch block:PlayingCardException:Error Msg: Not enough cards to deal


******************************************************************************************

- Sample output : java PJ4.VideoPoker


**** Test checkHands method ****

[A Spades, 10 Spades, Q Spades, J Spades, K Spades]
Royal Flush!
-----------------------------------
[9 Spades, 10 Spades, Q Spades, J Spades, K Spades]
Straight Flush!
-----------------------------------
[9 Spades, 10 Spades, Q Spades, J Spades, 8 Hearts]
Straight!
-----------------------------------
[9 Spades, 10 Spades, Q Spades, J Spades, 5 Spades]
Flush!
-----------------------------------
[8 Spades, 8 Clubs, Q Spades, 8 Diamonds, 8 Hearts]
Four of a Kind!
-----------------------------------
[8 Spades, 8 Clubs, Q Spades, 8 Diamonds, J Spades]
Three of a Kind!
-----------------------------------
[8 Spades, 8 Clubs, J Diamonds, 8 Diamonds, J Spades]
Full House!
-----------------------------------
[8 Spades, 9 Diamonds, J Diamonds, 8 Diamonds, J Spades]
Two Pairs!
-----------------------------------
[3 Diamonds, 9 Diamonds, J Diamonds, 8 Diamonds, J Spades]
One Pair!
-----------------------------------
[3 Diamonds, 9 Diamonds, 3 Spades, 8 Diamonds, J Spades]
One Pair!
-----------------------------------
[3 Diamonds, 9 Diamonds, 6 Spades, 8 Diamonds, J Spades]
Sorry, you lost!
-----------------------------------

******************************************************************************************

$ java TestVideoPoker 1000


=> java TestVideoPoker 1000


Payout Table          Multiplier
=======================================
Royal Flush     |       1000
Straight Flush  |       50
Four of a Kind  |       25
Full House      |       10
Flush           |       6
Straight        |       5
Three of a Kind |       3
Two Pairs       |       2
One Pair        |       1



-----------------------------------
Balance:$1000
Enter bet:200
Hand:[3 Diamonds, 9 Diamonds, K Clubs, 8 Hearts, J Clubs]
Enter positions of cards to replace (e.g. 1 4 5 ):        <---- keep all cards
Hand:[3 Diamonds, 9 Diamonds, K Clubs, 8 Hearts, J Clubs]
Sorry, you lost!

Your balance:$800, one more game (y or n)?y

Want to see payout table (y or n)y



Payout Table          Multiplier
=======================================
Royal Flush     |       1000
Straight Flush  |       50
Four of a Kind  |       25
Full House      |       10
Flush           |       6
Straight        |       5
Three of a Kind |       3
Two Pairs       |       2
One Pair        |       1



-----------------------------------
Balance:$800
Enter bet:200
Hand:[A Clubs, 2 Clubs, 2 Spades, 4 Hearts, 4 Diamonds]
Enter positions of cards to replace (e.g. 1 4 5 ):1 4 5  <--- keep 2 3
Hand:[K Clubs, 2 Clubs, 2 Spades, Q Clubs, K Spades]
Two Pairs!

Your balance:$1000, one more game (y or n)?y

Want to see payout table (y or n)n
-----------------------------------
Balance:$1000
Enter bet:500
Hand:[6 Clubs, 2 Spades, 5 Spades, J Hearts, 2 Hearts]
Enter positions of cards to replace (e.g. 1 4 5 ):1 2 3 4 5 <---- replace all cards
Hand:[4 Hearts, 2 Diamonds, 10 Clubs, 7 Hearts, 3 Spades]
Sorry, you lost!

Your balance:$500, one more game (y or n)?n

Bye!

