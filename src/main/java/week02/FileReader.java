package week02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

  public static void main(String[] args) {


    FileReader fileReader = new FileReader();

    Scanner scan = new Scanner(System.in);

    String filename = "myFile.txt";
    File f = new File(filename);

    Scanner fileIn = null;

    boolean loop = true;

    try {
      if (f.createNewFile()) {
        System.out.println(filename + " created successfully!");
      } else {
        System.out.println(filename + " already exists.");
      }
      fileIn = new Scanner(f);

    } catch (FileNotFoundException e) {
      System.out.println("could not find " + filename);
    } catch (IOException e) {
      System.out.println("Problem arose when creating " + filename);
      e.printStackTrace();
    }

    while(fileIn != null && fileIn.hasNext()){
      String input = fileIn.nextLine();
      System.out.println(input);
      fileReader.listing(input.split(","));
    }


/*    while (loop) {
      System.out.print("Enter something (zz to exit): ");
      String input = scan.nextLine();

      if (input.trim().equalsIgnoreCase("zz")) {
        loop = false;
        continue; // or break;
      }
      System.out.println("You entered " + input);

    }*/
  }
}//End of the class



  private void listing(String[] items){
    for (String s : items){
      System.out.println(s.trim());
    }

  }

}