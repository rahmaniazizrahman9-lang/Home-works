
package tast.boolan.operators;

import java.util.Scanner;

public class TastBoolanOperators {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number=input.nextInt();
        if(number%2==0&&number%3==0)
            System.out.println(number+" is divisible by 2 and 3");
        else if (number%2==0||number%3==0)
            System.out.println(number+" is divisible by 2 and 3");
        else if (number%2==0^number%3==0)
            System.out.println(number+" is divisibale by 2 or 3 but not by both");
        else
            System.out.println("this is an invalid input");
    }
    
}
