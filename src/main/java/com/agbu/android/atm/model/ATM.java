package com.agbu.android.atm.model;

public class ATM {

    private String user;
    private int password;
    private boolean isFlag;
    private String menu;
    private int balance;
    private int withdrawal;

    public String getUser() {
        return user;
    }

    public String setUser(String user) {
        this.user = user;
        return user;
    }

    public int getPassword() {
        return password;
    }

    public int setPassword(int password) {
        this.password = password;
        return password;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(int withdrawal) {
        this.withdrawal = withdrawal;
    }
}
