package ATM;

import java.util.ArrayList;

public class Accounts{
    private String userName;        //To store username
    private String userPass;        //To store userpassword
    private ArrayList<Transaction> Transactions=new ArrayList<>();    //To store admin and user transactions

    public ArrayList<Transaction> getTransactions() {       //To get transactions in transaction arraylist

        return Transactions;

    }

    public Accounts(String userName, String userPass){      // Constructor to initialize values

        this.userName=userName;     //Sets username
        this.userPass=userPass;     //Sets userpassword

    }
    public String getUserName(){    //To get username

        return userName;

    }
    public String getUserPass(){     //To get userpassword

        return userPass;

    }

    public void setUserPass(String userPass) {

        this.userPass = userPass;

    }
}