# Matrix-Wars
A one-step-at-a-time strategy game where risk is rewarded.

TL;DR:
You see your opponets board but not your own. Score a higher number to get a hit. Score a hit above a 5 to gain hit points; hits below 5 deducts hit points (but are easier to score). Misses on higher numbers are punished less harshly the higher the number, misses on lower numbers can (potentially) be punished more. 5 hits to clear a round, 5 misses loses, 3 rounds for a game win and high score is your remaining total hit points. Get better high scores to level up.

In-depth:
The aim of the game is to clear three rounds to get to the next level. 

The game starts with a 4x4 matrix representing the computer's game board. A second, hidden matrix is also created, which is the player's board and covers the same 4x4 area. The player starts with 50 hit points, which goes down to 45 for round 2, and 40 for the final round. 

To win a round the player must score five successful hits. To score a successful hit the player's corresponding number must be higher than the computer's number (if the computer's number is above 4 it can also be the same and not just higher).

If the player scores a successful hit on any computer's number that is 4 or below, the difference between the two numbers is SUBTRACTED from your hit points (for example if the computer has a 1 and the player unknowingly has a 7 then 6 hit points will be deducted). If the player scores a hit on any number 5 and above, points are ADDED to your to your hit points, with more hit points added the higher the number. A miss on a 4 or below will deduct 10 hit points; a miss above 5 deducts progressively less the higher the number.

If the player incurs 5 misses and if the round's hit point total gets to 0 the game is over. If the player wins three rounds, the total remaining hit points becomes the high score (unless it's lower than a previous win).

To get to level 2 the player must have their total remaining hit points above 30 - for level 3 it must be above 40, and so on and so forth until level 8, the highest level.



