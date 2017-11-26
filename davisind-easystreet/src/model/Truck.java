/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

/**
 * @author indyd_000
 * @version 1
 */
public class Truck extends AbstractVehicle {

    /**
     * 
     */
    private Direction myDirection;

    /**
     * @param theXValue used to get the x value.
     * @param theYValue used to get the y value.
     * @param theDirection used to get the direction of the human.
     */
    public Truck(final int theXValue, final int theYValue, final Direction theDirection) {
        super(theXValue, theYValue, theDirection, 0);
    }
    
    /**
     * 
     * @param theNeighbors used to get the direction and terrain the vehicle is on.
     * @return direction used to get the direction of vehicle movement.
     */
    public Direction chooseDirection(final Map<Direction, Terrain> theNeighbors) {
        int number = 3;
        final Random rand = new Random();
        int value = rand.nextInt(number);
        final ArrayList<Direction> thisArray = new ArrayList<Direction>();
        thisArray.add(0, getDirection());
        thisArray.add(1, getDirection().left());
        thisArray.add(2, getDirection().right());
        while (!thisArray.isEmpty() && !canPass(theNeighbors.get(myDirection), Light.GREEN)) {
            myDirection = getDirection().reverse();
            if (value == 0 && canPass(theNeighbors.get(thisArray.get(0)), Light.GREEN)) {
                myDirection = thisArray.get(0);
            } else if (value == 1 && canPass(theNeighbors.get(thisArray.get(1)),
                                              Light.GREEN)) {
                myDirection = thisArray.get(1);
            } else if (value == 2 && canPass(theNeighbors.get(thisArray.get(2)),
                                              Light.GREEN)) {
                myDirection = thisArray.get(2);
            }
            thisArray.remove(value);
            number--;
            value = rand.nextInt(number);
        }
        return myDirection;
    }
    
    /**
     * @param theTerrain used to get the terrain type.
     * @param theLight used to get the light color.
     * @return test used to determine if the vehicle can move to that space.
     */
    public boolean canPass(final Terrain theTerrain, final Light theLight) {
        boolean pass = false;
        if (theTerrain == Terrain.STREET || theTerrain == Terrain.LIGHT) {
            pass = true;
        }
        return pass;
    }
    
    /**
     * @param theOther used to get the collided vehicle.
     */
    public void collide(final Vehicle theOther) {
        super.collide(theOther);
    }
    
    /**
     * 
     * @return name used to get the vehicle name.
     */
    public String getImageFileName() {
        return "truck.gif";
    }
    
    /**
     * 
     * @return death used to get time of death.
     */
    public int getDeathTime() {
        return super.getDeathTime();
    }
    
    /**
     * 
     * @return direction returns the direction of the vehicle.
     */
    public Direction getDirection() {
        return super.getDirection();
    }
    
    /**
     * 
     * @return myX used to get the x value.
     */
    public int getX() {
        return super.getX();
    }
    
    /**
     * 
     * @return myY used to get the y value.
     */
    public int getY() {
        return super.getY();
    }
    
    /**
     * @return test used to see if vehicle is alive.
     */
    public boolean isAlive() {
        return super.isAlive();
    }
    
    /**
     * 
     */
    public void poke() {
        super.poke();
    }
    
    /**
     * 
     */
    public void reset() {
        super.reset();
    }
    
    /**
     * 
     * @param theDir used to set the direction of the vehicle.
     */
    public void setDirection(final Direction theDir) {
        super.setDirection(theDir);
    }
    
    /**
     * 
     * @param theX used to get the x value.
     */
    public void setX(final int theX) {
        super.setX(theX);
    }
   
   /**
    * 
    * @param theY used to get the y value.
    */
    public void setY(final int theY) {
        super.setY(theY);
    }
    
    /**
     * @return returnMe gets the string for this object.
     */
    public String toString() {
        return super.toString();
    }
}
