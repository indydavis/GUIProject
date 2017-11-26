/**
 * 
 */
package model;

import java.util.Map;

/**
 * @author indyd_000
 * @version 1
 */
public class Bicycle extends AbstractVehicle {

    /**
     * 
     */
    private Direction myDirection;

    /**
     * @param theXValue used to get the x value.
     * @param theYValue used to get the y value.
     * @param theDirection used to get the direction of the human.
     */
    public Bicycle(final int theXValue, final int theYValue, final Direction theDirection) {
        super(theXValue, theYValue, theDirection, 20);
    }
    
    /**
     * 
     * @param theNeighbors used to get the direction and terrain the vehicle is on.
     * @return direction used to get the direction of vehicle movement.
     */
    public Direction chooseDirection(final Map<Direction, Terrain> theNeighbors) {
        if (theNeighbors.get(getDirection().left()) == Terrain.TRAIL) {
            myDirection = getDirection().left();
        } else if (theNeighbors.get(getDirection().right()) == Terrain.TRAIL) {
            myDirection = getDirection().right();
        } else if (theNeighbors.get(getDirection()) == Terrain.STREET
                        || theNeighbors.get(getDirection()) == Terrain.LIGHT) {
            myDirection = getDirection();
        } else if (theNeighbors.get(getDirection().left()) == Terrain.STREET
                        || theNeighbors.get(getDirection().left()) == Terrain.LIGHT) {
            myDirection = getDirection().left();
        }
        return myDirection;
    }
    
    /**
     * 
     * @param theTerrain used to get the terrain type.
     * @param theLight used to get the light color.
     * @return test used to determine if the vehicle can move to that space.
     */
    public boolean canPass(final Terrain theTerrain, final Light theLight) {
        boolean pass = false;
        if (theTerrain == Terrain.LIGHT && theLight == Light.GREEN) {
            pass = true;
        } else if (theTerrain == Terrain.STREET || theTerrain == Terrain.TRAIL) {
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
        String image;
        if (isAlive()) {
            image = "bicycle.gif";
        } else {
            image = "bicycle_dead.gif";
        }
        return image;
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
     * 
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