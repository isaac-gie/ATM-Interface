
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
public class Withdraw {
    
    int amoutInTheAccount = 50000;
    
    public static int withdraw (int amoutInTheAccount){
        
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount you wish to withdraw: ");
        int withdrawCash = scanner.nextInt();
        int totalAmount = amoutInTheAccount - withdrawCash;
        System.out.println("Your account balance is: " + totalAmount);
                
        return totalAmount;
    }
    
    public static void main(String[] args) {
        withdraw(50000);
    }
}
