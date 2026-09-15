package com.porfolioproject.app;

import com.portfolioproject.model.Stock;

//import com.portfolioproject.model.Stock;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("=====================================");
        System.out.println("Stock Portfolio Management Project");
        System.out.println("=====================================");
        
        
        System.out.println("Enter stockid");
        String stockid=sc.nextLine();
        
        System.out.println("Enter stock Name");
        String name=sc.nextLine();
        
        System.out.println("Enter price");
        double price=sc.nextDouble();
        //Creating the object
        Stock user=new Stock(stockid,name,price);
        user.display();
        
    }
}
	
    
