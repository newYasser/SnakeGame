package snake.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.Timer;


import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	private static final int SCREEN_WIDTH = 600;
	private static final int SCREEN_HIGHT = 600;
	private static final int UNIT_SIZE = 25;
	private static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HIGHT)/UNIT_SIZE;
	private static final int DELAY = 75;
	private final int x[] = new int[GAME_UNITS];
	private final int y[] = new int[GAME_UNITS];
	private int bodyparts = 6;
	private int appleEaten;
	private int appleX;
	private int appleY;
	private char direction = 'R';
	private  boolean running  = false;
	private Timer timer;
	private Random random;
    

    public GamePanel() {
    	random = new Random();
    	this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HIGHT));
    	this.setBackground(Color.black);
    	this.setFocusable(true);
    	this.addKeyListener(new MyKeyAdapter());
    	startGame();
    }

	
	
	
	private void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY,this);
		timer.start();
		
	}
	



 

	private void newApple() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
		
		
	}

  }
}
