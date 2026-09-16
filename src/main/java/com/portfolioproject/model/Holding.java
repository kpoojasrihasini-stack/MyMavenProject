package com.portfolioproject.model;

public class Holding {

    private String holdingId;

    private Asset asset;

    private int quantity;

    // Constructor
    public Holding(String holdingId,
                   Asset asset,
                   int quantity) {

        this.holdingId = holdingId;
        this.asset = asset;
        this.quantity = quantity;
    }

    // Getters

    public String getHoldingId() {
        return holdingId;
    }

    public Asset getAsset() {
        return asset;
    }

    public int getQuantity() {
        return quantity;
    }

    // Calculate total current value
    public double getCurrentValue() {

        return asset.calculateCurrentValue() * quantity;
    }

    @Override
    public String toString() {

        return "Holding{" +
                "Holding ID='" + holdingId + '\'' +
                ", Asset=" + asset +
                ", Quantity=" + quantity +
                ", Current Value=" + getCurrentValue() +
                '}';
    }
}