/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee2;

/**
 *
 * @author NI389899
 */
public class SalOverflow extends Exception {

    /**
     *
     */
    public static String msg;

    public SalOverflow() {
        msg = "Invalid percentage";
    }
    
}
