package vd;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
    Clip clip ;
    URL url[] = new URL[10];
    
    public Music() {
    	url[0] = getClass().getResource("nhacnen.wav");
    	url[1] = getClass().getResource("key.wav");
    	url[2] = getClass().getResource("unlock.wav");
    	url[3] = getClass().getResource("win.wav");
    }
    
    public void stop() {
    	clip.stop();
    }
    
    public void loop() {
    	clip.loop(clip.LOOP_CONTINUOUSLY);
    }
    
    
    public void play() {
    	clip.start();
    }
    
    
    
    public void setFile(int i) {
    	try {
			AudioInputStream audio = AudioSystem.getAudioInputStream(url[i]);
			clip = AudioSystem.getClip();
			clip.open(audio);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
