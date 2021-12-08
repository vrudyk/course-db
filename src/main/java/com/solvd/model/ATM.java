package com.solvd.model;

public class ATM {

    private int idATM;
    private int Amount_of_money;
    private int Bank_idBank;

    public void setIdATM(int idATM) {
        this.idATM = idATM;
    }

    public void setAmount_of_money(int amount_of_money) {
        Amount_of_money = amount_of_money;
    }

    public void setBank_idBank(int bank_idBank) {
        Bank_idBank = bank_idBank;
    }

    public int getIdATM() {
        return idATM;
    }

    public int getAmount_of_money() {
        return Amount_of_money;
    }

    public int getBank_idBank() {
        return Bank_idBank;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "idATM=" + idATM +
                ", Amount_of_money=" + Amount_of_money +
                ", Bank_idBank=" + Bank_idBank +
                '}';
    }
}
