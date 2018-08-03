package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Customer> customerList = new ArrayList <>();

        loadData(customerList);
        display();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("---------------------------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    addCust(customerList);
                    break;
                case 2:
                    System.out.println(customerList);
                    break;
                case 3:
                    displayByid(customerList);
                    break;
                case 4:
                    deposit(customerList);
                    break;
                case 5:
                    withdraw(customerList);
                    break;
                case 6:
                    balanceTransfer(customerList);
                    break;
                default:
                    System.out.println("Invalid Entry");
                    break;
            }

        }while(choice < 7);

    }

    // method to add new customer
    public static void addCust(List<Customer> custList ){
        System.out.println("Enter New Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter New Balance: ");
        double balance = sc.nextDouble();

        Customer customer = new Customer(name, balance);
        custList.add(customer);

        System.out.println("Successfully to Add: " + name);


    }
        // method to display All Customer
    public static void displayByid(List<Customer> customerList){

         Scanner sc = new Scanner(System.in);
        System.out.print("Enter id to display customer: ");
        int id = sc.nextInt();

        for(Customer cust : customerList){

            if(cust.getId() == id){
                System.out.println("Your id: " + cust.getId());
                System.out.println("You name: " + cust.getName());
                System.out.println("Balance : "+ cust.getBalance());

            }
        }
    }

    // method to deposit balance
    public static void deposit(List<Customer> c){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id to Deposit: ");
        int id = sc.nextInt();

        for (Customer depo : c){

            if(depo.getId() == id){

                System.out.println("Enter the Amount to Deposit: ");
                double amount = sc.nextDouble();
                 depo.setBalance(amount  + depo.getBalance());
                System.out.println("Successfully added: " + amount);
                System.out.println("Your total Balance: " + depo.getBalance());
            }
        }
    }

    // method to withdraw balance
    public static void withdraw(List<Customer> w){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id to Withdraw: ");
        int id = sc.nextInt();

        for(Customer withd : w){

            if(withd.getId() == id) {
                System.out.println("Enter the Amount to Withdraw: ");
                double amount = sc.nextDouble();
                withd.setBalance(withd.getBalance() - amount);
                System.out.println("Successfully withdraw: " + amount);
                System.out.println("Your Total Balance: " + withd.getBalance());
            }
        }

    }

     // method to transfer balance
    public static void balanceTransfer(List<Customer> bt){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id to transfer balance for: ");
        int id = sc.nextInt();

        for(Customer send : bt)
            if(send.getId() == id){
                System.out.println("Enter the reciver id: ");
                int recid = sc.nextInt();

                for(Customer receiver : bt){
                    if(receiver.getId() == recid){
                        System.out.println("Enter the Amount to Transfer: ");
                        double amount = sc.nextDouble();
                        send.setBalance(send.getBalance() - amount);
                        receiver.setBalance(receiver.getBalance() + amount);

                        System.out.println("Transferd: " + amount + " To " + receiver.getName() );
                        System.out.println("Your Total Balance is: " + send.getBalance());

                    }

                }
            }

           }

    // method where data has been load
    public static void loadData(List<Customer> cust ){

        Customer customer = new Customer("Ujwal", 5000);
        Customer customer1 = new Customer("Pratik", 8000);
        Customer customer2 = new Customer("Diwakar", 5000);

        cust.add(customer);
        cust.add(customer1);
        cust.add(customer2);
    }

    // display option
    public static void display(){
        System.out.println("Enter 1 For Adding New Customer \nEnter 2 For displaying All Customer \n" +
                "Enter 3 for Display Customer by id \nEnter 4  for Deposit Money \nEnter 5 for withdraw money \n" +
                "Enter 6 for balance Transfer \nEnter 7 to Exit." );


    }
}
