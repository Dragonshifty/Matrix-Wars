package linked;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends Matrices implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	boolean[] check;
	String computer;
	
	int comp;
	static int player;	
	
	static int total = 50;
	static int round = 1;
	
	static int hit;
	static int miss;
	
	JLabel messageText;	
	JLabel hitPointsText;	
	JLabel roundText;	
	JLabel hitText;
	JLabel missText;
	JLabel sessionHighScore;
	JLabel totalHitPoints;
	JLabel currentLevel;
	JFrame frame;
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;
	JButton b16;
	
	public void runBoard(){
		frame = new JFrame("Matrix Wars");
		frame.getContentPane().setBackground(Color.BLACK);
		
		JLabel title = new JLabel("MATRIX WARS");
		
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b10 = new JButton();
		b11 = new JButton();
		b12 = new JButton();
		b13 = new JButton();
		b14 = new JButton();
		b15 = new JButton();
		b16 = new JButton();
		
		title.setBounds(74, 0, 300, 80);
		title.setFont(new Font("Calibri", Font.BOLD, 38));
		title.setForeground(Color.RED);
		
		JLabel hitPointsTitle = new JLabel("Hit Points");
		hitPointsTitle.setFont(new Font("Calibri", Font.BOLD, 20));
		hitPointsTitle.setForeground(Color.WHITE);
		hitPointsTitle.setBounds(75, 315, 100, 50);
		
		hitPointsText = new JLabel(String.valueOf(Brains.totalMain));
		hitPointsText.setFont(new Font("Calibri", Font.BOLD, 20));
		hitPointsText.setForeground(Color.WHITE);
		hitPointsText.setBounds(75, 340, 100, 50);
		
		messageText = new JLabel("Let's Begin");
		messageText.setHorizontalAlignment(SwingConstants.CENTER);
		messageText.setFont(new Font("Calibri", Font.BOLD, 20));
		messageText.setForeground(Color.WHITE);
		messageText.setBounds(142, 365, 100, 50);
		
		JLabel roundLabel = new JLabel("Round");
		roundLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		roundLabel.setForeground(Color.WHITE);
		roundLabel.setBounds(250, 315, 100, 50);
		
		roundText = new JLabel(String.valueOf(Brains.roundMain));
		roundText.setFont(new Font("Calibri", Font.BOLD, 20));
		roundText.setForeground(Color.WHITE);
		roundText.setBounds(296, 340, 100, 50);
		
		JLabel hitLabel = new JLabel("Hits");
		hitLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		hitLabel.setForeground(Color.RED);
		hitLabel.setBounds(20, 80, 100, 50);
		
		hitText = new JLabel (String.valueOf(hit));
		hitText.setFont(new Font("Calibri", Font.BOLD, 50));
		hitText.setForeground(Color.GREEN);
		hitText.setBounds(24, 142, 100, 50);
		
		JLabel missLabel = new JLabel("Miss");
		missLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		missLabel.setForeground(Color.RED);
		missLabel.setBounds(326, 80, 100, 50);
		
		missText = new JLabel(String.valueOf(miss));
		missText.setFont(new Font("Calibri", Font.BOLD, 50));
		missText.setForeground(Color.GREEN);
		missText.setBounds(330, 142, 100, 50);
		
		String tempHighScore = String.valueOf(Brains.totalHighScore);
		sessionHighScore = new JLabel("High score: " + tempHighScore +"/135");
		sessionHighScore.setFont(new Font("Calibri", Font.BOLD, 16));
		sessionHighScore.setForeground(Color.RED);
		sessionHighScore.setHorizontalAlignment(SwingConstants.RIGHT);
		sessionHighScore.setBounds(225, 420, 150, 50);
		
		String tempScore = String.valueOf(Brains.totalHighScoreStore);
		totalHitPoints = new JLabel(tempScore + "/135 : Total HP");
		totalHitPoints.setFont(new Font("Calibri", Font.BOLD, 16));
		totalHitPoints.setForeground(Color.RED);
		totalHitPoints.setHorizontalAlignment(SwingConstants.LEFT);
		totalHitPoints.setBounds(8, 420, 150, 50);
		
		currentLevel = new JLabel (String.valueOf(Brains.level));
		currentLevel.setFont(new Font("Calibri", Font.BOLD, 30));
		currentLevel.setForeground(Color.GREEN);
		currentLevel.setHorizontalAlignment(SwingConstants.CENTER);
		currentLevel.setBounds(0, 418, 380, 50);
		
		b1.setBounds(75, 80, 50, 50);
		b2.setBounds(135, 80, 50, 50);
		b3.setBounds(195, 80, 50, 50);
		b4.setBounds(255, 80, 50, 50);
		b5.setBounds(75, 140, 50, 50);
		b6.setBounds(135, 140, 50, 50);
		b7.setBounds(195, 140, 50, 50);
		b8.setBounds(255, 140, 50, 50);
		b9.setBounds(75, 200, 50, 50);
		b10.setBounds(135, 200, 50, 50);
		b11.setBounds(195, 200, 50, 50);
		b12.setBounds(255, 200, 50, 50);
		b13.setBounds(75, 260, 50, 50);
		b14.setBounds(135, 260, 50, 50);
		b15.setBounds(195, 260, 50, 50);
		b16.setBounds(255, 260, 50, 50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
		frame.add(title);
		frame.add(hitPointsTitle);
		frame.add(hitPointsText);
		frame.add(messageText);
		frame.add(roundLabel);
		frame.add(roundText);
		frame.add(hitLabel);
		frame.add(missLabel);
		frame.add(hitText);
		frame.add(missText);
		frame.add(sessionHighScore);
		frame.add(totalHitPoints);
		frame.add(currentLevel);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b10);
		frame.add(b11);
		frame.add(b12);
		frame.add(b13);
		frame.add(b14);
		frame.add(b15);
		frame.add(b16);
		
		frame.setSize(400, 500);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void resetCompMatrix() {
		Matrices mat = new Matrices();
		mat.setMatrices();
		
		b1.setText(String.valueOf(mat.compMatrix[0][0]));
		b1.setBackground(Color.GREEN);
		b1.setFont(new Font("Arial", Font.BOLD, 20));
		b1.setEnabled(true);
		b2.setText(String.valueOf(mat.compMatrix[0][1]));
		b2.setBackground(Color.GREEN);
		b2.setFont(new Font("Arial", Font.BOLD, 20));
		b2.setEnabled(true);
		b3.setText(String.valueOf(mat.compMatrix[0][2]));
		b3.setBackground(Color.GREEN);
		b3.setFont(new Font("Arial", Font.BOLD, 20));
		b3.setEnabled(true);
		b4.setText(String.valueOf(mat.compMatrix[0][3]));
		b4.setBackground(Color.GREEN);
		b4.setFont(new Font("Arial", Font.BOLD, 20));
		b4.setEnabled(true);
		b5.setText(String.valueOf(mat.compMatrix[1][0]));
		b5.setBackground(Color.GREEN);
		b5.setFont(new Font("Arial", Font.BOLD, 20));
		b5.setEnabled(true);
		b6.setText(String.valueOf(mat.compMatrix[1][1]));
		b6.setBackground(Color.GREEN);
		b6.setFont(new Font("Arial", Font.BOLD, 20));
		b6.setEnabled(true);
		b7.setText(String.valueOf(mat.compMatrix[1][2]));
		b7.setBackground(Color.GREEN);
		b7.setFont(new Font("Arial", Font.BOLD, 20));
		b7.setEnabled(true);
		b8.setText(String.valueOf(mat.compMatrix[1][3]));
		b8.setBackground(Color.GREEN);
		b8.setFont(new Font("Arial", Font.BOLD, 20));
		b8.setEnabled(true);
		b9.setText(String.valueOf(mat.compMatrix[2][0]));
		b9.setBackground(Color.GREEN);
		b9.setFont(new Font("Arial", Font.BOLD, 20));
		b9.setEnabled(true);
		b10.setText(String.valueOf(mat.compMatrix[2][1]));
		b10.setBackground(Color.GREEN);
		b10.setFont(new Font("Arial", Font.BOLD, 20));
		b10.setEnabled(true);
		b11.setText(String.valueOf(mat.compMatrix[2][2]));
		b11.setBackground(Color.GREEN);
		b11.setFont(new Font("Arial", Font.BOLD, 20));
		b11.setEnabled(true);
		b12.setText(String.valueOf(mat.compMatrix[2][3]));
		b12.setBackground(Color.GREEN);
		b12.setFont(new Font("Arial", Font.BOLD, 20));
		b12.setEnabled(true);
		b13.setText(String.valueOf(mat.compMatrix[3][0]));
		b13.setBackground(Color.GREEN);
		b13.setFont(new Font("Arial", Font.BOLD, 20));
		b13.setEnabled(true);
		b14.setText(String.valueOf(mat.compMatrix[3][1]));
		b14.setBackground(Color.GREEN);
		b14.setFont(new Font("Arial", Font.BOLD, 20));
		b14.setEnabled(true);
		b15.setText(String.valueOf(mat.compMatrix[3][2]));
		b15.setBackground(Color.GREEN);
		b15.setFont(new Font("Arial", Font.BOLD, 20));
		b15.setEnabled(true);
		b16.setText(String.valueOf(mat.compMatrix[3][3]));
		b16.setBackground(Color.GREEN);
		b16.setFont(new Font("Arial", Font.BOLD, 20));
		b16.setEnabled(true);		
	}

	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
				
		// Get computer's score reference
		computer = e.getActionCommand();
		
		// Get player's score reference, turn button red, and disable button
		if (source == b1) {
			player = matrix[0][0];
			b1.setBackground(Color.RED);
			b1.setEnabled(false);
		} else if (source == b2) {
			player = matrix[0][1];
			b2.setBackground(Color.RED);
			b2.setEnabled(false);
		} else if (source == b3) {
			player = matrix[0][2];
			b3.setBackground(Color.RED);
			b3.setEnabled(false);
		} else if (source == b4) {
			player = matrix[0][3];
			b4.setBackground(Color.RED);
			b4.setEnabled(false);
		} else if (source == b5) {
			player = matrix[1][0];
			b5.setBackground(Color.RED);
			b5.setEnabled(false);
		} else if (source == b6) {
			player = matrix[1][1];
			b6.setBackground(Color.RED);
			b6.setEnabled(false);
		} else if (source == b7) {
			player = matrix[1][2];
			b7.setBackground(Color.RED);
			b7.setEnabled(false);
		} else if (source == b8) {
			player = matrix[1][3];
			b8.setBackground(Color.RED);
			b8.setEnabled(false);
		} else if (source == b9) {
			player = matrix[2][0];
			b9.setBackground(Color.RED);
			b9.setEnabled(false);
		} else if (source == b10) {
			player = matrix[2][1];
			b10.setBackground(Color.RED);
			b10.setEnabled(false);
		} else if (source == b11) {
			player = matrix[2][2];
			b11.setBackground(Color.RED);
			b11.setEnabled(false);
		} else if (source == b12) {
			player = matrix[2][3];
			b12.setBackground(Color.RED);
			b12.setEnabled(false);
		} else if (source == b13) {
			player = matrix[3][0];
			b13.setBackground(Color.RED);
			b13.setEnabled(false);
		} else if (source == b14) {
			player = matrix[3][1];
			b14.setBackground(Color.RED);
			b14.setEnabled(false);
		} else if (source == b15) {
			player = matrix[3][2];
			b15.setBackground(Color.RED);
			b15.setEnabled(false);
		} else if (source == b16) {
			player = matrix[3][3];
			b16.setBackground(Color.RED);
			b16.setEnabled(false);
		} 
		
		comp = Integer.parseInt(computer);
		
		Brains brain = new Brains(comp, player);
		check = brain.run(); // Returns a boolean array for hit/miss, hits < 5, miss < 5
		
		hitPointsText.setText(String.valueOf(total));
		hitText.setText(String.valueOf(hit));
		missText.setText(String.valueOf(miss));		
		
		// On successful hit and above a 5, apply hit points
		if (check[0] == true) {						
			if (comp >= 5) {
				switch(comp) {
					case 5:
						messageText.setText("Hit! +5");
						Brains.totalHighScoreStore += 5;
						break;
					case 6:
						messageText.setText("Hit! +6");
						Brains.totalHighScoreStore += 6;
						break;
					case 7:
						messageText.setText("Hit! +7");
						Brains.totalHighScoreStore += 7;
						break;
					case 8:
						messageText.setText("CRIT! +16");
						Brains.totalHighScoreStore += 16;
						break;
					case 9:
						messageText.setText("CRIT! +18");
						Brains.totalHighScoreStore += 18;
						break;
				}	
			} else {
				// Successful hit but under 5 so deduct hit points with difference 
				String hitAmount = String.valueOf(player - comp);
				messageText.setText("Hit! -" + hitAmount);
				Brains.totalHighScoreStore -= player - comp;
			}												
			totalHitPoints.setText(String.valueOf(Brains.totalHighScoreStore + "/135 : Total HP"));
		} else if (check[0] == false) {
			// Miss, deduct hit points
			switch (comp) {
			// Deduct points, progressively less for higher risk numbers
			case 6:
				messageText.setText("Miss! -8");
				Brains.totalHighScoreStore -= 8;
				total -= 8;
				break;
			case 7:
				messageText.setText("Miss! -6");
				Brains.totalHighScoreStore -= 6;
				total -= 6;
				break;
			case 8:
				messageText.setText("Miss! -5");
				Brains.totalHighScoreStore -= 5;
				total -= 5;
				break;
			case 9:
				messageText.setText("Miss! -4");
				Brains.totalHighScoreStore -= 4;
				total -= 4;
				break;
			default:
				messageText.setText("Miss! -10");
				Brains.totalHighScoreStore -= 10;
		}
			// Display highscore			
			totalHitPoints.setText(String.valueOf(Brains.totalHighScoreStore) + "/135 : Total HP");
		}
		
		if (miss > 4 | total <= 0) {
			// Miss and five misses in a row. Reset board.
			JOptionPane.showMessageDialog(frame, "You lose!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
			hit=0;
			miss=0;
			total=50;
			Brains.totalMain = 50;
			Brains.roundMain = 1;
			Brains.totalHighScoreStore = 135;
			frame.dispose();
			Board board = new Board();
			board.runBoard();
			board.resetCompMatrix();
		}
		
		if (hit > 4 & round != 3 & total > 0) {
			// Five successful hits, not the final round, and hit points not negative
			hit=0;
			miss=0;
			Brains.totalMain -= 5; // Reduce round hit points by five
			Brains.roundMain++; // Increment round 			
			if (Brains.roundMain == 4) {
				// Three rounds cleared, run level logic
				boolean levelCheck = brain.checkLevel();
				String levelText = "Excellent! On to level: " + Brains.level;
				if (Brains.totalHighScore == 8) {
					JOptionPane.showMessageDialog(frame, "You've finished the game!!!", "AWESOME!", JOptionPane.INFORMATION_MESSAGE);
					Brains.total++;
				} else if (levelCheck == true) {
					JOptionPane.showMessageDialog(frame, levelText, "Well Done!", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(frame, "You won but don't have enough points for the next level", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
				}								
				// reset
				total=50;
				Brains.totalMain = 50;
				Brains.roundMain = 1;
				// Check highscore and overwrite if new highscore higher
				if (Brains.totalHighScoreStore > Brains.totalHighScore) {
					Brains.totalHighScore = Brains.totalHighScoreStore;					
				}				
				Brains.totalHighScoreStore = 135;
				frame.dispose();
				Board board = new Board();
				board.runBoard();
				board.resetCompMatrix();
			} else {
				JOptionPane.showMessageDialog(frame, "Well done! On to the next round!", "Round Complete", JOptionPane.INFORMATION_MESSAGE);
				if (Brains.totalMain == 45) {
					total = 45;
				} else {
					total = 40;
				}
				frame.dispose();
				Board board = new Board();
				board.runBoard();
				board.resetCompMatrix();
			}
		}
	}
}

