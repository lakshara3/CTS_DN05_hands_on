interface Payment {

    void pay();

}


class OldPayment {

    void makePayment() {

        System.out.println("Payment Done");

    }

}



class PaymentAdapter implements Payment {

    OldPayment oldPayment = new OldPayment();


    public void pay() {

        oldPayment.makePayment();

    }

}



public class Adapter {


    public static void main(String[] args) {


        Payment payment = new PaymentAdapter();


        payment.pay();


    }

}