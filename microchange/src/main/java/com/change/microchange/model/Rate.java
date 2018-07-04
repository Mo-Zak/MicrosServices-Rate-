package com.change.microchange.model;
// com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.*;


//@JsonIgnoreProperties(value = {"id", "date"})
@Entity
public class Rate {

    @Id
    @GeneratedValue
    private int id;
    private double rate;
    private String currencySource;
    private String currencyDestination;
    private String date;

    public Rate() {
    }

    public Rate(int id, double rate, String currencySource, String currencyDestination, String date) {
        this.id = id;
        this.rate = rate;
        this.currencySource = currencySource;
        this.currencyDestination = currencyDestination;
        this.date = date;
    }

    public double getId() {
        return id;
    }

    public double getRate() {
        return rate;
    }

    public String getCurrencySource() {
        return currencySource;
    }

    public String getCurrencyDestination() {
        return currencyDestination;
    }

    public String getDate() {
        return date;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setCurrencySource(String currencySource) {
        this.currencySource = currencySource;
    }

    public void setCurrencyDestination(String currencyDestination) {
        this.currencyDestination = currencyDestination;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id=" + id +
                ", rate=" + rate +
                ", currencySource='" + currencySource + '\'' +
                ", currencyDestination='" + currencyDestination + '\'' +
                ", date=" + date +
                '}';
    }
}
