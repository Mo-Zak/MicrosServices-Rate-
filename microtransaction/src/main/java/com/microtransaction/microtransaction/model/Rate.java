package com.microtransaction.microtransaction.model;



public class Rate {

    private int id;
    private double rate;
    private String currencySource;
    private String currencyDestination;
    private String date;


    public int getId() {
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

    public void setId(int id) {
        this.id = id;
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

    public void setDate(String date) {
        this.date = date;
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
