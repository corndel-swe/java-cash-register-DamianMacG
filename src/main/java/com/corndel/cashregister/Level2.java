package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level2 {
  /**
   * Goes through the given drawer and counts how many *coins* there are in total
   * 
   * <p>
   * N.b. just the number of coins, not the total value of them
   * 
   * <p>
   * N.b. $1 is a note, not a coin
   */
  public static int countCoins(List<Item> drawer) {
    int count = 0;
    for (Item item : drawer) {
      if (item.name.equals("quarter") || item.name.equals("dime") ||
              item.name.equals("nickel") || item.name.equals("penny")) {
        count += item.quantity;
      }
    }

    return count;
  }

  /**
   * Counts the total number of notes in the drawer.
   */
  public static int countNotes(List<Item> drawer) {
    int count = 0;
    for (Item item : drawer) {
      if (item.name.equals("hundred") || item.name.equals("twenty") ||
              item.name.equals("ten") || item.name.equals("five") ||
              item.name.equals("one")) {
        count += item.quantity;
      }
    }

    return count;
}}
