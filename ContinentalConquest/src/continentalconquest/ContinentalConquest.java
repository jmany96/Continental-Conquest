/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continentalconquest;


import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.applet.Main;

/**
 *
 * @author x13332576
 */
public class ContinentalConquest {

     public static Clip clip;
    public static Mixer mixer;
    
    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) throws MalformedURLException {
        // TODO code application logic here
            
                                   try
                {
                  Thread.sleep(2500);  
                }
                
                catch(Exception e)
                {  
                    
                }   
   
        StartGUI GUI = new StartGUI();
        GUI.setVisible(true);
        
       
     
        /* tutorial https://www.youtube.com/watch?v=nUKya2DvYSo   */
         Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
         mixer = AudioSystem.getMixer(mixInfos[0]);
        
        DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
        try{
            clip = (Clip)mixer.getLine(dataInfo);
        }
        catch(LineUnavailableException l){
            l.printStackTrace();
        
        }
        
        try{
            URL soundURL = Main.class.getResource("/continentalconquest/boom.wav"); /* https://soundcloud.com/wxflurry/camelot */
            AudioInputStream audioStrim = AudioSystem.getAudioInputStream(soundURL);
            clip.open(audioStrim);
        }
        catch(LineUnavailableException l){
            l.printStackTrace();
        }
        catch(UnsupportedAudioFileException e ){
            e.printStackTrace();
        }
        catch (IOException i){
            i.printStackTrace();
        }
        clip.start();
        do{
            //System.out.println(clip.isActive());
            try{
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                Thread.sleep(50);
               
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }while(clip.isActive());
        
        
    }

    //my methods
    public void stop() {
        clip.stop();
    }
    
    public void start(){
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public boolean isPlaying(){
        return clip.isActive();
    }

    private void setCursor(Cursor cursor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
