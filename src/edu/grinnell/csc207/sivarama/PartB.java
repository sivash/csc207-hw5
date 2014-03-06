package edu.grinnell.csc207.sivarama;

import java.util.Arrays;

public class PartB
{
  /**
   * Swap i1 and i2 within vals
   * 
   * @pre i1 and i2 must be between 0 and vals.length - 1.
   */
  public static void swap(int i1, int i2, String[] vals)
  {
    String temp = vals[i1];
    vals[i1] = vals[i2];
    vals[i2] = temp;
  }// swap(int, int,String[])

  /**
   * Rearrange vals so that red values precede white values and white values
   * precede blue values.
   * 
   * @post Exist P and Q, 0 <= P <= Q <= vals.length, s.t. For all i, 0 <= i <
   *       P, classifier.classify(vals[i]) < 0 For all i, P <= w < Q,
   *       classifier.classify(vals[i]) == 0 For all i, Q <= i < vals.length,
   *       classifier.classify(vals[i]) > 0 Values have neither been added to
   *       nor removed from vals; the new vals is a permutation of the original.
   */
  public static void dnf(String[] vals, StringClassifier classifier)
  {
    int len = vals.length;
    int r = 0;
    int w = 0;
    int b = len - 1;

    while (w <= b)
      {
        String str = vals[w];
        // str is unknown
        if (classifier.classify(str) < 0)
          {
            swap(r, w, vals);
            r++;
            w++;
          }// if str is red
        else if (classifier.classify(str) == 0)
          {
            w++;
          }// else if str is white
        else
          {
            swap(w, b, vals);
            b--;
          }// else str is blue
      }// while
  } // dnf(String[], StringClassifier)

  public static void main(String[] args)
    throws Exception
  {
    // TEST WITH SimpleStringSizeClassifier
    String[] strs =
        { "3ch", "5char", "6chars", "3ch", "6chars", "5char", "3ch" };
    System.out.println(Arrays.toString(strs));
    // swap(0, 3, strs);
    // System.out.println(Arrays.toString(strs));
    StringClassifier classify = new SimpleStringSizeClassifier();
    dnf(strs, classify);
    System.out.println(Arrays.toString(strs));
  }// main
}
