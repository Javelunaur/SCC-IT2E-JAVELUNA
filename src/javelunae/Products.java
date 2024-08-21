package javelunae;

public class Products {
    String item;
    int pid;
    double pr, st, sol;
    
    public void addp(int id, String pn, double price, double sold, double stocks){
        this.pid=id;
        this.item=pn;
        this.pr=price;
        this.st=stocks;
        this.sol=sold;
        
    }
    
    public void viewp(){
        double profit = this.pr * this.sol;
        double tep = this.st * this.pr;
        String stat =(this.st > 0)? "Availale" : "Out-of-Stocks";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", this.pid, this.item, this.pr, this.st, this.sol, profit, tep, stat );
    }
}
