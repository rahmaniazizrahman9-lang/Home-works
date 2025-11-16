
package lottery.usingstrings;
import java.util.Scanner;
public class LotteryUsingStrings {

    public static void main(String[] args) {
   Scanner input=new Scanner (System.in);
   String lottery=""+(int)(Math.random()*10)+(int)(Math.random()*10);
        System.out.println("Enter your lottary pick two digits");
        String guess=input.nextLine();
        char lotterydigit1=lottery.charAt(0);
        char lotterydigit2=lottery.charAt(0);
        char guessdigit1=lottery.charAt(0);
        char guessdigit2=lottery.charAt(1);
        if (guess.equals(lottery))
            System.out.println("Exact match:you won $10000");
        else if (guessdigit2==lotterydigit1&&guessdigit1==lotterydigit2)
            System.out.println("Match all digits:you won $3000");
        else if (guessdigit1==lotterydigit1||guessdigit1==lotterydigit2||guessdigit2==lotterydigit1||guessdigit2==lotterydigit2)
            System.out.println("Match one digit:you won $1000");
        else
            System.out.println("Soory no Match");
        
        
    }
    
}
