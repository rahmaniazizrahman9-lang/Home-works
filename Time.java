/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author KABUL DARYA SOFT
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long totalMilliseconds=System.currentTimeMillis();
    long totalseconds=totalMilliseconds/1000;
    long currentseconds=totalseconds%60;
long totalminutes=totalseconds/60;
long currentminutes=totalminutes%60;
    long totalhoures=currentminutes/60;
    long currenthoures=totalhoures%24;
        System.out.println("current time is"+currenthoures+":"+currentminutes+":"+currentseconds+"GMT");
    
    }
    
}
