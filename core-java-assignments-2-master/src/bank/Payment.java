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
public class Payment {
    private double payment;

    /**
     * @return the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }
    
    public void PaymentDetails(){
            System.out.println("Payment: "+this.payment);
            System.out.println();
    }
}
