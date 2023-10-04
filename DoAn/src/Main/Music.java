package Main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
    Clip clip ;
    URL url [] = new URL[20];
    
    
    public Music() {
    	url[0]= getClass().getResource("nhacnen.wav");
    	url[1]= getClass().getResource("key.wav");
    	url[2]= getClass().getResource("unlock.wav");
    	url[3]= getClass().getResource("boot.wav");
    	url[4]= getClass().getResource("win.wav");
    	url[5]= getClass().getResource("gameover.wav");
    	url[6]= getClass().getResource("burning.wav");
    	url[7]= getClass().getResource("flag.wav");
    	url[8]= getClass().getResource("destroy.wav");
    	
    	
    }
    
    
    // dat ten
    public void setFile(int i) {
    	try {
			AudioInputStream audio = AudioSystem.getAudioInputStream(url[i]);
			clip= AudioSystem.getClip();
			clip.open(audio);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
    
    // phat 
    public void play() {
    	clip.start();
    }
    
    public void stop() {
    	clip.stop();
    }
    
    // lap lien tuc
    public void loop() {
    	 clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
}
