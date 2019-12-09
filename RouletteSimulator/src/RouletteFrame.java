/**
 * A code stub/template for a simple GUI
 * - This file describes the main window
 * 
 * @author Justin Jang
 * @version 11/25/2019
 */

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.awt.Dimension;


public class RouletteFrame extends JFrame implements ActionListener
{ 

    private static final Set<Integer> blackvalues = new HashSet<Integer> (Arrays.asList(2,4,6,8,11,12,13,15,17,20,22,24,26,29,30,31,33,35));
    private static final Set<Integer> redvalues = new HashSet<Integer> (Arrays.asList(1,3,5,7,9,10,14,16,18,19,21,23,25,27,28,32,34,36));
	private Rectangle rect;
	private int trialCount, blackCount, redCount;
    private JButton startButton, resetButton, bet10, bet25, bet50, bet100, bet500, betRed, betBlack, betGreen0, betGreen00;
    private JButton [] numbers;
    private JLabel totalWinningLabel, trialLabel, outcomeLabel, blackPercentageLabel, redPercentageLabel, gameLabel, betLabel;
    private JPanel panel;
    private JTextField totalTextField, trialTextField, outcomeTextField, blackPercentageTextField, redPercentageTextField, betTextField;
    private JComponent component;
    
	private int numberarray [] = {3,6,9,12,15,18,21,24,27,30,33,36,
			  2,5,8,11,14,17,20,23,26,29,32,35,
			  1,4,7,10,13,16,19,22,25,28,31,34};
	private int masterOutcome = 999;
	private boolean blackFlag = false;
	private boolean redFlag = false;
	private boolean Flag0 = false;
	private boolean Flag00 = false;
	private String numColor;
    private int currentBetAmount = 0;
    private int categoryAmount = 0;
    private int roundwinnings = 0;
    private int totalwinnings = 0;
    private static final int BUTTON_SIZE_HEIGHT = 100;
    private static final int FRAME_WIDTH = 1300;
    private static final int FRAME_HEIGHT = 700;
    private static final int COMPONENT_WIDTH = 1200;
    private static final int COMPONENT_HEIGHT = 400;
    
    // Constructor
    public RouletteFrame()
    {
    	setSize(FRAME_WIDTH, FRAME_HEIGHT);
        createComponents();
    }
    
    private void createComponents()
    {
        // Create the GUI components

        // Create the buttons
		numbers = new JButton[36];
		
		betGreen0 = new JButton("0");
		betGreen00 = new JButton("00");
		betRed = new JButton("Red");
		betBlack = new JButton("Black");
        startButton = new JButton("Start");
        resetButton = new JButton("Reset");
        bet10 = new JButton("10");
        bet25 = new JButton("25");
        bet50 = new JButton("50");
        bet100 = new JButton("100");
        bet500 = new JButton("500");
        
        // Connect the listeners (event handlers) to the buttons
        betGreen0.addActionListener(new betGreenActionListener0());
        betGreen00.addActionListener(new betGreenActionListener00());
        betRed.addActionListener(new betRedActionListener());
        betBlack.addActionListener(new betBlackActionListener());
        startButton.addActionListener(new startButtonListener());
        resetButton.addActionListener(new resetButtonListener());
        bet10.addActionListener(new betButtonListener10());
        bet25.addActionListener(new betButtonListener25());
        bet50.addActionListener(new betButtonListener50());
        bet100.addActionListener(new betButtonListener100());
        bet500.addActionListener(new betButtonListener500());
        
        // Create the label
        betLabel = new JLabel("Your current bet is: ");
        gameLabel = new JLabel("Welcome to Gambling Addiction");
        totalWinningLabel = new JLabel("Total: ");
        trialLabel = new JLabel("Round: ");
        outcomeLabel = new JLabel("The Winning Number is: ");
        blackPercentageLabel = new JLabel("% Black: ");
        redPercentageLabel = new JLabel("% Red: ");
        
        // Create text field
        betTextField = new JTextField();
        totalTextField = new JTextField();
        trialTextField = new JTextField();
        outcomeTextField = new JTextField();
        blackPercentageTextField = new JTextField();
        redPercentageTextField = new JTextField();
        
        
        // Create the component (which we will use draw things)
        component = new RouletteComponent(rect);
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        
        // Create the panel and add the GUI components to the panel
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        startButton.setBounds(50, 50, 75, 25);
        panel.add(startButton);

        resetButton.setBounds(1175, 50, 75, 25);
        panel.add(resetButton);
        totalWinningLabel.setBounds(575, 50, 75, 25);
        panel.add(totalWinningLabel);
        totalTextField.setBounds(625, 50, 75, 25);
        panel.add(totalTextField);
      
        trialLabel.setBounds(150, 50, 75, 25);
        panel.add(trialLabel);
        trialTextField.setBounds(200, 50, 50, 25);
        panel.add(trialTextField);
        
        blackPercentageLabel.setBounds(950, 50, 75, 25);
        panel.add(blackPercentageLabel);
        blackPercentageTextField.setBounds(1000, 50, 50, 25);
        panel.add(blackPercentageTextField);
      
        redPercentageLabel.setBounds(1075, 50, 75, 25);
        panel.add(redPercentageLabel);
        redPercentageTextField.setBounds(1115, 50, 50, 25);
        panel.add(redPercentageTextField);
        panel.add(component);

        outcomeLabel.setBounds(575, 600, 200, 25);
        panel.add(outcomeLabel);
        outcomeTextField.setBounds(735, 600, 50, 25);
        panel.add(outcomeTextField);
        
        betLabel.setBounds(50, 600, 200, 25);
        panel.add(betLabel);
        betTextField.setBounds(175, 600, 125, 25);
        panel.add(betTextField);

        bet10.setBounds(550, 550, 50, 25);
        panel.add(bet10);
        bet25.setBounds(600, 550, 50, 25);
        panel.add(bet25);
        bet50.setBounds(650, 550, 50, 25);
        panel.add(bet50);
        bet100.setBounds(700, 550, 50, 25);
        panel.add(bet100);
        bet500.setBounds(750, 550, 50, 25);
        panel.add(bet500);
        
        betGreen0.setBackground(Color.GREEN);
        betGreen0.setForeground(Color.WHITE);
        betGreen0.setBounds(50, 400, 100, 100);
        panel.add(betGreen0);
        betGreen00.setBackground(Color.GREEN);
        betGreen00.setForeground(Color.WHITE);
        betGreen00.setBounds(1150, 400, 100, 100);
        panel.add(betGreen00);
        
        betGreen0.setOpaque(true);
        betGreen0.setBorder(null);
        betGreen00.setOpaque(true);
        betGreen00.setBorder(null);
        
        betRed.setBackground(Color.RED);
        betRed.setBounds(450, 400, 200, 100);
        panel.add(betRed);
        betBlack.setBackground(Color.BLACK);
        betBlack.setBounds(650, 400, 200, 100);
        panel.add(betBlack);
        
        betRed.setOpaque(true);
        betBlack.setOpaque(true);
        
        // Implementing code for 36 buttons as a JButton array
        int j = 50, k = 100;
        while (j < 1250)
        {
        	for (int i = 0; i < 36; i++)
        	{
        		if (j == 1250) 
        		{
        			k+=100; j = 50; 
        		}
        	numbers[i] = new JButton(Integer.toString(numberarray[i]));
        	//numbers[i].addActionListener(actionPerformed(numbersArrayActionListener());
        	numbers[i].setForeground(Color.WHITE);

        		if (blackvalues.contains(i+1))
        		{
        			numbers[i].setBackground(Color.BLACK);
        		}
        		else if (redvalues.contains(i+1))
        		{
        			numbers[i].setBackground(Color.RED);
        		}
        	numbers[i].setOpaque(true);
        	numbers[i].setBorder(null);
        	numbers[i].setBounds(j,k, BUTTON_SIZE_HEIGHT, BUTTON_SIZE_HEIGHT);
        	panel.add(numbers[i]);
        	j+=100;
        	}	
        }
    }

    // Event handlers
    
    class startButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	totalTextField.setText(null);
        	trialCount++;
        	trialTextField.setText("" + trialCount);
        	int outcome = (int) (Math.random() * 38) + 1;
        	int c = 0;
        	String a = "" + 0;
        	
        	if (Flag0)
        	{
        		if (outcome == 37)
        		{
        			totalwinnings -= currentBetAmount;
        			roundwinnings = currentBetAmount*18;
        			totalwinnings += roundwinnings;
        			totalTextField.setText("" + totalwinnings);
        		}
        		else
        		{
        			totalwinnings -= currentBetAmount;
        			totalTextField.setText("" + totalwinnings);
        		}
        	if (Flag00)
        	{
        		if (outcome == 38)
        		{
        			totalwinnings -= currentBetAmount;
        			roundwinnings = currentBetAmount*18;
        			totalwinnings += roundwinnings;
        			totalTextField.setText("" + totalwinnings);
        		}
        		else 
        		{
        			totalwinnings -= currentBetAmount;
        			totalTextField.setText("" + totalwinnings);
        		}
        	}
      
        	}
        	if (blackFlag)
        	{
        		if (blackvalues.contains(outcome))
        		{
        			totalwinnings -= currentBetAmount;
        			roundwinnings = currentBetAmount*2;
        			totalwinnings += roundwinnings;
        			totalTextField.setText("" + totalwinnings);
        		}
        		else
        		{
        			totalwinnings -= currentBetAmount;
        			totalTextField.setText("" + totalwinnings);
        		}
        	}
        	
        	if (redFlag)
        	{
        		if (redvalues.contains(outcome))
        		{
        			totalwinnings -= currentBetAmount;
        			roundwinnings = currentBetAmount*2;
        			totalwinnings += roundwinnings;
        			totalTextField.setText("" + totalwinnings);
        		}
        		else
        		{
        			totalwinnings -= currentBetAmount;
        			totalTextField.setText("" + totalwinnings);
        		}
        	}
        	if (outcome == 37) { c = 0; }
        	if (outcome == 38) 
        	{ 
        		c = 0;
        		a = "0" + c;
        	}
        	masterOutcome = outcome;
        	
            if (blackvalues.contains(masterOutcome))
            {
            	numColor = "BLACK";
            }
            if (redvalues.contains(masterOutcome))
            {
            	numColor = "Red";
            }
        	if (outcome < 37) 
        	{
        		outcomeTextField.setText("" + outcome);
        	}
        	else if (outcome == 37)
        	{
        		outcomeTextField.setText("" + c);
        	}
        	else
        	{
        		outcomeTextField.setText("" + a);
        	}
        	
        	int b = outcome/10;
        	if (outcome > 36) 
        	{
        		outcomeTextField.setForeground(Color.GREEN);
        	}
        	else if ((outcome%2 != 0 && b%2 == 0) || (outcome%2 == 0 && b%2 != 0)) // (outcome odd, units even)[1,3,5,21,23,25,etc] or (outcome even, units odd) [12,14,16,etc]
        	{
        		outcomeTextField.setForeground(Color.RED);
        		redCount++;
        	}
        	else if ((outcome%2 == 0 && b%2 == 0) || (outcome%2 != 0 && b%2 != 0)) // (outcome even, units even) [2,4,6,22,24,26,etc] or (outcome odd, units odd) [11,13,33,etc]
        	{
        		outcomeTextField.setForeground(Color.BLACK);
        		blackCount++;
        	}
        	
        	DecimalFormat df = new DecimalFormat("#.##");
        	String blkpct = df.format(((double)blackCount / (double)trialCount) * 100);
        	String redpct = df.format(((double)redCount / (double) trialCount) * 100);
        	
        	blackPercentageTextField.setText("" + blkpct);
        	redPercentageTextField.setText("" + redpct);
        	
        	currentBetAmount = 0;
        	categoryAmount = 0;
        	//System.out.println("black count: " + blackCount + ", red count: " + redCount + ", total trial count: " + trialCount);
        	
        }
    }
    
    class resetButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	currentBetAmount = 0;
        	roundwinnings = 0;
        	totalwinnings = 0;
        	categoryAmount = 0;
        	blackCount = 0;
        	redCount = 0;
        	trialCount = 0;
        	trialTextField.setText(null);
        	outcomeTextField.setText(null);
        	totalTextField.setText(null);
        	blackPercentageTextField.setText(null);
        	redPercentageTextField.setText(null);
            System.out.println("All fields have been reset");
        }
    }
    
    class betButtonListener10 implements ActionListener
    {
		public void actionPerformed(ActionEvent event) 
		{
			categoryAmount = 10;
		}
    }
    class betButtonListener25 implements ActionListener
    {
		public void actionPerformed(ActionEvent event) 
		{
			categoryAmount = 25;
		}
    }
    class betButtonListener50 implements ActionListener
    {
		public void actionPerformed(ActionEvent event) 
		{
			categoryAmount = 50;
		}
    }
    class betButtonListener100 implements ActionListener
    {
		public void actionPerformed(ActionEvent event) 
		{
			categoryAmount = 100;
		}
    }
    class betButtonListener500 implements ActionListener
    {
		public void actionPerformed(ActionEvent event) 
		{
			categoryAmount = 500;
		}
    }
    
    class betGreenActionListener0 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		Flag0 = true; blackFlag = false; redFlag = false; Flag00 = false;
    		currentBetAmount += categoryAmount;
    		betTextField.setText("" + currentBetAmount + " on GREEN 0");
    	}
    }
    
    class betGreenActionListener00 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		Flag00 = true; blackFlag = false; redFlag = false; Flag0 = false;
    		currentBetAmount += categoryAmount;
    		betTextField.setText("" + currentBetAmount + " on GREEN 00");
    	}
    }
    class betRedActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		redFlag = true; blackFlag = false; Flag0 = false; Flag00 = false;
    		currentBetAmount += categoryAmount;
    		System.out.println("Your current bet is: " + currentBetAmount + " on Red");
    		betTextField.setText("" + currentBetAmount + " on RED");
    	}
    }
    
    class betBlackActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		blackFlag = true; redFlag = false; Flag0 = false; Flag00 = false;
    		currentBetAmount += categoryAmount;
    		System.out.println("Your current bet is: " + currentBetAmount + " on Black");
    		betTextField.setText("" + currentBetAmount + " on BLACK");
    	}
    }
    class numbersArrayActionListener implements ActionListener
    {
	@Override
	public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == numbers)
			{
				System.out.println("lol");
				betTextField.setText(currentBetAmount + " " + numColor);
			}
		}
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
