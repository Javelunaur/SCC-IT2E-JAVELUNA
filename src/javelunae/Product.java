
package javelunae;

import java.util.Scanner;

public class Product {
    public void inputProd(){
       Products[] pr = new Products[100];
       Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of Products: ");
        int np= sc.nextInt();
        
        for (int i = 0;i < np; i++){
            System.out.println("Enter details of product "+(i+1));
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String name= in.next();
            System.out.print("Price: ");
            double price = in.nextDouble();
            System.out.print("Stocks: ");
            int stocks = in.nextInt();
            System.out.print("Sold: ");
            int sold = in.nextInt();
            
            pr[i] = new Products();
            pr[i].addp(id, name, price, stocks, sold);        
            
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-20s %-10s\n","ID","Name","Price"," Stocks"
        ,"Sold","Profit","Estimated Profit","Status");
        
        double tpg = 0;
        for(int i = 0; i < np; i++){
        tpg = tpg + (pr[i].pr * pr[i].sol);
        pr[i].viewp();
    }
       System.out.printf("\nTotal Gross Profit: "+tpg);
      
    }
}
