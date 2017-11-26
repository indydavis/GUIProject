/*
 * TCSS 305 - ShoppingCart used in the shopping GUI.
 */

package model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
/**
  * @author indyd_000
  * @version 1
  */
public class ShoppingCart {
    
    /**
      * 
      */
    private Map<ItemOrder, Integer> myItems;
    /**
     * 
     */
    private boolean myMembership;
    /**
      * 
      */
    public ShoppingCart() {
        myItems = new HashMap<ItemOrder, Integer>();
    }

    /**
      * @param theOrder used to get the Items in the order.
      */
    public void add(final ItemOrder theOrder) {
        if (myItems.containsKey(theOrder)) {
            final int count = myItems.get(theOrder);
            myItems.put(theOrder, count + 1);
        } else {
            myItems.put(theOrder, 1);
        }
    }

    /**
      * @param theMembership checks to see if the person has a membership.
      */
    public void setMembership(final boolean theMembership) {
        myMembership = theMembership;
    }

    /**
      * @return total used to get the total value of the items. 
      */
    public BigDecimal calculateTotal() {
        final double discount = .1;
        final int minimum = 20;
        int value;
        final BigDecimal total;
        value = myItems.calculateOrderTotal().intValue();
        if (myMembership && value > minimum) {
            value -= value / discount;
        }
        total = new BigDecimal(value);
        return total;
    }


    @Override
    public String toString() {
        return calculateTotal().toPlainString();
    }

}