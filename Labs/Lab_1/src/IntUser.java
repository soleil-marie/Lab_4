import java.util.Scanner;
public class IntUser
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first int:");
        int int1 = sc.nextInt();
        System.out.println("enter second int:");
        int int2 = sc.nextInt();
        int sum = int1 + int2;
        sc.close(); // why do we close scanner?
        System.out.println("Sum: " + sum);
    }
}
