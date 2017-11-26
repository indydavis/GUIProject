import java.io.*;
import java.util.*;
/** Indiana Davis
  * AssassinManager
  * TCSS 143B - Autumn 2013
  */
/** This program plays a game with assassins.
  * @author Indiana Davis
  * @version March 9, 2014
  */
public class AssassinManager{
   /** class Node, used to construct nodes to be accessed by the program.
     */
   private static class Node{
      public String assassin;
      public String killedBy;
      public Node next;
   }
   
   Node graveyard;
   Node killRing;
   /** mehtod AssassinManager, constructs a killRing with the given names and a null graveyard.
     * @param names, used to get the names of the people for the killRing.
     */
   public AssassinManager(final String[] names){
      if(names == null || names.length == 0){
         throw new IllegalArgumentException();
      }
      killRing = new Node();
      killRing.assassin = new String(names[0]);
      Node pos = killRing;
      for (int i = 1; i < names.length; i++){
         pos.next = new Node();
         pos = pos.next;
         pos.assassin = new String(names[i]);
      }
      pos.next = killRing;
      graveyard = null;
   }
   /** method printKillRing, prints out what is in the killRing.
     */
   void printKillRing(){
      Node ptr = killRing.next;
      System.out.println(killRing.assassin + " is targeting " + ptr.assassin);
      while (ptr != killRing){
         System.out.println(ptr.assassin + " is targeting " + ptr.next.assassin);
         ptr = ptr.next;
      }
      System.out.println();
   }
   /** method printGraveyard, prints out what is in the graveyard.
     */
   void printGraveyard(){
      Node ptr = graveyard;
      while (ptr != null){
         System.out.println(ptr.assassin + " was killed by " + ptr.killedBy);
         ptr = ptr.next;
      }
   }
   /** method killRingContains, checks to see if the given name is in the killRing.
     * @param name, used to get the name of the person being checked.
     */
   boolean killRingContains(String name){
      boolean found = killRing.assassin.compareToIgnoreCase(name) == 0;
      Node temp = killRing;
      while(!found && temp.next != killRing){
         found = temp.next.assassin.compareToIgnoreCase(name) == 0;
         temp = temp.next;
      }
      return found;
   }
   /** method graveyardContains, checks to see if the given name is in the graveyard.
     * @param name, used to get the name of the person being checked.
     */
   boolean graveyardContains(String name){
      boolean found = false;
      Node temp = graveyard;
      while(temp != null && !found){
         found = temp.assassin.compareToIgnoreCase(name) == 0;
         temp = temp.next;
      }
      return found;
   }
   /** method isGameOver, checks to see if their is only one person in the killRing.
     */
   boolean isGameOver(){
      return killRing == killRing.next;
   }
   /** method getWinner, used to get the name of the winner.
     */
   String getWinner(){
      return killRing.assassin;
   }
   /** method kill, uses the name to kill the person in the killRing.
     * @param name, used to get the name of the person being killed.
     */
   void kill(String name){
      if(!killRingContains(name)){
         throw new IllegalArgumentException();
      }else if(isGameOver()){
         throw new IllegalStateException();
      }
      boolean found = name.equalsIgnoreCase(killRing.next.assassin);
      Node pointer = killRing;
      while(!found && pointer.next != killRing){
         pointer = pointer.next;
         found = name.equalsIgnoreCase(pointer.next.assassin);
      }
      if(pointer.next == killRing){
         killRing = killRing.next;
      }
      Node temp = pointer.next;
      temp.killedBy = pointer.assassin;
      pointer.next =  pointer.next.next;
      temp.next = graveyard;
      graveyard = temp;
   }
}