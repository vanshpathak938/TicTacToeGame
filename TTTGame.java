import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.KeyAdapter;
import java.awt.event.*;  
import java.awt.event.KeyEvent;

public class TTTGame {
        public static JButton button1 = new JButton("");
        public static JButton button2 = new JButton("");
        public static JButton button3 = new JButton("");
        public static JButton button4 = new JButton("");
        public static JButton button5 = new JButton("");
        public static JButton button6 = new JButton("");
        public static JButton button7 = new JButton("");
        public static JButton button8 = new JButton("");
        public static JButton button9 = new JButton("");
        public static JButton replay = new JButton("RESTART");
        public static String playerTurn = "X";
        public static String[][] grid = new String[3][3];
        public static int turnNumber = 1;
        public static int XScore = 0;
        public static int OScore = 0;
        public static void main(String[] args) {
        JFrame f = new JFrame();
        
        JLabel title = new JLabel("Tic Tac Toe");
        title.setBounds(115,20,500,70);
        f.add(title);
        title.setFont(new Font("Arial", Font.BOLD, 40));
        
        JLabel XScoreText = new JLabel("X - " + String.valueOf(XScore));
        XScoreText.setBounds(30,420,120,50);
        f.add(XScoreText);
        XScoreText.setFont(new Font("Arial", Font.BOLD, 30));
        
        JLabel YScoreText = new JLabel("O - " + String.valueOf(OScore));
        YScoreText.setBounds(400,420,120,50);
        f.add(YScoreText);
        YScoreText.setFont(new Font("Arial", Font.BOLD, 30));
        
        
        button1.setFont(new Font("Arial", Font.BOLD, 40));
        button2.setFont(new Font("Arial", Font.BOLD, 40));
        button3.setFont(new Font("Arial", Font.BOLD, 40));
        button4.setFont(new Font("Arial", Font.BOLD, 40));
        button5.setFont(new Font("Arial", Font.BOLD, 40));
        button6.setFont(new Font("Arial", Font.BOLD, 40));
        button7.setFont(new Font("Arial", Font.BOLD, 40));
        button8.setFont(new Font("Arial", Font.BOLD, 40));
        button9.setFont(new Font("Arial", Font.BOLD, 40));
        
        replay.setFont(new Font("Arial", Font.BOLD, 15));
        
        button1.setBounds(95,100,90,90);
        f.add(button1);
        button2.setBounds(205,100,90,90);
        f.add(button2);
        button3.setBounds(315,100,90,90);
        f.add(button3);
        button4.setBounds(95,210,90,90);
        f.add(button4);
        button5.setBounds(205,210,90,90);
        f.add(button5);
        button6.setBounds(315,210,90,90);
        f.add(button6);
        button7.setBounds(95,320,90,90);
        f.add(button7);
        button8.setBounds(205,320,90,90);
        f.add(button8);
        button9.setBounds(315,320,90,90);
        f.add(button9);
        
        replay.setBounds(190,420,120,50);
        f.add(replay);
        
        replay.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        enableAll();
        for(int i = 0; i < 3;i++)
        {
            for(int j = 0; j < 3;j++)
            {
                grid[i][j] = null;
            }
        }
        }});

        button1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button1.setText(playerTurn);
        grid[0][0]=playerTurn;
        winner();
        button1.setEnabled(false);
        }});
        button2.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button2.setText(playerTurn);
        grid[0][1]=playerTurn;
        winner();
        button2.setEnabled(false);
        }});
        button3.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button3.setText(playerTurn);
        grid[0][2]=playerTurn;
        winner();
        button3.setEnabled(false);
        }});
        button4.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button4.setText(playerTurn);
        grid[1][0]=playerTurn;
        winner();
        button4.setEnabled(false);
        }});
        button5.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button5.setText(playerTurn);
        grid[1][1]=playerTurn;
        winner();
        button5.setEnabled(false);
        }});
        button6.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button6.setText(playerTurn);
        grid[1][2]=playerTurn;
        winner();
        button6.setEnabled(false);
        }});
        button7.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button7.setText(playerTurn);
        grid[2][0]=playerTurn;
        winner();
        button7.setEnabled(false);
        }});
        button8.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button8.setText(playerTurn);
        grid[2][1]=playerTurn;
        winner();
        button8.setEnabled(false);
        }});
        button9.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        turns();
        button9.setText(playerTurn);
        grid[2][2]=playerTurn;
        winner();
        button9.setEnabled(false);
        }});
        
        
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static boolean gameCheck()
        {
            if((grid[0][0]==playerTurn&&grid[1][1]==playerTurn&&grid[2][2]==playerTurn)||(grid[0][2]==playerTurn&&grid[1][1]==playerTurn&&grid[2][0]==playerTurn))
            {
                return true;
            }
            if(grid[0][0]==playerTurn&&grid[0][1]==playerTurn&&grid[0][2]==playerTurn)
            {
                return true;
            }
            if(grid[1][0]==playerTurn&&grid[1][1]==playerTurn&&grid[1][2]==playerTurn)
            {
                return true;
            }
            if(grid[2][0]==playerTurn&&grid[2][1]==playerTurn&&grid[2][2]==playerTurn)
            {
                return true;
            }
            if(grid[0][0]==playerTurn&&grid[1][0]==playerTurn&&grid[2][0]==playerTurn)
            {
                return true;
            }
            if(grid[0][1]==playerTurn&&grid[1][1]==playerTurn&&grid[2][1]==playerTurn)
            {
                return true;
            }
            if(grid[0][2]==playerTurn&&grid[1][2]==playerTurn&&grid[2][2]==playerTurn)
            {
                return true;
            }
            return false;
        }
    public static void turns()
    {
      if(turnNumber%2 == 0)
        {
            playerTurn = "O";
        }
        else
        {
            playerTurn = "X";
        }
        turnNumber++;  
    }
    public static void disableAll()
    {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
    public static void enableAll()
    {
        button1.setEnabled(true);
        button1.setText("");
        button2.setEnabled(true);
        button2.setText("");
        button3.setEnabled(true);
        button3.setText("");
        button4.setEnabled(true);
        button4.setText("");
        button5.setEnabled(true);
        button5.setText("");
        button6.setEnabled(true);
        button6.setText("");
        button7.setEnabled(true);
        button7.setText("");
        button8.setEnabled(true);
        button8.setText("");
        button9.setEnabled(true);
        button9.setText("");
    }
    public static void winner()
    {
        if(gameCheck())
            {
                System.out.println(playerTurn + " is the winner!");
                if(playerTurn.equals("X"))
                {
                    XScore++;
                    JLabel XScoreText = new JLabel("X - " + String.valueOf(XScore));
                }
                if(playerTurn.equals("Y"))
                {
                    OScore++;
                    JLabel YScoreText = new JLabel("O - " + String.valueOf(OScore));
                }
                disableAll();
            }  
    }
}
