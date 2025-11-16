
package ending.loop.with.a.sentinal.value;
import java.util.Scanner;
public class EndingLoopWithASentinalValue {

    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter an integer(the input ends if it is 0");
        int date=input.nextInt();
        int sum=0;
        while(date!=0){
            sum+=date;
            System.out.println("Enter an integer(the input ends if it is 0");
        }System.out.println(" the sum is"+sum);
    }
    
}
