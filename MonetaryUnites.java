
package monetary.unites;

import java.util.Scanner;

public class MonetaryUnites {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in double");
        double amount=input.nextDouble();
        int raminingamount=(int)(amount*100);
        int numberofdoolars=raminingamount/100;
        raminingamount=raminingamount%100;
        int numberofquarters=raminingamount/25;
        raminingamount=raminingamount%25;
        int numberofdimes=raminingamount/10;
        raminingamount=raminingamount%10;
        int numberofnickels=raminingamount/5;
        raminingamount=raminingamount%5;
        int numberofpennies=raminingamount;
        System.out.println("Your amount"+amount+"consists of");
        System.out.println(" "+numberofdoolars+"dollers");
        System.out.println(" "+numberofquarters+"quarters");
        System.out.println(" "+numberofdimes+"dimes");
        System.out.println(" "+numberofnickels+"nickels");
        System.out.println(" "+numberofpennies+"pennies");
    }
    
}
