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
public class PayTest {
    public static void main(String[] args){
        CashPayment pay1 = new CashPayment();
        CashPayment pay2 = new CashPayment();
        CreditCardPayment pay3 = new CreditCardPayment("Nidhin", 2022, 123456789);
        CreditCardPayment pay4 = new CreditCardPayment("Manoj", 2018, 987654321);
        pay1.setPayment(200);
        pay2.setPayment(800000);
        pay3.setPayment(39500);
        pay4.setPayment(1200);
        pay1.PaymentDetails();
        pay2.PaymentDetails();
        pay3.PaymentDetails();
        pay4.PaymentDetails();
    }
}
