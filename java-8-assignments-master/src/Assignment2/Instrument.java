/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author NI389899
 */
public class Instrument implements Piano,Guitar{
    public void play(){
        Piano.super.play();
        Guitar.super.play();
    }
    
    public static void main(String[] args){
        Instrument inst = new Instrument();
        inst.play();
        Piano piano = new Instrument();
        piano.play();
    }
}
