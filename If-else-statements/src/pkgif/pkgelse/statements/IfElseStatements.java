
package pkgif.pkgelse.statements;

import java.util.Scanner;



/**
 *
 * Name: Luis Victores
 * Period: 2
 * Project Name: If-else Statements
 * 
 * 
 */
public class IfElseStatements {

    private static Scanner kb = new Scanner(System.in);
    
    
    
    public static void main(String[] args) { 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();                
    }
    
    
    public static void question1(){
        System.out.print("1. You current grade is: ");
        int grade = kb.nextInt();
        if( grade < 71 )
            System.out.println("You are failing");
        else
            System.out.println("You are passing");
    }
    
    public static void question2(){
        System.out.print("2. Give me a number: ");
        int number = kb.nextInt();
        if( number <= 50 )
            System.out.println("GO");
        else
            System.out.println("STOP");
    }
    
    public static void question3(){
        System.out.print("3. Give me a number: ");
        int number = kb.nextInt();
        if( number % 2 == 0 )
            System.out.println("Your number is even");
        else
            System.out.println("Your number is odd");
    }
    
    public static void question4(){
        System.out.print("4. Give me a number again: ");
        int number = kb.nextInt();
        if( number % 5 == 0 )
            System.out.println("This number is a multiple of five");
        else
            System.out.println("This number is not a multiple of five");
    }
    
    public static void question5(){
        System.out.print("5. Give me yet again another number: ");
        int number = kb.nextInt();
        if( number < 10 )
            System.out.println("ONE DIGIT");
        else if( number >= 100)
            System.out.println("THREE DIGITS");
        else
            System.out.println("TWO DIGITS");
    }
    
    public static void question6(){
        System.out.print("6. Give me a jersey number: ");
        int jersey = kb.nextInt();
        if( jersey == 12 || jersey == 71 || jersey == 80)
            System.out.println("That number is retired from the Seattle Seahawks!");
    }
    
    public static void question7(){
        System.out.print("7. Give me the name of a state: ");
        String state = kb.next();
        if( state.equals("Washington") || state.equals("Idaho") || state.equals("Oregon"))
            System.out.println("This state is in the PNW");
        else
            System.out.println("You should move to the PNW; it's great here");
    }
    
    public static void question8(){
        System.out.print("8. Would you like a SHORT, TALL, GRANDE, or VENTI?: ");
        String size = kb.next();
        if( size.equals("SHORT"))
            System.out.println("8 oz");
        else if( size.equals("TALL"))
            System.out.println("12 oz");
        else if( size.equals("GRANDE"))
            System.out.println("16 oz");
        else if( size.equals("VENTI"))
            System.out.println("20 oz");
        else
            System.out.println("That is not what a correct answer");
    }
    
    public static void question9(){
        System.out.print("9. What is your pay rate in dollars per hour?: ");
        double rate = kb.nextDouble();
        System.out.println(" ");
        System.out.print("And how long did you work?: ");
        double hours = kb.nextDouble();
        double extraTime = 0;
        if( hours > 40 )
        {
            extraTime = hours - 40;
            hours = 40;
        }
        double pay = (hours * rate) + (extraTime * (1.5 * rate));
        System.out.println("You got payed $" + pay);
    }
    
    public static void question10(){
        System.out.print("10. What is your pay rate in dollars per hour?: ");
        double rate = kb.nextDouble();
        System.out.println(" ");
        System.out.print("And how long did you work?: ");
        double hours = kb.nextDouble();
        double extraTime = 0;
        if( hours > 40 )
        {
            extraTime = hours - 40;
            hours = 40;
        }
        double pay = (hours * rate) + (extraTime * (1.5 * rate));
        if( extraTime > 20)
            System.out.println("Please see manager");
        else
            System.out.println("You got payed $" + pay);
    }
    
}
