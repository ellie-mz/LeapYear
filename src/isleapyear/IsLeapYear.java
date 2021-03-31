/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isleapyear;

import java.util.Scanner;

/**
 *
 * @author Elaheh
 */
public class IsLeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        if ((year%4==0&&year%100!=0)||(year%400==0))
            System.out.println("it is a leap year");
        else
            System.out.println("not a leap year");
     
       
    }
    
}
