/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author NI389899
 */
public class CashPayment extends Payment{

    @Override
    public void PaymentDetails() {
        System.out.println("Payment is made through cash");
        super.PaymentDetails(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
