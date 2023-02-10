package mountain;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_delete_new {
	  static String homeDir = System.getProperty("user.home");
	  static String fhomeDir = homeDir + "/ittia1_chart/addjar_ittia5/hitto/bp/bpoutput";
  public static void main(String[] args) {
    try {
    	File file = new File(fhomeDir);
    	file.delete();
    	
      FileWriter writer = new FileWriter(fhomeDir);
      writer.write("");
      writer.close();
      System.out.println("File created.");
    } catch (IOException e) {
      System.out.println("An error occurred while creating the file.");
      e.printStackTrace();
    }
  }
}
