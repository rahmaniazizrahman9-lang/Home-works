
package salestax;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class SalesTax {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter purchase amount");
        double purchaseAmount=input.nextDouble();
        double tax= purchaseAmount*0.06;
        System.out.println("Sales tax is $"+ (int)(tax*100/100.0));
    
                
    }
    
}
