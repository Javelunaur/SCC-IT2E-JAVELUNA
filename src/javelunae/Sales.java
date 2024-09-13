
package javelunae;

import java.util.Scanner;

public class Sales {
    
       String nm, pr;
       float quan, price, cash;
        
       public void addSels(String nm, String pr, float quan, float price, float cash){
           this.nm = nm;
           this.pr = pr;
           this.quan = quan;
           this.price = price;
           this.cash = cash; 
       }
    
         public void viewSels(){
        Scanner n = new Scanner(System.in);
          
        float tot;
        tot = price * quan;
        
        System.out.print("-----------------------\n *** RECEIPT ***");
 
        System.out.println("\nName of the Customer: "+nm);
        System.out.println("\nItem Name: "+pr);
        System.out.printf("Quantity: %.0f",quan);
        System.out.println("\n-----------------------");
        System.out.printf("Total Due: %.2f",tot);
        System.out.printf("\nCash: %.2f",cash);
        System.out.println("\n-----------------------");
        System.out.printf("Change: %.2f\n", cash-tot);        
}
}
