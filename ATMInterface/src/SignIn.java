import java.util.HashMap;
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
public class SignIn {
    
        public static void activity(){
        
        String activity = "1. Check balance"
                      + "\n2. Deposit "
                      + "\n3. Withdraw  "
                      + "\n4. Transfer  "
                      + "\n5. Transaction history"
                      + "\n6. Quit";
        
            System.out.println(activity);
    }

    public static void signIn() {
        
        Scanner scanner = new Scanner (System.in);
        
        for (i = 0;)
            System.out.print("Card Number: ");
        int enteredNo = scanner.nextInt();
        
            System.out.print("Pin number: ");
        int enteredPin = scanner.nextInt();
        
        int cardNo = 9804;
        int pinNo = 9804;
        
        if (enteredNo != cardNo || enteredPin != pinNo)
            System.out.println("The details do not match");
        else
            activity();         
    }
        
    public static void main(String[] args) {
        signIn();
        /*activity();*/
        
    }
}
