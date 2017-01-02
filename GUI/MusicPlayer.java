package com.srivastava.apps;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import jaco.mp3.player.MP3Player;

public class MusicPlayer extends JFrame {
	MP3Player mp3 ;
	private DefaultListModel<String> listModel ;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayer frame = new MusicPlayer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void defaultSongs(){
		listModel.addElement("ZINDA");
		listModel.addElement("DANGAL");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		listModel.addElement("Bang Bang");
		
	}
	
	/**
	 * Create the frame.
	 */
	public MusicPlayer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		listModel = new DefaultListModel<String>();
		this.defaultSongs();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 21, 293, 233);
		contentPane.add(scrollPane);

		JList list = new JList(listModel);
//		list.addListSelectionListener(new ListSelectionListener() {
//			
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				String songName = listModel.get(list.getSelectedIndex());
//				playSong(songName);
//			}
//		});
		list.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					String songName = listModel.get(list.getSelectedIndex());
					playSong(songName);
				}
			}
			
		});
		scrollPane.getViewport().add(list);
		
		list.setBounds(71, 21, 270, 223);
		//contentPane.add(list);
	}
	private void playSong(String songName){
		
		if(songName.equalsIgnoreCase("zinda")){
		if(mp3!=null){	
			mp3.stop();
		}
		mp3 = new MP3Player(new File(SongPath.SONG));
		mp3.play();
		}
		else
		if(songName.equalsIgnoreCase("dangal")){	
			if(mp3!=null){	
				mp3.stop();
			}
			mp3 = new MP3Player(new File(SongPath.DANGAL_SONG));
			mp3.play();
		}
		
	}
}
