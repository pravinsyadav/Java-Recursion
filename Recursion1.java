import java.util.*;

public class Recursion1 {
    public static void printNumb(int n){   
        if(n==0)         // base case condition
        return;
        System.out.println(n);         // print number
        printNumb(n-1);                 // here fucntion calling itself
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumb(n);
        sc.close();
    }
}