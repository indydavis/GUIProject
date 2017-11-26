import java.util.*;
import java.io.*;
/** Indiana Davis
  * Shape
  * TCSS 143B - Winter 2013
  */
/** This program preforms various tasks for book upkeep.
  * @author Indiana Davis
  * @version January 8, 2013
  */
public class Assignment4{

   public static void main(String[] args){
      List<Shape> myList = new LinkedList<Shape>();
      Scanner inputFile = null;
      PrintStream outputFile = null;
      try{
         inputFile = new Scanner(new File("In4.txt"));
         outputFile = new PrintStream(new File("out4.txt"));
      }catch (Exception e){
         System.out.println("Difficulties opening the file!  " + e);
         System.exit(1);
      }
      while(inputFile.hasNextLine()){
            int count  = 0;
            Scanner input = new Scanner(inputFile.nextLine());
            ArrayList<Double> temp = new ArrayList<Double>();
            boolean goodData = true;
            while(input.hasNext() && goodData){
               if(input.hasNextDouble()){
                  temp.add(input.nextDouble());
                  count++;
               }else{
                  goodData = false;
               }
            }
            if(goodData){
            try{
               if(count == 1){
                  double newRadius = temp.get(0);
                  Circle circ = new Circle(newRadius);
                  myList.add(circ);
               }else if(count == 2){
                  double newLength = temp.get(0);
                  double newWidth = temp.get(1);
                  Rectangle rec = new Rectangle(newLength, newWidth);
                  myList.add(rec);
               }else if(count == 3){
                  double newSideA = temp.get(0);
                  double newSideB = temp.get(1);
                  double newSideC = temp.get(2);
                  Triangle tri = new Triangle(newSideA, newSideB, newSideC);
                  myList.add(tri);
               }
            }catch(IllegalArgumentException e){
               System.out.println("Illegal argument given.");
            }
         }
      }
      outputFile.println("Original List[unsorted]:");
      List<Shape> copyList = new ArrayList<Shape>(myList);
      for(int i = 0; i < myList.size(); i++){
         outputFile.println(myList.get(i) + "\n");
      }
      outputFile.println();
      outputFile.println("Copied List[sorted]:");
      Collections.sort(copyList);
      for(int i = 0; i < myList.size(); i++){
         outputFile.println(copyList.get(i) + "\n");
      }
      outputFile.println();
      outputFile.println("Original List[unsorted]:");
      for(int i = 0; i < myList.size(); i++){
         outputFile.println(myList.get(i) + "\n");
      }
   }
}