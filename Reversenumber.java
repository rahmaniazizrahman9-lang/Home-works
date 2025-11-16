
package reversenumber;

import java.util.Scanner;
public class Reversenumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int reverse = 0;
        while ( number !=0) {
            reverse = reverse * 10 + number % 10;
            
        }
        System.out.println("Reversed Number = " + reverse);
        input.close();
    }
    
}
