package wuziqi.gui;

import java.applet.*;
import java.net.URL;

import javax.swing.JApplet;

public class music extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 269724431570202394L;

	private boolean on;

	public void seton() {
		on = true;
	}

	public void setoff() {
		on = false;
	}

	public void playmusic() {
		URL musicurl = music.class.getClassLoader().getResource(
				"music/music.wav");
		AudioClip musicClip = JApplet.newAudioClip(musicurl);
		musicClip.loop();

	}

}
