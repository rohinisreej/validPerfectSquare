import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int  n=scanner.nextInt();
        int t=0;
        for(int i=1;i<=n;i++)
        {
            if(i*i==n) {
                System.out.println(true);
                t=1;
                break;
            }
        }
        if(t!=1)
        {
            System.out.println(false);
        }

    }
}