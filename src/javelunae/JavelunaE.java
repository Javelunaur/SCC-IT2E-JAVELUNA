package javelunae;

import java.util.*;
public class JavelunaE {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        
        System.out.println("[1] Account\n[2] Grades\n[3] Products\n[4] Sales");
        
        System.out.print("\nEnter option: ");
        String opt = n.next();
        
        switch(opt){
            case "4":
                Sale sal = new Sale();
                sal.inputSalesniJOWABOL();
                break;
            case "3":
                Product pr = new Product();
                pr.inputProd();
                break;
            case "2":
                Grade gr = new Grade();
                gr.inputGr();
                break;
            case "1":
                Account acc = new Account();
                acc.inputAcc();
                break;             
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Sales sls = new Sales();
//        sls.getSales();
        
//        Grades gr = new Grades();
//        gr.addgr(1.0, 1.5, 1.3, 1.1, "VEN", 001);
//        gr.viewgr();
        
//        Products prod = new Products();
//        prod.addp(001, "OUH", 10, 5.0, 20.0);
//        prod.viewp();


    }
    
}
