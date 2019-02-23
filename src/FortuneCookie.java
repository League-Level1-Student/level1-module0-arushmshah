import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	
	JFrame frame;
	JButton button;
public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
	fc.showButton(); 
	}

public void showButton() {frame=new JFrame(); button =new JButton();
    System.out.println("Button clicked");
frame.setVisible(true);
frame.add(button);
button.addActionListener(this);
int rand = new Random().nextInt(5);
if(rand==1) {
	
}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
}
}
