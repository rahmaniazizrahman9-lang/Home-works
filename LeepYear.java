
package leep.year;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Entre a year");
    int year=input.nextInt();
boolean isleapyear=
        (year % 4 ==0 && year%100!=0)||(year%400==0);
        System.out.println(year+"is a leap year?"+isleapyear);
    
    }
    
}
