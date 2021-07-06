import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,t,digit,rev=0;
        n = sc.nextInt();
        t = n;
        while(t>0){
            digit = t%10;
            rev = rev*10+digit;
            t = t/10;
        }
        if(rev == n)
            System.out.println("Number is pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}