package model;

import java.util.Map;

/**
 * @author indyd_000
 * @version 1
 */
public class Human extends AbstractVehicle {

    /**
     * 
     */
    private Direction myDirection;
    /**
     * 
     */
    private Terrain myTerrain;
    /**
     * 
     */
    private boolean myAlive;

    /**
     * @param theXValue used to get the x value.
     * @param theYValue used to get the y value.
     * @param theDirection used to get the direction of the human.
     * @param theTerrain used to get the terrain type.
     */
    public Human(final int theXValue, final int theYValue, final Direction theDirection,
                 final Terrain theTerrain) {
        super(theXValue, theYValue, theDirection, 50);
        this.myTerrain = theTerrain;
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
        boolean pass = false;
        if (myTerrain == Terrain.STREET && (theTerrain == Terrain.STREET
                        || theTerrain == Terrain.LIGHT)) {
            pass = true;
        } else if (theTerrain == myTerrain) {
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
        return super.getDeathTime();
    }
    
    /**
     * @return direction returns the direction of the vehicle.
     */
    public Direction getDirection() {
        return super.getDirection();
    }
    
    /**
     * @return myX used to get the x value.
     */
    public int getX() {
        return super.getX();
    }
    
    /**
     * @return myY used to get the y value.
     */
    public int getY() {
        return super.getY();
    }
    
    /**
     * @return myAlive used to see if vehicle is alive.
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
     * @param theDir used to set the direction of the vehicle.
     */
    public void setDirection(final Direction theDir) {
        super.setDirection(theDir);
    }
    
    /**
     * @param theX used to get the x value.
     */
    public void setX(final int theX) {
        super.setX(theX);
    }
   
   /**
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