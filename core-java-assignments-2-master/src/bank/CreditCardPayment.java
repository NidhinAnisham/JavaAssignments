/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Date;

/**
 *
 * @author NI389899
 */
public class CreditCardPayment extends Payment{
    String nameOnCard;
    int expiryDate;
    long cardNumber;

    public CreditCardPayment(String nameOnCard, int expiryDate, long cardNumber) {
        this.nameOnCard = nameOnCard;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void PaymentDetails(){
        System.out.println("Card Payment");
        System.out.println("Name: "+nameOnCard);
        System.out.println("Expiry Date: "+expiryDate);
        System.out.println("Card Number: "+cardNumber);
        super.PaymentDetails();
    }
}
