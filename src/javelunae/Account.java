
package javelunae;

import java.util.*;


public class Account {
         Scanner in = new Scanner(System.in);
    Accounts[] acc = new Accounts[100];
    
    int n;
    String id, fname, lname, email, password, user;
    
    public void inputAcc(){
        
        System.out.print("Enter number of accounts: ");
        n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("\nEnter details of user "+(i+1)+":\n");
            System.out.print("ID: ");
            id = in.next();
            
            while(validateID(id)){
                id = in.next();
            }
            
            while(duplicateID(id, n)){
                id = in.next();
            }
            
            System.out.print("First name: ");
            fname = in.next();
            System.out.print("Last name: ");
            lname = in.next();
            System.out.print("Email: ");
            email = in.next();
            System.out.print("Username: ");
            user = in.next();
            System.out.print("Password: ");
            password = in.next();
            
            acc[i] = new Accounts();
            acc[i].processAccounts(id, fname, lname, email, user, password);
        }
        
        System.out.printf("\n\n%-5s %-10s %-10s %-20s %-10s %-10s\n","ID", "First Name", "Last Name", "Email", "Username", "Password");
         
        for(int i = 0; i < n; i++){
            acc[i].viewAccounts();
        }
    }
    
    public boolean validateID(String getID){
        for(char c : getID.toCharArray()){
            if(!Character.isDigit(c)){
                System.out.print("Input invalid: Must not have a letter or a special Character,try again: ");
                return true;
            }
        }
        return false;
    }
    
    public boolean duplicateID(String getID, int max){
        for(int i = 0; i < max; i++){
            if(acc[i] != null && getID.equals(acc[i].id)){
                System.out.print("Input invalid: Must not have a duplicated ID, try again: ");
                return true;
            }
        }
        return false;
    }
}
