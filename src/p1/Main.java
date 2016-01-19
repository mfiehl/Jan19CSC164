package p1;

public class Main
{

    public static void main(String[] args)
    {
        //final = const
        final int NUM_OF_MONTHS = 12;
	    double [] monthlySales = new double[NUM_OF_MONTHS];

        monthlySales[0] = 1590.75;
        monthlySales[1] = 7890.15;
        monthlySales[2] = 6090.15;

        for (double each : monthlySales)
        {
            if (each != 0)
            {
                System.out.println(each);
            }//end if

        }//end for each

    }
}
