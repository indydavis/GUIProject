/*
 * TCSS 305 - Item used in the shopping GUI.
 */

package model;

import java.math.BigDecimal;
import java.util.Objects;
/**
  * @author indyd_000
  * @version 1
  */
public final class Item {
    /**
      * myName used to hold the item name.
      */
    private String myName = "";
    /**
      * myPrice used to hold the item price.
      */
    private BigDecimal myPrice;
    /**
      * myBulkQuantity used to hold the bulk quantity.
      */
    private int myBulkQuantity;
    /**
      * myBulkPrice used to hold the bulk price.
      */
    private BigDecimal myBulkPrice;
    /**
      * @param theName used to get the item's name.
      * @param thePrice used to get the item's price.
      */
    public Item(final String theName, final BigDecimal thePrice) {
        this(theName, thePrice, 0, BigDecimal.ZERO);
    }

    /**
      * @param theName used to get the item's name.
      * @param thePrice used to get the item's price.
      * @param theBulkQuantity used to get the bulk quantity.
      * @param theBulkPrice used to get the bulk price.
      */
    public Item(final String theName, final BigDecimal thePrice, final int theBulkQuantity,
                final BigDecimal theBulkPrice) {
        this.myName = theName;
        this.myPrice = thePrice;
        this.myBulkQuantity = theBulkQuantity;
        this.myBulkPrice = theBulkPrice;
    }

    /**
      * @param theQuantity used to get the quantity of the item.
      * @return returns the item quantity if not negative.
      */
    public BigDecimal calculateItemTotal(final int theQuantity) {
        BigDecimal returnMe;
        if (myBulkQuantity > 0) {
            final int bulkQuantity = theQuantity / myBulkQuantity;
            final int nonBulkQuantity = theQuantity % myBulkQuantity;
            final BigDecimal bulkAmount = myBulkPrice.multiply(new BigDecimal(bulkQuantity));
            final BigDecimal nonBulkAmount = myPrice.multiply(new BigDecimal(nonBulkQuantity));
            returnMe = bulkAmount.add(nonBulkAmount);
        } else {
            returnMe = myPrice.multiply(new BigDecimal(theQuantity));
        }
        return returnMe;
    }

    /**
      * @return itemString used to get the item and price.
      */
    @Override
    public String toString() {
        String itemString = myName + ", " + myPrice;
        if (myBulkQuantity != 0) {
            itemString += "(" + myBulkQuantity + " for " + myBulkPrice + ")";
        }
        return itemString;
    }

    /**
      * @param theOther used to get the other object.
      * @return equals used to see if one object is the same as another.
      */
    @Override
    public boolean equals(final Object theOther) {
        boolean equals = false;
        if ((theOther != null) && (theOther.getClass() == getClass())) {
            final Item otherItem = (Item) theOther;
            if (Objects.equals(myName, otherItem.myName)
                            && myPrice.compareTo(otherItem.myPrice) == 0
                            && myBulkQuantity == otherItem.myBulkQuantity
                            && myBulkPrice.compareTo(otherItem.myBulkPrice) == 0) {
                equals = true;
            }
        }
        return equals;
    }

    /**
      * {@inheritDoc}
      */
    @Override
    public int hashCode() {
        return Objects.hash(myName, myPrice, myBulkQuantity, myBulkPrice);
    }

}