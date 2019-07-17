/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;

/**
 *
 * @author droro
 */
public class MOrseCode {

    public static void main(String[] args) {
        String[] arr = {"gin", "zen", "gig", "msg"};
       int l = uniqueMorseRepresentations(arr);
        System.out.println(l);
    }

    public static String TX(String word) {

        String[] arr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        int tam = arr.length;
        int lastUni = "z".codePointAt(0);
        String rel = "";
        for (int i = 0; i < word.length(); i++) {
            int pos = tam - (lastUni - word.codePointAt(i));

            rel += arr[pos - 1];
        }

        return rel;

    }

    public static int uniqueMorseRepresentations(String[] words) {

      //  String[] arr = new String[words.length];
        HashSet<String> s = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            s.add(TX(words[i]));

        }
        return s.size();
    }
    
  
    
    
    
    

}
