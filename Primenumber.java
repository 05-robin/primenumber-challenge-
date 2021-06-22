
package primenumber;

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }    
        }
        if(count==1)
            {
                System.out.println(n+" is a Prime number");
            }
            else
            {
                System.out.println(n+" is not a Prime number");
            }
    }
    
}
