import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag=0,n,i;
        n = sc.nextInt();
        if(n==0||n==1)
            System.out.println("Not a Prime number");
        else{
            for(i=2;i<=n/2;i++){
                if(n%i==0)
                {
                    System.out.println("Not a Prime Number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
            System.out.println("Prime number");
    }
}
