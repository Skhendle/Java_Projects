/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class Main{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    public Main(){
        this.dateCreated = new Date();
    }
    
    public Main(int id, double balance, double annualInterestRate){
        this.dateCreated = new Date();
        this.setId(id);
        this.setBalance(balance);
        this.setAnnualInterestRate(annualInterestRate);
    }
    
    // Setter functions
    private void setId(int id){
        this.id = id;
    }
    private void setBalance(double bal){
        this.balance = bal;
    }
    private void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    
    // Getter functions
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDate(){
        return this.dateCreated;
    }    

    //Deposit method
    public void Deposit(double amount){
        if(amount > 0){
            this.setBalance(this.balance + amount);    
        }
    }
    
    //Withdraw method 
    public void Withdraw(double amount){
        if(amount <= this.getBalance() ){
            this.setBalance(this.balance - amount);
        }
    }
    
    
    
    
	public static void main(String[] args) {
	    Main obj = new Main(183,500.00,5.2);
	    System.out.println( sdf.format(obj.getDate()) );
	    System.out.println(obj.getBalance());
	    
	    //the balance is expected to be 300
	    obj.Withdraw(200);
	    System.out.println(obj.getBalance());
	    
	    //the balance is expected to remain the same
	    obj.Withdraw(500);
	    System.out.println(obj.getBalance());
	    
	    //the balance is expected to remain the same
	    obj.Deposit(250);
	    System.out.println(obj.getBalance());
	    System.out.println( sdf.format(obj.getDate()) );
	  
	}
}
