package Strings;
import java.util.*;
public class Anagrams {
    public static void main(String args[]) {
        String s1 = "Race";
        String s2 = "Car";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("length same ah ila");
        }
        else{
            HashMap<Character, Integer> mp1 = new HashMap<>();
            HashMap<Character, Integer> mp2 = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                if (mp1.containsKey(s1.charAt(i))) {
                    mp1.put(s1.charAt(i), mp1.get(s1.charAt(i)) + 1);
                }
                else {
                    mp1.put(s1.charAt(i), 1);
                }
            }

            for (int i = 0; i < s2.length(); i++) {

                if (mp2.containsKey(s2.charAt(i))) {
                    mp2.put(s2.charAt(i), mp2.get(s2.charAt(i)) + 1);
                }
                else {
                    mp2.put(s2.charAt(i), 1);
                }
            }
            if(mp1.equals(mp2)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("anagram illa");
            }
        }

        }
    }


