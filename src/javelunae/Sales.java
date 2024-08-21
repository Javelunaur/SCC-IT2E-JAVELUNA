
package javelunae;

import java.util.Scanner;

public class Sales {
         public void getSales(){
        Scanner n = new Scanner(System.in);
           
        String nm, pr;
        float quan, price, cash, tot;
        
        System.out.print("Enter Customer Name: ");
        nm=n.nextLine();
        System.out.print("Enter Product Name: ");
        pr=n.nextLine();
        System.out.print("Enter Quantity: ");
        quan = n.nextFloat();
        System.out.print("Enter Price: ");
        price = n.nextFloat();
        System.out.print("Enter Cash: ");
        cash = n.nextFloat();
        
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
