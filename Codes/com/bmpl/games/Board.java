package com.bmpl.games;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel{
	Plane plane;
	private Timer timer;
	private final int DELAY_TIME = 1; 
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
		timer = new Timer(DELAY_TIME,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				plane.move();
				// Print Missile
				//for(int i = 0; i<plane.getMissileList().size(); i++){
					//Missile missile = plane.getMissileList().get(i);
				
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
		//twod.drawImage(img, x, y, observer)
		for(int i = 0 ; i<plane.getMissileList().size(); i++){
			Missile missile = plane.getMissileList().get(i);
		//for(Missile missile: plane.getMissileList()){
			if(missile.isVisible()){
				missile.moveMissile();
				twod.drawImage(missile.getImage(), missile.getX(), missile.getY(), this);
				//System.out.println("Plane "+plane);
			}
			else{
				plane.getMissileList().remove(i);
			}
		}
		Toolkit.getDefaultToolkit().sync();
	}
}
