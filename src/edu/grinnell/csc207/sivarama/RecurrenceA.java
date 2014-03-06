package edu.grinnell.csc207.sivarama;

public class RecurrenceA
{

  // f0(1) = 1. f0(n) = n + f0(n/2).
  
  /**
   * f(1) = 1
   * f(2) = 3
   * f(4) = 7
   * f(8) = 15
   * f(16) = 31
   * 
   * Closed Form:
   * f0(n) = 2(n) - 1
   */

  // f1(1) = 1. f1(n) = n + f1(n-1).
  
  /**
   * f(1) = 1
   * f(2) = 3
   * f(3) = 6
   * f(4) = 10
   * f(5) = 15
   * f(6) = 21
   * 
   * Closed Form:
   * f1(n) = (n/2)(n+1)
   */
  
  // f2(1) = 1. f2(n) = c + f2(n-1), for some constant c.
  
  /**
   * f(1) = 1
   * f(2) = c + 1
   * f(3) = 2c + 1
   * f(4) = 3c + 1
   * f(5) = 4c + 1
   * 
   * Closed Form:
   * f2(n) = (n-1)c + 1
   */
  
  //f3(1) = 1. f3(n) = c + f3(n/2), for some constant c.
  
  /**
   * f(1) = 1
   * f(2) = c + 1
   * f(4) = 2c + 1
   * f(8) = 3c + 1
   * f(16) = 4c + 1
   * f(32) = 5c + 1
   * 
   * Closed Form
   * f3(n) = (n/2)c + 1
   */
  
  //f4(1) = 1. f4(n) = n + 2*f4(n/2).
  
  /**
   * f(1) = 1
   * f(2) = 2 + 2(1) = 4
   * f(4) = 4 + 2(4) = 12
   * f(8) = 8 + 2(12) = 32
   * f(16) = 16 + 2(32) = 80
   * 
   * Closed Form:
   * [Not Sure]
   */
  
  //f5(1) = 1. f5(n) = c + 2*f5(n/2), for some constant c.
  
  /**
   * f(1) = 1
   * f(2) = c + 2
   * f(4) = c + 2(c+2) = 3c + 4
   * f(8) = c + 2(3c+4) = 7c + 8
   * f(16) = c + 2(7c+8) = 15c + 16
   * 
   * Closed Form:
   * f5(n) = (n-1)c + n
   */

  //f6(1) = 1. f6(n) = c + 2*f6(n-1), for some constant c.
  
  /**
   * f(1) = 1
   * f(2) = c + 2
   * f(3) = c + 2(c+2) = 3c + 4
   * f(4) = c + 2(3c+4) = 7c + 8
   * f(5) = c + 2(7c+8) = 15c + 6
   * 
   *OBSERVATIONS
   *f6(2) = f5(2)
   *f6(3) = f5(4)
   *f6(4) = f5(8)
   *f6(5) = f5(15)
   *
   *Closed Form:
   *f6(n) = (c+1)2^(n-1) - c
   */
  
}// class RecurrenceA
