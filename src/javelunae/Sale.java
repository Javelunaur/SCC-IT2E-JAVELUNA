
package javelunae;
import java.util.Scanner;

public class Sale {
    public void inputSalesniJOWABOL(){
    Scanner n = new Scanner (System.in);
    Sales s = new Sales();
        
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
        
        s.addSels(nm, pr, quan, price, cash);
        s.viewSels();           
    }
   
    
    
    
}
