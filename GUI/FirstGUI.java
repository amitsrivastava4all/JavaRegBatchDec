import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FirstGUI extends JFrame implements ActionListener {
	final int WIDTH = 300;
	final int HEIGHT = 300;
	
	public void actionPerformed(ActionEvent e){
		String commandName = e.getActionCommand();
		if(commandName.equalsIgnoreCase("okey")){
		JOptionPane.showConfirmDialog(this, "U Click on OK","BMPL App",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon(FirstGUI.class.getResource("icon.png")));
		}
		else
			if(commandName.equalsIgnoreCase("cancel")){
				JOptionPane.showConfirmDialog(this, "U Click on Cancel");
			}
		}
	
	public FirstGUI(){
		JButton okButton = new JButton("Okey");
//		ActionListener l = new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e){
//				JOptionPane.showConfirmDialog(FirstGUI.this, "U Click on OK","BMPL App",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon(FirstGUI.class.getResource("icon.png")));
//				//JOptionPane.showMessageDialog(FirstGUI.this, "U Click on OK");
//			}
//		};
		//okButton.addActionListener(l);
		okButton.addActionListener(this);
		okButton.setBounds(10, 10, 70, 50);
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		cancelButton.setBounds(90, 10, 70, 50);
		JButton hi = new JButton("Hi");
		hi.addActionListener(this);
		hi.setBounds(10, 70, 70, 50);
		
		JButton hello = new JButton("Hello");
		hello.setBounds(90, 70, 70, 50);
		this.setLayout(null);
		//this.setLayout(new GridLayout(2,2));
		this.getContentPane().add(okButton);
		this.getContentPane().add(cancelButton);
		this.getContentPane().add(hi);
		this.getContentPane().add(hello);
		this.setSize(WIDTH, HEIGHT);
		this.setTitle("This is My First Frame...");
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);
		
	}
//	public void paint(Graphics g){
//		g.setColor(Color.RED);
//		g.setFont(new Font("Arial",Font.BOLD,20));
//		g.drawString("Hello", 100, 100);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstGUI obj = new FirstGUI();
		
		

	}

}
