# Matrix-Wars
A Battleship-inspired game.

The aim of the game is to clear three rounds to gain a highscore, which is your total remaining hit points. 

The game starts with a 4x4 matrix representing the computer's game board. A second, hidden matrix is also created, which is the player's board and covers the same 4x4 area. The player also starts with 50 hit points, which goes down to 45 for round 2, and 40 for the final round. 

To win a round the player must score five successful hits. To score a successful hit the player must click a number on the computer's board - if the computer's number is five or lower the player's hidden number must be higher than the computer's number. If the computer's number is above 5, the player's number must be the same or higher to score a hit. 

If the player scores a successful hit on any computer's number that is 5 or below, the difference between the two numbers is SUBTRACTED from your hit points (for example if the computer has a 1 and the player unknowingly has a 7 then 6 hit points will be deducted). If the player scores a hit on any number 6 and over, 5 points are ADDED to your to your hit points - score on an 8 or 9 will crit for 8 and 9 points respectively. If the player misses and 10 points are subtracted from your hit points.

If the player incurs 5 misses and if the round's hit point total gets to 0 the game is over. If the player wins three rounds, the total remaining hit points becomes the high score (unless it's lower than a previous win).



