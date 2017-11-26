/**
 * 
 */
package model;

import java.util.Map;

/**
 * @author indyd_000
 * @version 1
 */
public abstract class AbstractVehicle implements Vehicle {
    
    /**
     * 
     */
    private Direction myDirection;
    /**
     * 
     */
    private Direction myResetDirection;
    /**
     * 
     */
    private int myX;
    /**
     * 
     */
    private int myResetX;
    /**
     * 
     */
    private int myY;
    /**
     * 
     */
    private int myResetY;
    /**
     * 
     */
    private Terrain myTerrain;
    /**
     * 
     */
    private int myDeathTime;
    /**
     * 
     */
    private boolean myAlive;
    /**
     * 
     */
    private int myCounter;
    
    /**
     * @param theXValue used to get the x value.
     * @param theYValue used to get the y value.
     * @param theDirection used to get the direction of the human.
     * @param theDeathTime used to get the death time.
     */
    public AbstractVehicle(final int theXValue, final int theYValue,
                           final Direction theDirection, final int theDeathTime) {
        this.myX = theXValue;
        this.myY = theYValue;
        this.myDirection = theDirection;
        this.myTerrain = Terrain.STREET;
        this.myDeathTime = theDeathTime;
        this.myResetDirection = getDirection();
        this.myResetX = getX();
        this.myResetY = getY();
        this.myAlive = true;
    }
    /**
     * @param theNeighbors used to get the direction and terrain the vehicle is on.
     * @return direction used to get the direction of vehicle movement.
     */
    public Direction chooseDirection(final Map<Direction, Terrain> theNeighbors) {
        myDirection = Direction.random();
        while (!canPass(theNeighbors.get(myDirection), Light.GREEN)) {
            myDirection = Direction.random();
        }
        return myDirection;
    }
    
    /**
     * @param theTerrain used to get the terrain type.
     * @param theLight used to get the light color.
     * @return test used to determine if the vehicle can move to that space.
     */
    public boolean canPass(final Terrain theTerrain, final Light theLight) {
        boolean pass = true;
        if (theTerrain != myTerrain) {
            pass = false;
        }
        return pass;
    }
    
    /**
     * @param theOther used to get the collided vehicle.
     */
    public void collide(final Vehicle theOther) {
        if (isAlive() && theOther.isAlive() && getDeathTime() > theOther.getDeathTime()) {
            myAlive = false;
        }
    }
    
    /**
     * @return name used to get the vehicle name.
     */
    public String getImageFileName() {
        String image;
        if (isAlive()) {
            image = "human.gif";
        } else {
            image = "human_dead.gif";
        }
        return image;
    }
    
    /**
     * @return death used to get time of death.
     */
    public int getDeathTime() {
        return myDeathTime;
    }
    
    /**
     * @return direction returns the direction of the vehicle.
     */
    public Direction getDirection() {
        return myDirection;
    }
    
    /**
     * @return myX used to get the x value.
     */
    public int getX() {
        return myX;
    }
    
    /**
     * @return myY used to get the y value.
     */
    public int getY() {
        return myY;
    }
    
    /**
     * @return test used to see if vehicle is alive.
     */
    public boolean isAlive() {
        return myAlive;
    }
    
    /**
     * 
     */
    public void poke() {
        myCounter += 1;
        if (myCounter == myDeathTime) {
            myAlive = true;
            setDirection(Direction.random());
            myCounter = 0;
        }
    }
    
    /**
     * 
     */
    public void reset() {
        setX(myResetX);
        setY(myResetY);
        setDirection(myResetDirection);
        myAlive = true;
        myCounter = 0;
    }
    
    /**
     * @param theDir used to set the direction of the vehicle.
     */
    public void setDirection(final Direction theDir) {
        this.myDirection = theDir;
    }
    
    /**
     * @param theX used to get the x value.
     */
    public void setX(final int theX) {
        this.myX = theX;
    }
   
   /**
    * @param theY used to get the y value.
    */
    public void setY(final int theY) {
        this.myY = theY;
    }
    
    /**
     * @return returnMe gets the string for this object.
     */
    public String toString() {
        String returnMe = "";
        if (!isAlive()) {
            returnMe += getClass().getName();
            returnMe += " " + myCounter;
        } else {
            returnMe += getClass().getName();
        }
        return returnMe;
    }
}