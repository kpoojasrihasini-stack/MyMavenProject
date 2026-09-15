package com.portfolioproject.model;

public class Stock 
            {
			private String stockid;
			private String stockname;
			private double Price;
			public Stock(String stockid, String stockname, double Price)
			{
				this.stockid=stockid;
				this.stockname=stockname;
				this.Price=Price;
			}

			public String getStockid() {
				return stockid;
			}

			public void setStockid(String stockid) {
				this.stockid = stockid;
			}

			public String getStockname() {
				return stockname;
			}

			public void setStockname(String stockname) {
				this.stockname = stockname;
			}

			public double getPrice() {
				return Price;
			}

			public void setPrice(double price) {
				this.Price = price;
			}
			public void display() {
				System.out.println("Stock ID:" + stockid);
				System.out.println("Stock Name:" + stockname);
				System.out.println(" Price:" + Price);
			}
		}
	


