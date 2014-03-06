package edu.grinnell.csc207.sivarama;

public class BinarySearch
{
  /**
   * Search for val in values, return the index of an instance of val.
   * 
   * @param val
   *          An integer we're searching for
   * @param values
   *          A sorted array of integers
   * @result index, an integer
   * @throws Exception
   *           If there is no i s.t. values[i] == val
   * @pre values is sorted in increasing order. That is, values[i] < values[i+1]
   *      for all reasonable i.
   * @post values[index] == val
   *       returns -1 if i is not in vals.
   */
  public static int binarySearch(int i, int[] vals)
    throws Exception
  {
    int lb = 0;
    int ub = vals.length - 1;
    int index = -1;
    while (lb <= ub)
      {
        int mid = (ub + lb) / 2;
        if (vals[mid] == i)
          {
            index = mid;
            break;
          }// if
        else if (vals[mid] < i)
          lb = mid + 1;
        else
          ub = mid - 1;
      }// while
    return index;
  } // binarySearch

  public static void main(String[] args)
    throws Exception
  {
    // int[] vals = new int[] { 3 };
    // System.out.println(binarySearch(4, vals));
  }// main

}// class BinarySearch
