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

    Scanner console = new Scanner(System.in);
    ATM atm = new ATM();
    DataBase data = new DataBase();

    public String User() {
        String cardNum;

        System.out.println("------Welcome to IdBank ATM------");
        System.out.println("Please insert your bank card");

        cardNum = atm.setUser(console.next());
        System.out.println(data.firstName + " " + data.lastName);

        String cardNumber = data.cardNumber;
        if (cardNum.equals(cardNumber)) {
            System.out.println();
            System.out.println("------------------------");
            System.out.println();
            System.out.println("Please enter your password");
            return Password();
        } else {
            System.out.println();
            System.out.println("------------------------");
            System.out.println();
            System.out.println("Incorrect card number");
            return User();
        }
    }

    public String Password() {
        int password = 0;
        for (int i = 1; i < 3; i++) {
            password = atm.setPassword(console.nextInt());
            if (password == data.password) {
                System.out.println();
                System.out.println("------------------------");
                System.out.println();
                System.out.println("Plase choose from items: \n1. Balance check\n2. Withdrawal");
                break;
            } else {
                if (i <= 2) {
                    System.out.println();
                    System.out.println("------------------------");
                    System.out.println();
                    System.out.println("Incorrect password. Try again");
                    return String.valueOf(password);
                } else {
                    System.out.println();
                    System.out.println("------------------------");
                    System.out.println();
                    System.out.println("Ooops, your card is blocked");
                    break;
                }
            }
        }

        return Menu();
    }

    public String Balance() {
        String balance = data.balance + "$";
        String exit = "2";

        do {
            System.out.println();
            System.out.println("------------------------");
            System.out.println();
            System.out.println(balance);
            System.out.println();
            System.out.println("------------------------");
            System.out.println();
            System.out.println("1. Withdrawal\n2. Exit");
            String quite = console.next();
            if (quite.equals("1")) {
                return Withdrawal();
            } else {
                if (quite.equals(exit)) {
                    break;
                } else {
                    System.out.println();
                    System.out.println("------------------------");
                    System.out.println();
                    System.out.println("Invalid input");
                }
            }

        } while (true);
        return balance;
    }

    public String Withdrawal() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Please enter the withdrawal amount: ");
        int amount = console.nextInt();
        if (amount > 10) {
            if (amount <= data.balance) {
                data.balance -= amount;
                System.out.println();
                System.out.println("------------------------");
                System.out.println();
                System.out.println("Please take your banknote!");
                System.out.println("Your balance: " + data.balance + "$");
            } else {
                System.out.println();
                System.out.println("------------------------");
                System.out.println();
                System.out.println("Sorry, the balance is not enough!");
                return Withdrawal();
            }
        } else {
            System.out.println();
            System.out.println("------------------------");
            System.out.println();
            System.out.println("Impossible conclusion");
        }

        return Exit();
    }

    public String Menu() {
        String menu = console.next();

        if (Objects.equals(menu, "1")) {
            return Balance();
        } else {
            if (Objects.equals(menu, "2")) {
                return Withdrawal();
            } else {
                System.out.println();
                System.out.println("------------------------");
                System.out.println();
                System.out.println("Invalid input. Try again");
                return Menu();
            }
        }
    }

    public String Exit() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Thanks for your use!");
        return null;
    }

}
