import java.util.*;;
public class Toh {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk "+n+ " from " +src+ " to " +dest );
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);     // first step is to make helper as a dest and dest as a helper
        System.out.println("transfer disk "+n+ " from " +src+ " to " +dest );
        // in first step we are shifting n-1 desks to helper thats why we changed helper to dest or vice versa
        // after shifting n-1 disks to helper now we want to transfer remaining one desk in src to dest and thats why
        // we are making src as helper and helper as src
        towerOfHanoi(n-1, helper, src, dest);    // this is second step to make src as a helper and helper as a src
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of disks: ");
        int n = sc.nextInt();
        
        towerOfHanoi(n, "S", "H", "D");
        sc.close();
    }
}
