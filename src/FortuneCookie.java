import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	JFrame frame;
	JButton button;

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	int rand = 0;

	public void showButton() {
		frame = new JFrame();
		button = new JButton();
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);
		rand = new Random().nextInt(5);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Shame on you for thinking a cookie is psychic");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You need a mint. Like, bad.");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Error 404: Fortune not found.");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null,
					"Pigeon poop burns the retina for 13 hours. You will learn this the hard way.");
		}
		if (rand == 5) {
			JOptionPane.showMessageDialog(null, "This cookie fell on the ground.");
		}
	}
}
