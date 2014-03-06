package edu.grinnell.csc207.sivarama;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest
{

  @Test
  public void testbinarySearch()
    throws Exception
  {
    for (int i = 1; i < 32; i++)
      {
        int[] nums = new int[i];
        for (int j = 0; j <= i - 1; j++)
          {
            nums[j] = 2 * j;
          }// for
        // System.out.println(Arrays.toString(nums));
        for (int k = 0; k <= i - 1; k++)
          {
            // Make sure that value 2*k is in position k
            assertEquals(k, BinarySearch.binarySearch(2 * k, nums));
            
            // Make sure that odd values are not in the array
            assertEquals(-1, BinarySearch.binarySearch(2 * k + 1, nums));
          }// for
      }// for
  }// testbinarySearch()

}// class BinarySearchTest
