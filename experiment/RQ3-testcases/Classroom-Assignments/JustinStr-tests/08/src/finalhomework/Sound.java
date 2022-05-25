package finalhomework;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import javax.swing.JApplet;

public class Sound extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int on;

	public Sound(int soundInt) {
		on = soundInt;
	}

	public void playLose() {

		if (on == 0) {
			URL url = Sound.class.getClassLoader().getResource(
					"sourses/lose.wav");
			AudioClip lose = Applet.newAudioClip(url);
			lose.play();
		}

	}

	public void playWin() {
		if (on == 0) {
			URL url = Sound.class.getClassLoader().getResource(
					"sourses/win.wav");
			AudioClip win = Applet.newAudioClip(url);
			win.play();
		}

	}

	public void playStone() {
		if (on == 0) {
			URL url = Sound.class.getClassLoader().getResource(
					"sourses/stone.wav");
			AudioClip stone = Applet.newAudioClip(url);
			stone.play();
		}
	}

}
