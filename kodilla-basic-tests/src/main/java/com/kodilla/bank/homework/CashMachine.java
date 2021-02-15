package com.kodilla.bank.homework;

public class CashMachine {


    private int[] transactions;
    private int transactionsCounter;
    private int balance;

    private int maxWithdrawAmount = -300;
    private int maxPayInAmount = 1000;


    public CashMachine(int openingBalance) {
        this.balance = openingBalance;
        this.transactions = new int[0];
        this.transactionsCounter = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    //dodanie transakcji
    //warunki: wielokrotnosc 10, inne od 0, ><

    public boolean transaction(int amount) {
        if (amount < this.maxWithdrawAmount || amount > this.maxPayInAmount || amount == 0 || amount % 10 != 0)
            return false;
        else if (amount < 0)
            if (this.balance < Math.abs(amount))
                return false;

        this.transactionsCounter++;
        int[] _tmpTransactions = new int[this.transactionsCounter];
        System.arraycopy(transactions, 0, _tmpTransactions, 0, transactions.length);
        _tmpTransactions[this.transactionsCounter - 1] = amount;
        this.transactions = _tmpTransactions;
        this.balance += amount;

        return true;
    }

    public int[] getTransactions() {
        return this.transactions;
    }

    public int getNumberOfPayInTransactions() {
        int counter = 0;
        for (int t : transactions) {
            if (t > 0) {
                counter++;
            }
        }
        return counter;
    }

    public int getNumberOfWithdrawTransactions() {
        int counter = 0;
        for (int t : transactions) {
            if (t < 0) {
                counter++;
            }
        }
        return counter;
    }

    public double getAveragePayInValue() {
        double payInSum = 0;
        int count = 0;
        for (int t : transactions) {
            if (t > 0) {
                payInSum += t;
                count++;
            }
        }
        return payInSum / count;
    }

    public double getAverageWithdrawValue() {
        if (this.transactions.length == 0)
            return 0;
        double withdrawSum = 0;
        int count = 0;
        for (int t : transactions) {
            if (t < 0) {
                withdrawSum += Math.abs(t);
                count++;
            }
        }
        return withdrawSum / count;
    }


    public int getSumOfAllWithdraws() {
        int sum = 0;
        for (int t : this.transactions) {
            if (t < 0) {
                sum += Math.abs(t);
            }
        }
        return sum;
    }

    public int getSumOfAllPayIn() {
        int sum = 0;
        for (int t : this.transactions) {
            if (t > 0) {
                sum += Math.abs(t);
            }
        }
        return sum;
    }
}