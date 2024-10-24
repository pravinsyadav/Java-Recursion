import java.util.*;

public class Recursion2 {
    public static void printSum(int i,int n,int sum){
        if(i==n){              //base condition
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);     //recursion 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            
        printSum(1, 5, 0);           //sum of first 5 numbers is 15
        sc.close();
    }
}