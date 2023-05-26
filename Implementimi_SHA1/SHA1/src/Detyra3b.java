import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Detyra3b {
    public static void main(String[] args) {
        String[] elements = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
        };
        
        int variationLength = 6;
        generateVariations(elements, variationLength, new String[variationLength], 0);
    }

    private static void generateVariations(String[] elements, int variationLength, String[] js, int currentIndex) {
        if (currentIndex == variationLength) {
            String variationString = "C"+arrayToString(js);;
           // String n = (String)variationString;
           // System.out.println(n);
           String hashCode = getHexHashCode(variationString).toUpperCase();

           System.out.println(variationString + " - Hash Code: " + hashCode);
          // String hashCode1 = "4BAFE69C";
           if(hashCode.equals("4BAFE69C")){
           System.out.println(variationString + " - Hash Code: " + hashCode);
           System.exit(1);
           }
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            js[currentIndex] = elements[i];
            generateVariations(elements, variationLength, js, currentIndex + 1);
        }
    }
    private static String arrayToString(String[] elements) {
        return String.join("",elements);
    }

    private static String getHexHashCode(String input) {
        int hashCode = input.hashCode();
        String hexString = Integer.toHexString(hashCode);
        return hexString;
    }
}