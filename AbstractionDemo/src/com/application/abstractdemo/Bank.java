package com.application.abstractdemo;

public abstract class Bank {
     abstract void carLoan();
    abstract void housingLoan();
    abstract void eduLoan();

    final void adminDetails(){
        System.out.println("Admin details".isBlank());
    }

}
