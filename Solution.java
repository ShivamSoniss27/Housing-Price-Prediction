import java.lang.Object.*;
import java.util.*;
public class Solution {
    public static boolean isAnagram(String a,String b) {
        if (a.length() != b.length()) {
            return false;
        }

        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (hash.containsKey(a.charAt(i))) {
                hash.replace(a.charAt(i), hash.get(a.charAt(i)), hash.get(a.charAt(i)) + 1);
            } else {
                hash.put(a.charAt(i), 1);
            }
        }
        for(int i=0;i<b.length();i++){
            if (hash.containsKey(a.charAt(i))) {
                hash.replace(a.charAt(i), hash.get(a.charAt(i)), hash.get(a.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        for(int i=0;i<hash.size();i++){
            if(hash.get(i) != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
     String a = "b";
     String b = "d";
     System.out.print(isAnagram(a, b));

    }
}