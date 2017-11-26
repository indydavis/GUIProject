import java.util.*;
import java.io.*;
/** Indiana Davis
  * LostPuppy
  * TCSS 142B - Autumn 2013
  */
/** This program links up with PuppyPlay.java to play a game with a lost puppy.
  * @author Indiana Davis
  * @version January 7, 2014
  */
public class LostPuppy{

   private char[][] hidingPlaces;
   private int floorLocation;
   private int roomLocation;
   private char winner = ' ';
   private boolean found = false;
   /** method LostPuppy, used to create the building and hide the puppy.
     * @param int, used to collect the number of floors in the building.
     * @param int, used to collect the number of rooms in the building.
     */
   public LostPuppy(int floors, int rooms){
      Random rand = new Random();
      Random rand2 = new Random();
      floorLocation = rand.nextInt(floors - 1);
      roomLocation = rand2.nextInt(rooms - 1);
      hidingPlaces = new char[floors][rooms];
      for(int row = hidingPlaces.length - 1; row >= 0; row--){
         for(int col = 0; col <= hidingPlaces[0].length - 1; col++){
            hidingPlaces[row][col] = ' ';
         }
      }
      hidingPlaces[floorLocation][roomLocation] = 'P';
   }
   /** method roomSearchedAlready, returns true if the room was already searched.
     * @param int, used to collect the number of floors in the building.
     * @param int, used to collect the number of rooms in the building.
     */
   public boolean roomSearchedAlready(int floor, int room){
      boolean searched = false;
      if(hidingPlaces[floor][room] == '1' || hidingPlaces[floor][room] == '2'){
         searched = true;
      }
      return searched;
   }
   /** method puppyLocation, returns true if the room being searched contains the puppy.
     * @param int, used to collect the number of floors in the building.
     * @param int, used to collect the number of rooms in the building.
     */
   public boolean puppyLocation(int floor, int room){
      if(hidingPlaces[floor][room] == 'P'){
         found = true;
      }
      return found;
   }
   /** method indicesOK, returns true if the room being searched is within the building.
     * @param int, used to collect the number of floors in the building.
     * @param int, used to collect the number of rooms in the building.
     */
   public boolean indicesOK(int floor, int room){
      boolean ok = false;
      if(floor <= hidingPlaces.length - 1){
         ok = true;
      }
      if(room <= hidingPlaces[0].length - 1){
            ok = true;
      }
      return ok;
   }
   /** method numberOfFloors, returns the number of floors in the building.
     */
   public int numberOfFloors(){
      return hidingPlaces.length;
   }
   /** method numberOfRooms, returns the number of rooms in the building.
     */
   public int numberOfRooms(){
      return hidingPlaces[0].length;
   }
   /** method searchRoom, searches the given room for the puppy and returns true if found.
     * @param int, used to collect the number of floors in the building.
     * @param int, used to collect the number of rooms in the building.
     * @param char, used to get the player number.
     */
   public boolean searchRoom(int floor, int room, char player){
      if(hidingPlaces[floor][room] == 'P'){
         found = true;
         winner = player;
      }else{
         hidingPlaces[floor][room] = player;
      }
      return found;
   }
   /** method toString, prints out the building and values depending on whether or not the puppy is found.
     */
   public String toString(){
      String print = "";
         for(int top = 0; top <= hidingPlaces[0].length - 1; top++){
            print += (" ___");
         }
         print += "\n";
      for(int k = hidingPlaces.length - 1; k >= 0; k--){
         for(int f = 0; f <= hidingPlaces[0].length - 1; f++){
         if(found && hidingPlaces[k][f] == hidingPlaces[floorLocation][roomLocation]){
            print += ("|");
            print += winner;
            print += ("P ");
         }else if(hidingPlaces[k][f] == hidingPlaces[floorLocation][roomLocation]){
            print += ("|   ");
         }else{
            print += ("| " + hidingPlaces[k][f] + " ");
         }
         }
         print += ("|\n");
         for(int h = 0; h <= hidingPlaces[0].length - 1; h++){
            print += ("|___");
         }
         print += ("|\n");
      }
      return print;
   }
}