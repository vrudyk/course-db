package com.solvd.model;

import java.util.GregorianCalendar;

public class Bank_card {

  private int Client_idClient;
  private int Bank_idBank;
  private int Card_number;
  private GregorianCalendar Expiration_date;
  private int CVV;

    public void setClient_idClient(int client_idClient) {
        Client_idClient = client_idClient;
    }

    public void setBank_idBank(int bank_idBank) {
        Bank_idBank = bank_idBank;
    }

    public void setCard_number(int card_number) {
        Card_number = card_number;
    }

    public void setExpiration_date(GregorianCalendar expiration_date) {
        Expiration_date = expiration_date;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public int getClient_idClient() {
        return Client_idClient;
    }

    public int getBank_idBank() {
        return Bank_idBank;
    }

    public int getCard_number() {
        return Card_number;
    }

    public GregorianCalendar getExpiration_date() {
        return Expiration_date;
    }

    public int getCVV() {
        return CVV;
    }

    @Override
    public String toString() {
        return "Bank_card{" +
                "Client_idClient=" + Client_idClient +
                ", Bank_idBank=" + Bank_idBank +
                ", Card_number=" + Card_number +
                ", Expiration_date='" + Expiration_date + '\'' +
                ", CVV=" + CVV +
                '}';
    }
}
