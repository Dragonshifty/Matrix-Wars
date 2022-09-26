package linked;

public class Brains extends Board{
	private int comp;
	private int player;
	boolean[] check = new boolean[3];
	
	public static int totalMain = 50;
	public static int roundMain = 1;
	public static int totalHighScore;
	public static int totalHighScoreStore = 135;
	public static int level = 4;
		
	public Brains(int comp, int player) {
		this.comp = comp;
		this.player = player;
	}

	public boolean[] run(){	
		if (player > comp & comp < 5) {	
			// Check for successful hit and if it's below 5
			int temp = player - comp;
			total -= temp;									
			check[0] = true;
			if (hit < 5){				
				hit++;
				check[1] = false;
			} else if (hit >= 5){
				check[1] = true;
			}
		} else if (player > comp & comp >= 5) { 
			// Check for successful hit and if it's 5 or above
			switch(comp) {
				case 5:
					total += 5;
					break;
				case 6:
					total += 6;
					break;
				case 7:
					total += 7;
					break;
				case 8:
					total += 16;
					break;
				case 9:
					total += 18;
					break;
			}
			// Boolean for successful hit
			check[0] = true;
			
			if (hit < 5){				
				hit++;
				check[1] = false;
			} else if (hit >= 5){
				check[1] = true;
			}
		} else {
			// Miss
			switch (comp) {
				// Deduct points, progressively less for higher risk numbers
				case 6:
					total -= 8;
					break;
				case 7:
					total -= 6;
					break;
				case 8:
					total -= 5;
					break;
				case 9:
					total -= 4;
					break;
				default:
					total -= 10;
			}
			
						
			check[0] = false;
			if (miss < 5) {
				miss++;
				check[2] = false;
			} else {
				check[2] = true;
			}
		}	
		// Returns a boolean array for hit/miss, hits < 5, miss < 5
		return check;
	}
	
	public boolean checkLevel() {
		switch (level) {
		case 1:
			if (totalHighScoreStore > 30) {
				level++;
				return true;
			}
		case 2:
			if (totalHighScoreStore > 40) {
				level++;
				return true;
			}
		case 3:
			if (totalHighScoreStore > 50) {
				level++;
				return true;
			}
		case 4:
			if (totalHighScoreStore > 60) {
				level++;
				return true;
			}
		case 5:
			if (totalHighScoreStore > 70) {
				level++;
				return true;
			}
		case 6:
			if (totalHighScoreStore > 80) {
				level++;
				return true;
			}
		case 7:
			if (totalHighScoreStore > 90) {
				level++;
				return true;
			}
		default:
			return false;
		} 
	} 
}

