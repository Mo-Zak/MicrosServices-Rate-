package com.microtransaction.microtransaction.model;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



//@JsonIgnoreProperties(value = {"id", "date"})
@Entity
public class Operation {

    @Id
    @GeneratedValue
    private int id;
    private double amount;
    private double rate;
    private String currencySource;
    private String currencyDestination;
    private String date;

    public Operation() {
    }

    public Operation(int id, double amount, double rate, String currencySource, String currencyDestination, String date) {
        this.id = id;
        this.amount = amount;
        this.rate = rate;
        this.currencySource = currencySource;
        this.currencyDestination = currencyDestination;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCurrencySource() {
        return currencySource;
    }

    public void setCurrencySource(String currencySource) {
        this.currencySource = currencySource;
    }

    public String getCurrencyDestination() {
        return currencyDestination;
    }

    public void setCurrencyDestination(String currencyDestination) {
        this.currencyDestination = currencyDestination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", amount=" + amount +
                ", rate=" + rate +
                ", currencySource='" + currencySource + '\'' +
                ", currencyDestination='" + currencyDestination + '\'' +
                ", date=" + date +
                '}';
    }
}
