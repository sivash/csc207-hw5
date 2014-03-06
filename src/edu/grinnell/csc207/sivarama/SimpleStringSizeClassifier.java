package edu.grinnell.csc207.sivarama;

public class SimpleStringSizeClassifier
    implements
      StringClassifier
{
  public int classify(String val)
  {
    return val.length() - 5;
  } // classify
}// class SimplestringClassifier

