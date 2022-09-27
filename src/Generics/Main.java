package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       MyList<Customer> sehirler = new MyList<Customer>();
       Customer customer = new Customer();
       customer.id=12;
       customer.name= "ABDULLAH";
       sehirler.add(customer);
        customer.toString();



    }
}
