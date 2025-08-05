package com.application.abstractdemo;

public class Customer {
    public static void main(String[] args) {
        Bank bank = new BranchOne();
        //calling all the method in Bank class...Bank ref with branchone object...
        bank.carLoan();
        bank.eduLoan();
        bank.housingLoan();
        bank.adminDetails();

        //Object referenc of branchOne and calling non-overridden method
        BranchOne branchOne =(BranchOne) bank;
        branchOne.payDetails();

        bank = new SubBranch();
        bank.carLoan();
        bank.eduLoan();
        bank.eduLoan();
        bank.adminDetails();

        //can't call depositType --> typeCast and call
        SubBranch subBranch = (SubBranch) bank;
        subBranch.depositType();
        subBranch.loanType();
        subBranch.adminDetails();




    }
}
