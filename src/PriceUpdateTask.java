package com.portfolioproject.concurrent;

public class PriceUpdateTask implements Runnable 
{

    private String stockSymbol;
    public PriceUpdateTask(String stockSymbol)
    {
        this.stockSymbol = stockSymbol;
    }
@Override
    public void run() 
    {
        System.out.println("Updating price for " + stockSymbol +
                " - Thread: " +Thread.currentThread().getName());

        System.out.println("Price updated for " + stockSymbol +
                " - Thread: " +Thread.currentThread().getName());
    }
}