package com.company;

public class Customer {

    private int id;
    private String name;
    private double balance;

    static int count = 100;

    /*default constructor*/
    public Customer() {
        super();
    }

    public Customer(String name, double balance) {
        this.id = count++;
        this.name = name;
        this.balance = balance;
    }
// toString method
    @Override
    public String toString() {
        return "\nCustomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
