package com.example.exchangerates.entity;

import jakarta.persistence.*;

@Entity
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shortName;
    private String validFrom;
    private String name;
    private String country;

    private double move;
    private int amount;

    private double valBuy;
    private double valSell;
    private double valMid;

    private double currBuy;
    private double currSell;
    private double currMid;

    private int version;

    private double cnbMid;
    private double ecbMid;

    public ExchangeRate() {
    }

    public Long getId() {
        return id;
    }

    public String getShortName() {
        return shortName;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getMove() {
        return move;
    }

    public int getAmount() {
        return amount;
    }

    public double getValBuy() {
        return valBuy;
    }

    public double getValSell() {
        return valSell;
    }

    public double getValMid() {
        return valMid;
    }

    public double getCurrBuy() {
        return currBuy;
    }

    public double getCurrSell() {
        return currSell;
    }

    public double getCurrMid() {
        return currMid;
    }

    public int getVersion() {
        return version;
    }

    public double getCnbMid() {
        return cnbMid;
    }

    public double getEcbMid() {
        return ecbMid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMove(double move) {
        this.move = move;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setValBuy(double valBuy) {
        this.valBuy = valBuy;
    }

    public void setValSell(double valSell) {
        this.valSell = valSell;
    }

    public void setValMid(double valMid) {
        this.valMid = valMid;
    }

    public void setCurrBuy(double currBuy) {
        this.currBuy = currBuy;
    }

    public void setCurrSell(double currSell) {
        this.currSell = currSell;
    }

    public void setCurrMid(double currMid) {
        this.currMid = currMid;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setCnbMid(double cnbMid) {
        this.cnbMid = cnbMid;
    }

    public void setEcbMid(double ecbMid) {
        this.ecbMid = ecbMid;
    }
}