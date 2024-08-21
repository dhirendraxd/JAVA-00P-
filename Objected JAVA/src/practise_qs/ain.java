abstract class Payment {
    abstract void processPayment(double amount);

    public void printReceipt() {
        System.out.println("Payment processed. Thank you!");
    }
}

interface SecurePayment {
    boolean validatePayment();
}

class CreditCardPayment extends Payment implements SecurePayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Validating credit card payment");
        return true;
    }
}

class PayPalPayment extends Payment implements SecurePayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Validating PayPal payment");
        return true;
    }
}

public class  ain{
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        if (creditCardPayment instanceof SecurePayment) {
            SecurePayment secureCreditCardPayment = (SecurePayment) creditCardPayment;
            if (secureCreditCardPayment.validatePayment()) {
                creditCardPayment.processPayment(150.0);
                creditCardPayment.printReceipt();
            }
        }

        Payment payPalPayment = new PayPalPayment();
        if (payPalPayment instanceof SecurePayment) {
            SecurePayment securePayPalPayment = (SecurePayment) payPalPayment;
            if (securePayPalPayment.validatePayment()) {
                payPalPayment.processPayment(150.0);
                payPalPayment.printReceipt();
            }
        }
    }
}
