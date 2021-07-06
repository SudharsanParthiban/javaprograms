import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,t,fact=1;
        n = sc.nextInt();
        t = n;
        while(t>0){
            fact = fact*t;
            t--;
        }
        System.out.println(fact);
    }
}