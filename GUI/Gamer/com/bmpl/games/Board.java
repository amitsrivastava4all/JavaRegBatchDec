package com.bmpl.games;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel{
	Plane plane;
	private Timer timer;
	public Board(){
		this.setFocusable(true);
		this.setBackground(Color.CYAN);
		plane = new Plane();
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				plane.planeMove(e);
				//plane.move();
				//repaint();
			}
			@Override
			public void keyReleased(KeyEvent e){
				plane.planeDontMove();
			}
		});
		timer = new Timer(5,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				plane.move();
				repaint();
				// TODO Auto-generated method stub
				
			}
		});
		timer.start();
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D twod = (Graphics2D) g;
		twod.drawImage(plane.getImage(), plane.getX(), plane.getY(), this);
	}
}
