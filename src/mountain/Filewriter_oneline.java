package mountain;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter_oneline {
	 static String homeDir = System.getProperty("user.home");
  public static void main(String str) {
    try {
      FileWriter writer = new FileWriter(homeDir +"/ittia1_chart/addjar_ittia5/hitto/bp/bpoutput",true);
      writer.write(str+"\n");
      writer.close();
      System.out.println("String written to file.");
    } catch (IOException e) {
      System.out.println("An error occurred while writing to file.");
      e.printStackTrace();
    }
  }
//    public static void read_write_file(String[] args) {
//      try {
//        FileReader reader = new FileReader("input.txt");
//        FileWriter writer = new FileWriter("output.txt");
//
//        int c;
//        while ((c = reader.read()) != -1) {
//          writer.write(c);
//        }
//
//        reader.close();
//        writer.close();
//
//        System.out.println("File copied.");
//      } catch (IOException e) {
//        System.out.println("An error occurred while copying the file.");
//        e.printStackTrace();
//      }
//    }
  }

