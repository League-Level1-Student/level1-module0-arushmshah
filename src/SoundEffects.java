import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects {
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
public static void main(String[] args) {
SoundEffects se = new SoundEffects();
se.playSound("airplane-landing_daniel_simion.wav");
}
void GUI() {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	f.setVisible(true);
	p.setVisible(true);
	f.add(p);
}
}
