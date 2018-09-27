/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

/**
 *
 * @author NI389899
 */
public class Jazz implements Song{
    
    String songName;
    int duration;
    
    @Override
    public void Play() {
        System.out.println("\nName: "+songName);
        int min=duration/60;
        int sec=duration%60;
        System.out.println("Duration: "+min+":"+sec);
    }

    @Override
    public int Duration() {
        return this.duration;
    }
    
    /**
     * @param songName the songName to set
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
