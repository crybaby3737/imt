package hey;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Oberfläche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tictactoe ttt= new Tictactoe();

		 JFrame f= new JFrame("");
	
		 
		 JButton highscore = new JButton("Global Highscore");
		 JButton auswahl = new JButton("Spiele Auswahl");
		 JButton credits = new JButton("Credits");
		 
		 JTextField tf=new JTextField();
		 JTextField tf1=new JTextField();
		 
	//	 JLabel username1 = new JLabel("Username 1 = ");
	//	 JLabel	username2= new JLabel("Username 2 = ");


		 //Initialize Fable		
		
         JLabel background;
         ImageIcon img = new ImageIcon("E:\\IMT\\bilder/img1.png");
	  		background = new JLabel("",img,JLabel.CENTER);
	  		background.setBounds(0,0,1280,720);

		f.setLayout(null);
		f.pack();
		f.setVisible(true);
		f.setSize(1280,720);
		f.setLocationRelativeTo(null);  			 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 			// Wichtig da wir die anderen auf Dispose haben !!!
		
		 //Initialize 								JPanle p1
		 JPanel p1 = new JPanel(); 
		 f.add(p1);
		 f.setResizable(false);
		  
		 p1.setBounds(0,0,1280,720);
		 p1.setLayout(null);
		 p1.add(background);
		 p1.setBackground(Color.black);
		 
 

		


		 //								Alles editen damits PASST
		 
		
		 
		  
		// background.add(tf);    
		// tf.setBounds(400,52, 150,20); 
		 
		// background.add(tf1);
		// tf1.setBounds(900,52, 150,20);
		 
		 
	//	 background.add(username1);
	//	 username1.setBounds(300,52, 150,20);
		 
	//	 background.add(username2);
	//	 username2.setBounds(800,52, 150,20);
		 
		 // 													3 Jbuttons
		 background.add(highscore);
		 highscore.setVisible(true);
		 highscore.setBounds(100,400, 300,150);
		 highscore.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		 highscore.setForeground(Color.black);
		 highscore.setBackground(Color.decode("#d5c8c7"));
		 highscore.setFocusPainted(false);
		 highscore.setBorder(null);
		 
		 background.add(auswahl);
		 auswahl.setVisible(true);
		 auswahl.setBounds(495,400, 300,150);
		 auswahl.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		 auswahl.setForeground(Color.black);
		 auswahl.setBackground(Color.decode("#d5c8c7"));
		 auswahl.setFocusPainted(false);
		 auswahl.setBorder(null);
		 
		 auswahl.addActionListener(new ActionListener(){  
			 
		public void actionPerformed(ActionEvent e){ 
			// paar sachen erstellt.
				String name = tf.getText();
				String name1 = tf1.getText();
				JFrame f1=new JFrame("Ingame");
				JPanel p2=new JPanel();
				JButton TicTacToe= new JButton("Tic Tac Toe");
				JButton close1= new JButton("<");
			// und den Hintergrund
				JLabel background1;
		        ImageIcon img1 = new ImageIcon("E:\\IMT\\bilder/img2.png");
			  	background1 = new JLabel("",img1,JLabel.CENTER);
			  	background1.setBounds(0,0,1280,720);
			  	
			  	// Hinzugef�gt PANNEL
				f1.add(p2);
			  	p2.add(background1);
			  	p2.setBackground(Color.black);
			  	p2.setVisible(true);
		        p2.setBounds(0,0,1280,720);
		        
		       // Das IMMER als letztes richtig und wichtig!!! FRAME
		        
		        f1.setResizable(false);
		        f1.setLayout(null);
		        f1.setVisible(true);
		        f1.setSize(1280,720);
		        f1.setLocationRelativeTo(null);
				//Eingestellt
				TicTacToe.setVisible(true);
				TicTacToe.setBounds(495,400, 300,150);
				TicTacToe.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
				TicTacToe.setForeground(Color.black);
				TicTacToe.setBackground(Color.decode("#d5c8c7"));
				TicTacToe.setFocusPainted(false);
				TicTacToe.setBorder(null);
				
				close1.setVisible(true);
				close1.setBounds(50,50, 75,75);
				close1.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				close1.setForeground(Color.black);
				close1.setBackground(Color.decode("#d5c8c7"));
				close1.setFocusPainted(false);
				close1.setBorder(null);
			
				close1.addActionListener(new ActionListener(){  
					public void actionPerformed(ActionEvent e){
						f1.setVisible(false);
						// System.exit(0);
				}});
		// Eingabe der GUI
				
					background1.add(TicTacToe);
					background1.add(close1);
		
		// 	Eintrag von TikiTakiTokooo
				TicTacToe.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
				
				ttt.main(args);
			
				
					}
					
					});
			
			  	
			// CAUTION DO NOT ENTER							
			
				
					// If TEXT EMPTY MESSAGE SPIELERNAME EINTRAGEN  !!!! WIE MACHEN WIR DAS MIT SOLO PLAYER GAMES?! !!! Ist in Arbeit Armin passt auf! COVID COVID 
		          
				
				
//				if (tf1.getText().isEmpty() || tf.getText().isEmpty() ) {
//			     String message = "	\n	\t	FEHLER!"
//			    		 + "\n     "
//			    		 + "\nBei einem Spieler fehlt der Name,"
//			    		 + "\nBitte geben sie ihn ein.";
//			     JOptionPane.showMessageDialog(new JFrame(), message, "Fehler", JOptionPane.ERROR_MESSAGE);
//				} else {   -> } <-am ende einsetzen
//						
		         // JLabel l= new JLabel("eingetragene Spieler sind = " + name +" & " +name1);

		    
				}
		        
		  }); 
		 
		 
		 
		 
		 background.add(credits);
		 credits.setVisible(true);
		 credits.setBounds(880,400, 300,150);
		 credits.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		 credits.setForeground(Color.black);
		 credits.setBackground(Color.decode("#d5c8c7"));
		 credits.setFocusPainted(false);
		 credits.setBorder(null);
		 credits.addActionListener(new ActionListener(){  
			 
		public void actionPerformed(ActionEvent e){ 
			// CREATE DONT HESTITATE
			JFrame cf= new JFrame("Credits");
			JPanel cp= new JPanel();
			JButton ce= new JButton("ok");
			
			cp.setVisible(true);
			cp.setBounds(0,0,1280,720);
			cp.setLayout(null);
			
			 ce.setVisible(true);
			 ce.setBounds(600,350, 50,50);
			 ce.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
			 ce.setForeground(Color.black);
			 ce.setBackground(Color.decode("#d5c8c7"));
			 ce.setFocusPainted(false);
			 ce.setBorder(null);
			 ce.addActionListener(new ActionListener(){  
				 
					public void actionPerformed(ActionEvent e){ 
			cf.setVisible(false);
					}});
			
			cf.setSize(1280,720);
			cf.setLayout(null);								// das muss �ber RelativeToNull sein!
			cf.setLocationRelativeTo(null);
			cf.setResizable(false);
			cf.setVisible(true);
			
			
			
			
			
			
			
		     JLabel background2;
	         ImageIcon img2 = new ImageIcon("E:\\IMT\\bilder/img3.png");
		  		background2 = new JLabel("",img2,JLabel.CENTER);
		  		background2.setBounds(0,0,1280,720);
		  	
		  		
		  		// ADD THIS SH*T IN
		  		
			cf.add(cp);
			cp.add(background2);
			background2.add(ce);
		}
		 });
		 

		  
		 
		 


		


		//Initialize 								Fable

		 f.setLayout(null);
		 f.pack();
		 f.setVisible(true);
		 f.setSize(1280,720);
		 f.setLocationRelativeTo(null);  			 
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		 }

			
			
			
			

		  
		

	}


