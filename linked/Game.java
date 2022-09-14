package linked;
public class Game {
	public static int t = 0;
	public static void main (String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
	            Board board = new Board();
				board.runBoard();
				board.resetCompMatrix();
            }               
        });			
	}
}
