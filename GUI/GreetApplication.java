import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class GreetApplication extends JFrame {
	JLabel lblGreetApplication = new JLabel("Greet Application");
	private JPanel contentPane;
	private JTextField firsttextField;
	private JTextField lastnametextField;
	JLabel msgLabel = new JLabel("");
	JLabel error1lbl = new JLabel("");
	JLabel error2lbl = new JLabel("");
	final int ENTER = 10;
	private Timer timer ;
	private boolean isVisible = true;
	private final int DELAY = 100;
	private int color = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GreetApplication frame = new GreetApplication();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.doAnimation();
				
	}
	
	private String initCap(String value){
		return String.valueOf(value.charAt(0)).toUpperCase() + value.substring(1).toLowerCase();
	}
	
	private void sayHello(){
		String msg = "Welcome "+initCap(firsttextField.getText()) +" "+initCap(lastnametextField.getText());
		msgLabel.setText(msg);
	}
	
	private String validateData(String text){
		for(int i = 0 ; i<text.length();i++){
			if(!Character.isAlphabetic(text.charAt(i))){
				return "Only Character Allowed";
			}
		}
		return "";
	}
	
	private void askToClose(){
		int choice = JOptionPane.showConfirmDialog(this, "Do u really want to close this application","BMPL",JOptionPane.YES_NO_OPTION);
		System.out.println("UR CHOICE IS "+choice);
		if(choice == JOptionPane.YES_OPTION){
			this.setVisible(false);
			this.dispose();
		}
		else
		if(choice == JOptionPane.NO_OPTION){
			return ;
		}
	}
	
	private void clearAll(){
		firsttextField.setText("");
		lastnametextField.setText("");
		error1lbl.setText("");
		error2lbl.setText("");
		msgLabel.setText("");
		firsttextField.requestFocus(true);
	}
	
	private void changeSize(){
		lblGreetApplication.setFont(new Font("Arial", Font.BOLD, 20+color));
	}
	
	private Color changeColor(){
		Color myColor = null;
		if(color>7){
			color = 1;
		}
		switch(color){
		case 1:
			myColor = Color.RED;
			break;
		case 7:
			myColor = Color.MAGENTA;
			break;
		case 2:
			myColor = Color.BLUE;
			break;
		case 3:
			myColor = Color.ORANGE;
			break;
		case 4:
			myColor = Color.GRAY;
			break;
		case 5:
			myColor = Color.CYAN;
			break;
		case 6:
			myColor = Color.GREEN;
			break;
			default :
				myColor = Color.YELLOW;
		}
		color++;
		return myColor;
	}
	
	private void doAnimation(){
		ActionListener l = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isVisible){
					lblGreetApplication.setForeground(changeColor());
					changeSize();
					}
				lblGreetApplication.setVisible(isVisible);
				isVisible = ! isVisible;
				
				
			}
		};
		timer = new Timer(DELAY, l);
		timer.start();
	}

	/**
	 * Create the frame.
	 */
	public GreetApplication() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askToClose();
			}
		});
		
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblGreetApplication.setForeground(Color.RED);
		lblGreetApplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreetApplication.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblGreetApplication.setBounds(147, 30, 194, 16);
		contentPane.add(lblGreetApplication);
		
		JLabel lblFirstname = new JLabel("FirstName");
		lblFirstname.setBounds(35, 78, 127, 16);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setBounds(35, 136, 127, 16);
		contentPane.add(lblLastname);
		
		firsttextField = new JTextField();
		firsttextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				System.out.println("Key Code "+e.getKeyCode());
				if(e.getKeyCode()==ENTER){
					System.out.println("Inside IF...");
					lastnametextField.requestFocus();
					return ;
				}
				error1lbl.setText(validateData(firsttextField.getText()));
			}
		});
		firsttextField.setBounds(126, 73, 215, 26);
		contentPane.add(firsttextField);
		firsttextField.setColumns(10);
		
		lastnametextField = new JTextField();
		lastnametextField.setColumns(10);
		lastnametextField.setBounds(126, 131, 215, 26);
		contentPane.add(lastnametextField);
		
		JButton btnGreet = new JButton("Greet");
		btnGreet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayHello();
			}
		});
		btnGreet.setBounds(45, 196, 117, 29);
		contentPane.add(btnGreet);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearAll();
			}
		});
		btnReset.setBounds(174, 196, 117, 29);
		contentPane.add(btnReset);
		
		
		msgLabel.setForeground(Color.BLUE);
		msgLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		msgLabel.setBounds(35, 271, 378, 40);
		contentPane.add(msgLabel);
		
		
		error1lbl.setForeground(Color.RED);
		error1lbl.setFont(new Font("Lucida Grande", Font.ITALIC, 14));
		error1lbl.setBounds(101, 103, 287, 16);
		contentPane.add(error1lbl);
		
		
		error2lbl.setForeground(Color.RED);
		error2lbl.setFont(new Font("Lucida Grande", Font.ITALIC, 14));
		error2lbl.setBounds(101, 168, 287, 16);
		contentPane.add(error2lbl);
	}
}
