package linked;
public class Game {
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
