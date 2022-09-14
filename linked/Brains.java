package linked;

public class Brains extends Board{
	private int comp;
	private int player;
	boolean[] check = new boolean[3];
	
	public static int totalMain = 50;
	public static int roundMain = 1;
	public static int totalHighScore;
	public static int totalHighScoreStore = 135;
		
	public Brains(int comp, int player) {
		this.comp = comp;
		this.player = player;
	}

	public boolean[] run(){	
		if (player > comp & comp < 6) {			
			int temp = player - comp;
			total -= temp;									
			check[0] = true;
			if (hit < 5){				
				hit++;
				check[1] = false;
			} else if (hit >= 5){
				check[1] = true;
			}
		} else if (player > comp & comp >= 6) { 
			total += 5;								
			check[0] = true;
			if (hit < 5){				
				hit++;
				check[1] = false;
			} else if (hit >= 5){
				check[1] = true;
			}
		} else {
			total -= 10;
			check[0] = false;
			if (miss < 5) {
				miss++;
				check[2] = false;
			} else {
				check[2] = true;
			}
		}	
		return check;
	}
}

