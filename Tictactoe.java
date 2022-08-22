package hey;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Tictactoe extends JPanel
{
	   JButton buttons[] = new JButton[9]; 
    int alternate = 0;
    
    public Tictactoe()
    {
      setLayout(new GridLayout(3,3));
      knöpfe(); 
    }
    
    public void knöpfe()
    {
        for(int i = 0; i <= 8; i++)
        {
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].setBackground(Color.black);
            buttons[i].addActionListener(new buttonListener()); // ActionListener bzw. ButtonListener zum Abfragen des Knopfdrucks
            
            add(buttons[i]);          
        }
    }
    public void resetButtons()
    {
        for(int i = 0; i <= 8; i++)
        {
            buttons[i].setText("");
            buttons[i].setBackground(Color.black);
        }
    }
    

    public class buttonListener implements ActionListener
    {
       
        public void actionPerformed(ActionEvent e) 
        {
            
            
            JButton buttonClicked = (JButton)e.getSource(); 
            if(alternate%2 == 0) {
                buttonClicked.setText("X");
                buttonClicked.setFont(new Font("Arial", Font.BOLD, 60));
            	buttonClicked.setBackground(Color.green);
            	System.out.println("x - " + alternate);
            }else {
                buttonClicked.setText("O");
                buttonClicked.setFont(new Font("Arial", Font.BOLD, 60));
            	buttonClicked.setBackground(Color.red);
            	System.out.println("o - " + alternate);//Spieler O ist ungerade Spieler 1 ist gerade
            }
            if(gewinnprüfung() == true)
            {
            
            	
                JOptionPane.showConfirmDialog(null, "Spiel beendet" );
                
                resetButtons();
            }
                
            alternate++;
            
        }
        
        public boolean gewinnprüfung()
        {
            //horizontal 
            if( checkAdjacent(0,1) && checkAdjacent(1,2) )  
            return true; 
            else if( checkAdjacent(3,4) && checkAdjacent(4,5) )
            return true;
            else if ( checkAdjacent(6,7) && checkAdjacent(7,8)) 
            return true;
            
            //vertikal
            else if ( checkAdjacent(0,3) && checkAdjacent(3,6))
            return true;
            else if ( checkAdjacent(1,4) && checkAdjacent(4,7))
            return true;
            else if ( checkAdjacent(2,5) && checkAdjacent(5,8))
            return true;
            
            //diagonal
            else if ( checkAdjacent(0,4) && checkAdjacent(4,8))
            return true;
            else if ( checkAdjacent(2,4) && checkAdjacent(4,6))
            return true;
            else 
            return false;
            }
            //ab neun züge reseten
        
        
            
            
        }
        
        
        public boolean checkAdjacent(int a, int b)
        {
            if ( buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals("") )
                return true;
            else
                return false;
        }
        
    
	
    public static void main(String[] args) 
    {
        JFrame window = new JFrame("tictactoe");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.getContentPane().add(new Tictactoe());
        window.setBounds(300,200,300,300);
        window.setVisible(true);
    }



	
	}