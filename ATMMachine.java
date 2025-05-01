import java.util.Scanner;
  class ATM{
    float Balance;
    int pin=7588;
 
    public void checkPin(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the pin:");
        int epin=sc.nextInt();
        
            if(epin==pin){
            menu();
        }
        else{
        System.out.println("WRONG PIN!");
    checkPin();
}
}
    public void menu(){
        System.out.println("Enter the choise:");
        System.out.println("1. CHECK Account Balance.");
        System.out.println("2.Withdraw money.");
        System.out.println("3.Deposit Money.");
        System.out.println("4.Exit!");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        if(c==1){
            checkBalance();
        }
        else if(c==2){
            withdraw();
        }
        else if(c==3){
            deposit();
        }
        else if(c==4){
            return;
        }
        else
        System.out.println("Invalid choise.!");
    }
    public void checkBalance(){
        System.out.println("Current Balance: "+Balance);
        menu();
    }
    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ammount to withdraw:");
        float amt=sc.nextFloat();
        if(Balance>=amt){
            System.out.println(amt+" withdrawn succesfully.");
            Balance=Balance-amt;
        }
        else
        System.out.println(("Insufficent Balance"));
        menu();
    }
    public void deposit(){
        System.out.println("Enter the deposit amount:");
        Scanner sc=new Scanner(System.in);
        int amt1=sc.nextInt();
        Balance=Balance+amt1;
        System.out.println(amt1+" sucessfully deposited.");
        menu();
    }
 }
public class ATMMachine {
    public static void main(String[] args){
        ATM a=new ATM();
        a.checkPin();
    }
    
}
