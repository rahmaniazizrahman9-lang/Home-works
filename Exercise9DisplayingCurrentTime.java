
package exercise9.displaying.current.time;


public class Exercise9DisplayingCurrentTime {

    
    public static void main(String[] args) {
    long totalMilliseconds=System.currentTimeMillis();
    long totalseconds=totalMilliseconds/1000;
    long currentseconds=totalseconds%60;
long totalminutes=totalseconds/60;
long currentminutes=totalminutes%60;
    long totalhoures=currentminutes/60;
    long currenthoures=totalhoures%24;
        System.out.println("current time is"+currenthoures+":"+currentminutes+":"+currentseconds+"GMT"+"4+30");
    
    }
    
}
