package com.example.prhotelbooking;


import java.util.ArrayList;
import java.util.List;

public class CustomerRepo {
    //SINGLETON PATTERN
    private static  CustomerRepo instance = null;
    private List<Customer> customers = new ArrayList<>();

    private CustomerRepo() //constructor
    {
        customers.add(new Customer("Lilu","Odedra","Liluodedra13@gmail.com","LLL","Female",R.drawable.person));
        customers.add(new Customer("Krishna","Naik","Krishnanaik@gmail.com","kkk","Female",R.drawable.person2));

    }


    public static CustomerRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new CustomerRepo();
        }
        return instance;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return this.customers;
    }

}
