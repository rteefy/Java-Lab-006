//Raymond Teefy 10/5/2023
import java.util.Scanner;
public class Lab006 {


    int n;
    int m;

    /**
     *m and n will be given values when the scanner detects user input for each.
     * @param m is what we are dividing
     * @param n by
     */
    public Lab006(int m, int n) {
        this.m = m;
        this.n = n;
    }

    /**
     * the method
     * @return a true/false statement, true if there is no remainder
     */
    public boolean isDivisible (){
        return m % n == 0;
    }
public static void main (String[] args){
/*
asks user
 */
    System.out.println("enter first int");
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    System.out.println("enter second int");
    int n = s.nextInt();
    Lab006 l = new Lab006(m,n);
    boolean x = l.isDivisible();
    System.out.println(x);
}

}
