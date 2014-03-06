package edu.grinnell.csc207.sivarama;

/**
 * Compute x^n.
 * 
 * @pre n >= 1.
 * @post returns x^n
 */
public class Expt
{
  public static double expt(double x, int n)
  {
    double result = 1.0;
    if (n == 1)
      {
        result = x;
      }// if
    else
      {
        while (n != 0)
          // Invariant: Dividing by 2 and Subtracting will eventually
          // make n zero which shows that the exp is done
          {
            // x ^ 2k = x^k * x^k
            if ((n % 2) == 0)
              {
                x = x * x;
                n = n / 2;
              }// if
            // x ^ (k+1) = x * x^k
            else
              {
                result = result * x;
                n = n - 1;
              }// else
          }// while
      }// else
    return result;
  }// expt(double, int)

  public static void main(String[] args)
    throws Exception
  {
    System.out.println(expt(2.0, 1));
    System.out.println(expt(2.0, 4));
  }// main
}// class Expt

