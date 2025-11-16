
package lottary.game;

import java.util.Scanner;

public class LottaryGame {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int lottary=(int)(Math.random()*100);
        System.out.println("Enter you are lottary pick ");
        int guess=input.nextInt();
        int lottarydigit1=lottary/10;
        int lottarydigit2=lottary%10;
        int guessdigit1=guess/10;
        int guessdigit2=guess%10;
        System.out.println("the lottary number is "+lottary);
        if (guess==lottary)
            System.out.println("exact match:you won $10000");
        else if (guessdigit2==lottarydigit1&&guessdigit1==lottarydigit2)
            System.out.println("match all digits:you won $3000");
        else if (guessdigit1==lottarydigit1||guessdigit1==lottarydigit2||guessdigit2==lottarydigit1||guessdigit1==lottarydigit2)
            System.out.println("match one digit :you won $1000");
        else
            System.out.println("no match sorry");
    }
    
}
