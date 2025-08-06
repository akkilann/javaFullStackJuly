package com.application.abstractdemo;

public class Customer {
    public static void main(String[] args) {

        /*
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
        */

        Bank bank = new BranchOne();
        //calling all the method in Bank class...Bank ref with branchone object...
        bank.eduLoan();
        bank.housingLoan();
        bank.carLoan();
        bank.adminDetails();

        //call the own method of BranchONe

        BranchOne branchOne = (BranchOne) bank;
        branchOne.payDetails();

        SubBranch branch = new SubBranch();
        branch.housingLoan();
        branch.housingLoan();
        branch.carLoan();
        branch.adminDetails();
        branch.depositType();
        branch.loanType();

        BranchTwo branchTwo = new SubBranch();
        branchTwo.loanType();
        branchTwo.adminDetails();

        //call own method of subbranch
        //super classref =  sub class object
        SubBranch sub = (SubBranch)branchTwo; // points to new SubBranch
        sub.depositType(); //comes from SubBranch
        sub.loanType(); //comes from Branch2
        sub.adminDetails(); //comes from Bank





    }
}
