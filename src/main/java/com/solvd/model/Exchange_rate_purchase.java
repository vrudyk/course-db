package com.solvd.model;

import java.util.GregorianCalendar;

public class Exchange_rate_purchase {

    private GregorianCalendar Time;
    private double USD;
    private double EUR;
    private double RUB;
    private double PLN;
    private int Bank_idBank;

    public GregorianCalendar getTime() {
        return Time;
    }

    public double getUSD() {
        return USD;
    }

    public double getEUR() {
        return EUR;
    }

    public double getRUB() {
        return RUB;
    }

    public double getPLN() {
        return PLN;
    }

    public int getBank_idBank() {
        return Bank_idBank;
    }

    public void setTime(GregorianCalendar time) {
        Time = time;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public void setRUB(double RUB) {
        this.RUB = RUB;
    }

    public void setPLN(double PLN) {
        this.PLN = PLN;
    }

    public void setBank_idBank(int bank_idBank) {
        Bank_idBank = bank_idBank;
    }

    @Override
    public String toString() {
        return "Exchange_rate_purchase{" +
                "Time=" + Time +
                ", USD=" + USD +
                ", EUR=" + EUR +
                ", RUB=" + RUB +
                ", PLN=" + PLN +
                ", Bank_idBank=" + Bank_idBank +
                '}';
    }
}
