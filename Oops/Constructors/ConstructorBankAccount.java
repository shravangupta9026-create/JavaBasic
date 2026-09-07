package Constructors;

// Perimetrize constructor

public class ConstructorBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Shravan Gupta" , "Indian Bank", "Sahjanwa",78997);
        System.out.println(b1.name);
        System.out.println(b1.bankname);
        System.out.println(b1.branch);
        System.out.println(b1.account);
    }
    
}

class BankAccount {
    String name;
    String bankname;
    String branch;
    int account;
    

    BankAccount(){
}

// Parametrized constructor
BankAccount(String n, String bn, String br,int  acc){
    name = n;
    bankname = bn;
    branch = br;
    account = acc;
}
}



