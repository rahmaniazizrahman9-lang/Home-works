
package body.mass.index;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println(" Enter Weight in pounds");
        double weight=input.nextDouble();
        System.out.println("Enter Hight in inches");
        double hight=input.nextDouble();
        final double KILOGRAMS_PER_POUND=0.45359237;
        final double METERS_PER_INCH=0.0254;
        double weightinkilograms=weight*KILOGRAMS_PER_POUND;
        double hightinMeters=hight*METERS_PER_INCH;
        double BMI=weightinkilograms/(hightinMeters*hightinMeters);
        System.out.println("bmi is"+BMI);
        if (BMI<18.5)
            System.out.println("under weight");
        else if (BMI<25)
            System.out.println("Normal");
        else if (BMI<30)
            System.out.println("Over weight");
        else System.out.println("obese");
    }
    
}
