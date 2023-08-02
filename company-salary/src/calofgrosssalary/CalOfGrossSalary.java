package calofgrosssalary;
import java.util.*;

public class CalOfGrossSalary{
    public static void main(String[] args) {
        float bs, gs, da, hra;
        Scanner scn;

        scn = new Scanner(System.in);
        bs = scn.nextFloat();

        if (bs < 1500)
        {
            hra = bs * 10 / 100;
            da = bs * 90/100;
        }
        else
        {
            hra = 1200;
            da = bs * 98 / 100;
        }

        gs = bs + hra + da;

        System.out.println("Gross Salary = Rs."+gs);

    }
}