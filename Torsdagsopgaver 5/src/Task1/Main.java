
package Task1;

import java.util.ArrayList;

public class Main {
}
public class main{
    public static void main (String[] args){

        //her opretter vi en arraylist til at gemme customer objekter:
        ArrayList<Customer> customers = new ArrayList<>();


        //De oprettede kunder her
        Customer customer1 = new customer("Marcus", "Jonas", "Jonathan");
        Customer customer2 = new customer("David", "Sebastian", "Andreas");

        //her tilføjer vi kunderne til arraylisten
        customers.add(customer1);
        customers.add(customer2);

        //her udskriver vi alle kunder i arraylist ved hjælp af toString
        for (Customer customer : customers){
            System.out.println(customer);

        }

        //dette viser antallet af kunder:
        System.out.println("Total Customers: " + Customer.getCounter());

    }
}
