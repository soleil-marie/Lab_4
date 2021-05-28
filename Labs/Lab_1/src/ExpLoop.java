import java.lang.Math;
public class ExpLoop
{
    public static void main(String[] args)
    {
        int x = 5;
        int tries = 3;
           while (tries <= 3)
           {
               int y = (int)Math.pow(x,2);
               System.out.println("Number = " + y);
               x += 5;
               tries ++;

           }

    }
}
