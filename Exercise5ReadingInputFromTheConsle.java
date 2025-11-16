
package exercise5.reading.input.from.the.consle;

import java.util.Scanner;

public class Exercise5ReadingInputFromTheConsle {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter a numer for radius;");
    double radius=input.nextDouble();
    
        double Area =radius*radius*3.14159;
        System.out.println("The area for the circle of radius "+radius+"is"+Area);
    }
    
}
