package com.portfolioproject.model;

public class Asset {
	private String assetid;
	private String assetname;
	private String price;
	public Asset(String assetid, String assetname, String price) 
	{
		this.assetid=assetid;
		this.assetname=assetname;
		this.price=price;
	}
	public String getAssetid() {
		return assetid;
	}
	public void setAssetid(String assetid) {
		this.assetid = assetid;
	}
	public String getAssetname() {
		return assetname;
	}
	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Asset ID:" + assetid);
		System.out.println("Asset Name:" + assetname);
		System.out.println("Asset Price:" + price);
		
	}
}