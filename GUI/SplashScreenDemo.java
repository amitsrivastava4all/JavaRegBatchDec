import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class SplashScreenDemo extends JWindow {
	String text = "My App - 2016                            ";
	JLabel lblTitle = new JLabel(text);
	private JPanel contentPane;
	JProgressBar progressBar = new JProgressBar();
	private int progressValue = 1;
	private Timer timer ;
	int x = 148;
	private boolean right= false;
	
	private void doSplashAnimation(){
		timer = new Timer(60,new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(progressValue<=10000){
				progressBar.setValue(progressValue);
				progressValue++;
				lblTitle.setBounds(x, 301, 199, 41);
				if(x<SplashScreenDemo.this.getWidth()-5 && !right ){
					x++;
				}
				else
				if(x>=SplashScreenDemo.this.getWidth()-5 && !right)	
				{
					//right = true;
					x = 0;
					//x = 1-lblTitle.getText().length();
				}
//				else
//				if(x>=1 && right ){
//					x--;
//				}
//				else
//				if(x==1 && right){
//					right = false;
//				}
				
				}
				else{
					timer.stop();
					SplashScreenDemo.this.setVisible(false);
					SplashScreenDemo.this.dispose();
					GreetApplication app = new GreetApplication();
					app.setVisible(true);
				}
			}
		});
		timer.start();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					SplashScreenDemo frame = new SplashScreenDemo();
					frame.setVisible(true);
					frame.doSplashAnimation();
	}

	/**
	 * Create the frame.
	 */
	public SplashScreenDemo() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 510);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bglbl = new JLabel("");
		Icon icon = new ImageIcon(SplashScreenDemo.class.getResource("bg.gif"));
		bglbl.setIcon(icon);
		bglbl.setBounds(37, 32, 411, 226);
		contentPane.add(bglbl);
		
		
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblTitle.setBounds(6, 301, 467, 41);
		contentPane.add(lblTitle);
		progressBar.setPreferredSize(new Dimension(146, 51));
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		progressBar.setStringPainted(true);
		
		progressBar.setBackground(Color.WHITE);
		progressBar.setForeground(Color.YELLOW);
		
		progressBar.setBounds(25, 423, 435, 41);
		contentPane.add(progressBar);
		
	}
}
