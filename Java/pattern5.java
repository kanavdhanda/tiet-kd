import java.util.Scanner;
class pattern5
{
    public static void main(String args[])
    {
        int sp,n,c,r;
        Scanner jj=new Scanner(System.in);
        n=jj.nextInt();
        for(r=1;r<=n;r++)
        {
            for(sp=n;sp>=r;sp--)
            {
                System.out.print(" ");
            }
            for(c=n;c<=r;c++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
                

/*
 * 
 */