package linked;
import java.util.Random;
public class Matrices {
	public static int[][] matrix = new int[4][4];		
	public int[][] compMatrix = new int[4][4];
	
//	public static int totally = 50;
//	public static int roundy = 1;
//	public static int totalHighScore;
//	public static int totalHighScoreStore = 135;
		
	public void setMatrices(){
		
		Random random = new Random();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(10);				
			}
		}
		
		for (int i = 0; i < compMatrix.length; i++) {
			for (int j = 0; j < compMatrix[i].length; j++) {
				compMatrix[i][j] = random.nextInt(10);				
			}
		}				
	}	
	
	public void getMatrix() {
		System.out.println("Your Matrix:");
		
		int count = 0;
		
		while (count < 4) {		
		for (int i : matrix[count]) {
			System.out.print(i + " ");
		}
		System.out.println();
		count++;
		}
	}
	
	public void getComputerMatrix() {
		System.out.println("Computer's Matrix:");
		
		int count = 0;
		while (count < 4) {
		
		for (int i : compMatrix[count]) {
			System.out.print(i + " ");
		}
		System.out.println();
		count++;
		}
	}
	


}
