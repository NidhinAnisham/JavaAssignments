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
public interface Piano {
    default void play(){ 
        System.out.println("Piano is playing"); 
    } 
}
