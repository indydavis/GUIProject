/*
 * TCSS 305 - ItemOrder used in the shopping GUI.
 */

package model;

import java.math.BigDecimal;
/**
  * @author indyd_000
  * @version 1
  */
public final class ItemOrder {
    /**
      * 
      */
    private Item myItem;
    /**
     * 
     */
    private int myQuantity;
    /**
      * @param theItem used to get the item object.
      * @param theQuantity used to get the item quantity.
      */
    public ItemOrder(final Item theItem, final int theQuantity) {
        this.myItem = theItem;
        this.myQuantity = theQuantity;
    }

    /**
      * @return total the total amount of the order.
      */
    public BigDecimal calculateOrderTotal() {
        return myItem.calculateItemTotal(myQuantity);
    }



    /**
      * @return myItem returns the item object.
      */
    public Item getItem() {
        return myItem;
    }

    /**
     * @return myItem used to get the item and price.
     */
    @Override
    public String toString() {
        return myItem + ": " + calculateOrderTotal();
    }

}
