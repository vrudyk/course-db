package com.solvd.model;

public class Bank_loan {

   private int idBank_loan;
   private double Percent;
   private double Loan_amount;
   private double Loan_amount_with_percent;
   private String Loan_start_date;
   private String End_date_of_the_loan;
   private String Currency;
   private int Bank_idBank;
   private int Client_idClient;

   public void setIdBank_loan(int idBank_loan) {
      this.idBank_loan = idBank_loan;
   }

   public void setPercent(double percent) {
      Percent = percent;
   }

   public void setLoan_amount(double loan_amount) {
      Loan_amount = loan_amount;
   }

   public void setLoan_amount_with_percent(double loan_amount_with_percent) {
      Loan_amount_with_percent = loan_amount_with_percent;
   }

   public void setLoan_start_date(String loan_start_date) {
      Loan_start_date = loan_start_date;
   }

   public void setEnd_date_of_the_loan(String end_date_of_the_loan) {
      End_date_of_the_loan = end_date_of_the_loan;
   }

   public void setCurrency(String currency) {
      Currency = currency;
   }

   public void setBank_idBank(int bank_idBank) {
      Bank_idBank = bank_idBank;
   }

   public void setClient_idClient(int client_idClient) {
      Client_idClient = client_idClient;
   }

   public int getIdBank_loan() {
      return idBank_loan;
   }

   public double getPercent() {
      return Percent;
   }

   public double getLoan_amount() {
      return Loan_amount;
   }

   public double getLoan_amount_with_percent() {
      return Loan_amount_with_percent;
   }

   public String getLoan_start_date() {
      return Loan_start_date;
   }

   public String getEnd_date_of_the_loan() {
      return End_date_of_the_loan;
   }

   public String getCurrency() {
      return Currency;
   }

   public int getBank_idBank() {
      return Bank_idBank;
   }

   public int getClient_idClient() {
      return Client_idClient;
   }

   @Override
   public String toString() {
      return "Bank_loan{" +
              "idBank_loan=" + idBank_loan +
              ", Percent=" + Percent +
              ", Loan_amount=" + Loan_amount +
              ", Loan_amount_with_percent=" + Loan_amount_with_percent +
              ", Loan_start_date='" + Loan_start_date + '\'' +
              ", End_date_of_the_loan='" + End_date_of_the_loan + '\'' +
              ", Currency='" + Currency + '\'' +
              ", Bank_idBank=" + Bank_idBank +
              ", Client_idClient=" + Client_idClient +
              '}';
   }
}
