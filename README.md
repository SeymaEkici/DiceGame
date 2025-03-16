Dice Game - README
==================

Introduction
------------

The Dice Game is a simple two-player game (you vs. the computer) where each player takes turns rolling two dice. The objective is to reach a total score of 100 points before your opponent.

Rules
-----

-   Players take turns rolling two dice.
-   If a player rolls a **single 1**, they lose all points accumulated in that turn.
-   If a player rolls **two 1s**, they lose all their accumulated points.
-   Players can choose to stop rolling and bank their current turn points into their total score.
-   The computer follows the same rules but will stop rolling once it reaches **20 points in a single turn**.
-   The first player to reach **100 points** wins the game.

How to Play
-----------

1.  Run the program.
2.  When prompted, type **"yes"** to start the game.
3.  The game alternates turns between you and the computer.
4.  During your turn, choose whether to roll again or stop and bank your points.
5.  The game continues until one player reaches 100 points.

Code Structure
--------------

The game consists of three Java classes:

### 1\. `DiceGame.java`

-   Main class that controls the game loop.
-   Handles user input and displays game messages.
-   Determines turn rules and winning conditions.

### 2\. `Die.java`

-   Represents a single die.
-   Uses `Random` to generate values between 1 and 6.
-   Provides methods to roll, get, and set face values.

### 3\. `PairOfDice.java`

-   Represents two dice rolled together.
-   Contains methods to roll both dice and retrieve their sum.
-   Implements equality checks for dice values.

How to Compile and Run
----------------------

1.  Open a terminal or command prompt.
2.  Navigate to the directory containing the files.
3.  Compile the files using:

    ```
    javac DiceGame.java Die.java PairOfDice.java

    ```

4.  Run the game using:

    ```
    java DiceGame

    ```

Sample Console Output
---------------------

```
Welcome to the DiceGame. It's you against the computer.
You play by rolling the dice. The first player to get 100 points wins.
...
Ready to begin? (Type 'yes' when you're ready)
yes

You're rolling dice...
You rolled 3 5
This gives you a turn total of 8
and a grand total of 8
The computer has a total of 0
Do you want to continue rolling? (Type 'yes' or 'no')
yes

You're rolling dice...
You rolled 2 1
You've got a 1!

I'm rolling the dice...
I rolled 4 6
This gives me a turn total of 10
and a grand total of 10
...

```

Future Improvements
-------------------

-   Add a graphical user interface (GUI) for better user experience.
-   Implement different difficulty levels for the computer opponent.
-   Allow multiplayer mode with two human players.

Enjoy the game!
