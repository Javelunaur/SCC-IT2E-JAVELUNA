package javelunae;

public class Grades {
    double p, m, pf, f;
    String sn;
    int id; 
    
    public void addgr(double sp, double sm, double spf, double sf, String stud, int sid){
        this.p=sp;
        this.m=sm;
        this.pf=spf;
        this.f=sf;
        this.sn=stud;
        this.id=sid;
    }
    
    public void viewgr(){
        double ave = (this.p + this.m + this.pf + this.f)/4;
        String rem = (ave > 3.0)? "Failed" : "Passed";
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",this.id, this.sn, this.p, this.m, this.pf, this.f, ave, rem);
    }
}
