
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
public class Deposit {
    
    int amountInTheAccount = 50000;
    
    public static int deposit(int amountInTheAccount){
        /*int amountInTheAccount = 50000;*/
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount you wish to deposit: ");
        int amountDeposited = scanner.nextInt();
        int totalAmount = amountInTheAccount + amountDeposited;
        
        System.out.println("your account balance is " + totalAmount);
        
        return totalAmount;
    }
    
    public static void main(String[] args) {
        deposit(50000);
    }
}
