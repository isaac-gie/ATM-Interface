
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */

public class Atm {
    
    public static void switchClass(){
        SignIn.signIn();
        
    Scanner scanner = new Scanner(System.in);
    int switchActivity = scanner.nextInt();
    
        switch (switchActivity){
            case 1:
                CheckBalance.balance();
                break;
            case 2:
                Deposit.deposit(50000);
                break;
            
        }
            
    }
    
    public static void main(String[] args) {
        switchClass();
    }
    
}
