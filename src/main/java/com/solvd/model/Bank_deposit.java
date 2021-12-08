package com.solvd.model;

import java.util.GregorianCalendar;

public class Bank_deposit {

   private int idBank_deposit;
   private double Percent;
   private double Deposit_amount;
   private double Deposit_amount_with_percent;
   private GregorianCalendar Deposit_start_date;
   private GregorianCalendar End_date_of_the_deposit;
   private int Bank_idBank;
   private int Client_idClient;

    public void setIdBank_deposit(int idBank_deposit) {
        this.idBank_deposit = idBank_deposit;
    }

    public void setPercent(double percent) {
        Percent = percent;
    }

    public void setDeposit_amount(double deposit_amount) {
        Deposit_amount = deposit_amount;
    }

    public void setDeposit_amount_with_percent(double deposit_amount_with_percent) {
        Deposit_amount_with_percent = deposit_amount_with_percent;
    }

    public void setDeposit_start_date(GregorianCalendar deposit_start_date) {
        Deposit_start_date = deposit_start_date;
    }

    public void setEnd_date_of_the_deposit(GregorianCalendar end_date_of_the_deposit) {
        End_date_of_the_deposit = end_date_of_the_deposit;
    }

    public void setBank_idBank(int bank_idBank) {
        Bank_idBank = bank_idBank;
    }

    public void setClient_idClient(int client_idClient) {
        Client_idClient = client_idClient;
    }

    public int getIdBank_deposit() {
        return idBank_deposit;
    }

    public double getPercent() {
        return Percent;
    }

    public double getDeposit_amount() {
        return Deposit_amount;
    }

    public double getDeposit_amount_with_percent() {
        return Deposit_amount_with_percent;
    }

    public GregorianCalendar getDeposit_start_date() {
        return Deposit_start_date;
    }

    public GregorianCalendar getEnd_date_of_the_deposit() {
        return End_date_of_the_deposit;
    }

    public int getBank_idBank() {
        return Bank_idBank;
    }

    public int getClient_idClient() {
        return Client_idClient;
    }

    @Override
    public String toString() {
        return "Bank_deposit{" +
                "idBank_deposit=" + idBank_deposit +
                ", Percent=" + Percent +
                ", Deposit_amount=" + Deposit_amount +
                ", Deposit_amount_with_percent=" + Deposit_amount_with_percent +
                ", Deposit_start_date='" + Deposit_start_date + '\'' +
                ", End_date_of_the_deposit='" + End_date_of_the_deposit + '\'' +
                ", Bank_idBank=" + Bank_idBank +
                ", Client_idClient=" + Client_idClient +
                '}';
    }
}
