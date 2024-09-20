package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level4 {
  /**
   * Returns true if it is possible to make the target amount out of the cash in
   * the drawer. Returns false if it is not possible.
   */
  public static boolean canMakeAmount(int target, List<Item> drawer) {

    for (Item item : drawer) {
      int denomination = item.value;
      int availableQuantity = item.quantity;

      // So each time we iterate we are checking if we can use our highest denominations in our till towards the target.
      // If our denominations is too high for one e.g we are on dollars but need just 13cents, it skips each one until dime
      // Then it will also skip nickel after that and go to cents. If we have less than 3 then target won't equal 0, therefore return false.
      // If it was more than three it will bring our target to 0 and return true.

      int maxUsable = Math.min(target / denomination, availableQuantity);


      target -= maxUsable * denomination;

      if (target == 0) {
        return true;
      }
    }

    return false;
  }
}

