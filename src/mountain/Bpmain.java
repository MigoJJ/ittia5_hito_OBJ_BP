package mountain;

import java.util.ArrayList;

public class Bpmain {
	  static String bp1 = "at GDS, ";
	  static String bp2,bp3,bp4;
	  static String bp5 = "Regular ";
	  static String bp6 = "BP checked at left seated position, measuring \n";
	  static String bp7;
  public static void main(String[] args) {
	  ArrayList<String> result = Bp_ArrayListInput.getStrings();
	  System.out.println("Inputs: " + result);
	    for (int i = 0; i < result.size(); i++) {
			if (result.get(i).startsWith("h")) {
				bp1 = "at home, ";
			}else if (result.get(i).startsWith("i")) {
				bp5 = "irRegular ";
			}else if (result.get(i).startsWith("r")) {
				bp6 = "BP checked at right seated position, measuring \n";
			}else {
			}
	    } 
        result.remove("h");
        result.remove("i");
        result.remove("r");
        
        if (result.size() < 2) {
        	Bpmain.bpclassifyNo(result.get(0));
            System.out.println(bp1 +bp2);
        }
        else if (result.size() < 3) {
        	Bpmain.bpclassifyNo(result.get(0),result.get(1));
            System.out.println(bp1 + bp2);
        }
        else if (result.size() < 4) {
        	Bpmain.bpclassifyNo(result.get(0),result.get(1),result.get(2));
            System.out.println(bp1 + bp6 + bp2 + bp5 );
        }else {
        }
  }

	private static String bpclassifyNo(String bbp2) {
		bp2 = ("SBP [ " +bbp2 + " ] mmHg h"
				+ "i"
				+ "r");	
		return bp2;
	}
	private static String bpclassifyNo(String bbp2, String bbp3) {
		bp2 = ("BP [ " +bbp2 + " / " + bbp3 + " ] mmHg ");	
		return bp2;
	}
	private static String bpclassifyNo(String bbp2,String bbp3, String bbp4) {
		bp2 = ("BP [ " +bbp2 + " / " + bbp3 + " ] mmHg" + " PR " + bbp4+ " /min ");	
		return bp2;
	}

}
