package edu.grinnell.csc207.sivarama;

/**
 * Skip lists of strings, stored alphabetically.
 */
public class SkipListOfStrings
    implements
      SetOfStrings
{
  public String value;
  public static int MAX_LEVEL = 5;
  public int[] levels = new int[MAX_LEVEL];
  

  public boolean contains(String str)
  {
    for(int level = 0; level < MAX_LEVEL; level++)
      {
        if(str.equals(value))
            {
              return true;
            }// if
      }// for
    return false;
  }// contains(String)

  public void add(String str)
  {
    int level = 0;
    for(int i = 1; i < MAX_LEVEL; i++)
      {
        if(Math.random() > value.length())
          {
            level = i;
          }// if
      }// for
    value = str;
    levels[level] = level;
  }// add(String)

  public void remove(String str)
  {
    if(contains(str))
      {
        // Not exactly sure how to implement this.
      }// if
  }// remove(String)

} // class SkipListOfStrings
