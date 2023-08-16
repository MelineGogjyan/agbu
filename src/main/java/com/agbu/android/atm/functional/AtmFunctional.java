package com.agbu.android.atm.functional;

import java.util.Objects;
import java.util.Scanner;

import com.agbu.android.atm.data.DataBase;
import com.agbu.android.atm.model.ATM;

public class AtmFunctional extends ATM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ATM atm = new ATM();
        DataBase data = new DataBase();

        System.out.println("------Welcome to IdBank ATM------");
        System.out.println("Please insert your bank card");

        String cardNum = atm.setUser(console.next());
        System.out.println(cardNum);
//        if (data.cardNumber == cardNum) {
//            System.out.println("Please enter your password");
//        } else {
//            System.out.println("Incorrect card number");
//        }
    }

    public String createData() {
        Scanner console = new Scanner(System.in);
        ATM atm = new ATM();

        String user = atm.setUser(console.next());

        return user;
    }

    Scanner console = new Scanner(System.in);
    ATM atm = new ATM();
    DataBase data = new DataBase();

    public String User() {
        String cardNum;

        System.out.println("------Welcome to IdBank ATM------");
        System.out.println("Please insert your bank card");

        cardNum = atm.setUser(console.next());
        System.out.println(cardNum);

        String cardNumber = data.cardNumber;
        if (cardNum.equals(cardNumber)) {
            System.out.println("Please enter your password");
        } else {
            System.out.println("Incorrect card number");
            return User();
        }
        return cardNumber;
    }

    public String Password() {
        int password = 0;
        for (int i = 1; i < 3; i++) {
            password = atm.setPassword(console.nextInt());
            if (password == data.password) {
                System.out.println("Plase choose from items: \n1. Balance check\n2. Withdrawal");
                break;
            } else {
                if (i <= 2) {
                    System.out.println("Incorrect password. Try again");
                    return String.valueOf(password);
                } else {
                    System.out.println("Ooops, your card is blocked");
                    break;
                }
            }
        }

        return Menu();
    }

    public String Balance() {
        String balance = data.balance + "$";

        System.out.println(balance);
        return balance;
    }

    public String Withdrawal() {
        
        return null;
    }

    public String Menu() {
        String menu = console.next();

        if (Objects.equals(menu, "1")) {
            return Balance();
        } else {
            if (Objects.equals(menu, "2")) {
                return Withdrawal();
            } else {
                System.out.println("Invalid input. Try again");
                return Menu();
            }
        }
    }

}
