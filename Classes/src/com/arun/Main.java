package com.arun;

public class Main {

    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        Car hello = new Car();
//
//        porsche.setModel("Carrera");
//        hello.setModel("HelloWorld");
//        holden.setModel("CoMModore");
//        System.out.println("Model is " + porsche.getModel());
//        System.out.println("Model is " + hello.getModel());
//        System.out.println("Model is " + holden.getModel());


//
//        BankAccount arunsAccount = new BankAccount("12345", 0.00, "Arun K", "arunksa111@gmail.com", "(807) 245 1234");
//
//        BankAccount arunsAccount = new BankAccount();
//        System.out.println(arunsAccount.getNumber());
//        System.out.println(arunsAccount.getAccountBalance());
//
//        arunsAccount.withdrawal(100.0);
//
//
//        arunsAccount.deposit(200.0);
//        arunsAccount.withdrawal(100.0);
        //arunsAccount.getAccountBalance();



        BankAccount ambiliAccount = new BankAccount("Ambili", "ambili@gmail.com", "(824) 245 1234");
        System.out.println(ambiliAccount.getNumber());
        System.out.println("Current balance is " + ambiliAccount.getAccountBalance());

        ambiliAccount.withdrawal(100.55);

    //    BankAccount helloAccount = new BankAccount()


//
//        VipCustomer arun1 = new VipCustomer("arun", 1450, "arunksa111@yahoo.com");
//        System.out.println(arun1.getEmail());
//
//
//        VipCustomer arun2 = new VipCustomer();
//        System.out.println(arun2.getEmail());
//
//        VipCustomer arun3 = new VipCustomer("rajeev", 1250);
//        System.out.println(arun3.getEmail());
    }
}
